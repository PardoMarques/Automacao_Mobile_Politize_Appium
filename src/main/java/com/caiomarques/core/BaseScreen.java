package com.caiomarques.core;


import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Dimension;

import static com.caiomarques.core.DriverFactory.getDriver;
import static com.caiomarques.core.DriverFactory.getActions;
import static com.caiomarques.core.DriverFactory.getTouchAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BaseScreen {
	
	// Uma solução para o Antipattern Constant Interface, é o simples uso do import static
	// import com.caiomarques.core.DriverFactory;
	// import static com.caiomarques.core.DriverFactory.getDriver;
	
	public void esperar(int num) {
		try {
			Thread.sleep(num*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void esperarImplicitamente() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	protected void clicar(By by) {
		esperarImplicitamente();
		ExpectedConditions.elementToBeClickable(by);
		getDriver().findElement(by).click();
	}
	
	protected void clickDuplo(MobileElement mElem) {
		getActions()
		.doubleClick(mElem)
		.perform();
	}
	
	public void deslizarParaBaixo() {
		verticalSwipeByPercentages(20, 80, 50);
	};
	
	public void deslizarParaCima() {
		verticalSwipeByPercentages(80, 20, 50);
	};
	
	public void deslizarParaDireita() {
		horizontalSwipeByPercentage(80, 20, 50);
	};
	
	public void deslizarParaEsquerda() {
		horizontalSwipeByPercentage(20, 80, 50);
	};
	
	//Tap to an element for 250 milliseconds
	public void tapByElement (MobileElement mElem) {
    	getTouchAction()
            .tap(tapOptions().withElement(element(mElem)))
            .waitAction(waitOptions(ofMillis(250))).perform();
    }
    
    //Tap by coordinates
	public void tapByCoordinates (int x,  int y) {
    	getTouchAction()
            .tap(point(x,y))
            .waitAction(waitOptions(ofMillis(250))).perform();
    }
    
    //Press by element
	public void pressByElement (MobileElement mElem, long seconds) {
    	getTouchAction()
            .press(element(mElem))
            .waitAction(waitOptions(ofSeconds(seconds)))
            .release()
            .perform();
    }
    
    //Press by coordinates
	public void pressByCoordinates (int x, int y, long seconds) {
    	getTouchAction()
            .press(point(x,y))
            .waitAction(waitOptions(ofSeconds(seconds)))
            .release()
            .perform();
    }
    
    //Horizontal Swipe by percentages
	public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = getDriver().manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        getTouchAction()
            .press(point(startPoint, anchor))
            .waitAction(waitOptions(ofMillis(1000)))
            .moveTo(point(endPoint, anchor))
            .release().perform();
    }
    
    //Vertical Swipe by percentages
	public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = getDriver().manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        getTouchAction()
            .press(point(anchor, startPoint))
            .waitAction(waitOptions(ofMillis(1000)))
            .moveTo(point(anchor, endPoint))
            .release().perform();
    }
	
	protected String retornarTexto(By by) {
		esperarImplicitamente();
		ExpectedConditions.elementToBeClickable(by);
		return getDriver().findElement(by).getText();
	}
	
	protected MobileElement obterElementoComClasseETexto(String classe, String texto) {
		return getDriver().findElement(By.xpath("//" + classe + "[@text='" + texto + "']"));
	}
	
	protected MobileElement obterElementoQueContemClasseETexto(String classe, String texto) {
		return getDriver().findElement(By.xpath("//" + classe + "[contains(@text,'" + texto + "')]"));
	}
		
	protected MobileElement obterElementoQueContemTexto(String texto) {
		return getDriver().findElement(By.xpath("//*[contains(@text, '" + texto + "')]"));
	}
	 
	protected boolean obterStatusAtr(By by, String selecionarStatus) {
		switch (selecionarStatus) {
			case "checkable":
				return getDriver().findElement(by).getAttribute("checkable").equals("true");

			case "checked":
				return getDriver().findElement(by).getAttribute("checked").equals("true");

			case "clickable":
				return getDriver().findElement(by).getAttribute("clickable").equals("true");

			case "enabled":
				return getDriver().findElement(by).getAttribute("enabled").equals("true");

			case "focusable":
				return getDriver().findElement(by).getAttribute("focusable").equals("true");

			case "focused":
				return getDriver().findElement(by).getAttribute("focused").equals("true");

			case "scrollable":
				return getDriver().findElement(by).getAttribute("scrollable").equals("true");

			case "long-clickable":
				return getDriver().findElement(by).getAttribute("long-clickable").equals("true");

			case "password":
				return getDriver().findElement(by).getAttribute("password").equals("true");

			case "selected":
			    return getDriver().findElement(by).getAttribute("selected").equals("true");

			default:
				System.out.println("TEXTO INV�LIDO");
			   	return false;
		}
	}
	
	protected boolean obterStatusAtr(MobileElement elem, String selecionarStatus) {
		switch (selecionarStatus) {
			case "checkable":
				return elem.getAttribute("checkable").equals("true");

			case "checked":
				return elem.getAttribute("checked").equals("true");

			case "clickable":
				return elem.getAttribute("clickable").equals("true");

			case "enabled":
				return elem.getAttribute("enabled").equals("true");

			case "focusable":
				return elem.getAttribute("focusable").equals("true");

			case "focused":
				return elem.getAttribute("focused").equals("true");

			case "scrollable":
				return elem.getAttribute("scrollable").equals("true");

			case "long-clickable":
				return elem.getAttribute("long-clickable").equals("true");

			case "password":
				return elem.getAttribute("password").equals("true");

			case "selected":
			    return elem.getAttribute("selected").equals("true");

			default:
				System.out.println("TEXTO INV�LIDO");
			   	return false;
		}
	}
}
