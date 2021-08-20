package com.caiomarques.core;

import static com.caiomarques.core.DriverFactory.getDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

// Design Patterns: Factory/Singleton
// Vou centralizar a criação dos motoristas para que todos contenham a mesma instância do Driver
// Ou seja, em cada ponto que eu precisar do Driver, vou pedir ao DriverFactory, e irei receber a mesma instância(objeto)
public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	public static Actions getActions() {
		if(driver == null) {
			createDriver();
		}
		Actions actions = new Actions(driver);
		return actions;
	}

	@SuppressWarnings("rawtypes")
	public static TouchAction getTouchAction() {
		if(driver == null) {
			createDriver();
		}
		TouchAction touchAction = new TouchAction(driver);
		return touchAction;
	}

	private static void createDriver(){
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emuAndroid10");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "br.com.politize.politize");
	    desiredCapabilities.setCapability("appActivity", "br.com.politize.politize.SplashActivity");
	    desiredCapabilities.setCapability("no-reset"," false");
	
	    try {
	    	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    } catch(MalformedURLException e) {
	    	e.printStackTrace();
	    }
	    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
