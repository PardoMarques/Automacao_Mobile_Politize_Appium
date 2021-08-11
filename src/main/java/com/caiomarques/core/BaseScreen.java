package com.caiomarques.core;


import static com.caiomarques.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;

public abstract class BaseScreen {
	
	// Uma solução para o Antipattern Constant Interface, é o simples uso do import static
	// import com.caiomarques.core.DriverFactory;
	// import static com.caiomarques.core.DriverFactory.getDriver;
	
	protected void esperarImplicitamente() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	protected void clicar(By by) {
		esperarImplicitamente();
		ExpectedConditions.elementToBeClickable(by);
		getDriver().findElement(by).click();
	}
	
	protected String retornarTexto(By by) {
		esperarImplicitamente();
		ExpectedConditions.elementToBeClickable(by);
		return getDriver().findElement(by).getText();
	}
	
	protected MobileElement obterElemPelaClasseETexto(String classe, String texto) {
		return getDriver().findElement(By.xpath("//" + classe + "[@text='" + texto + "']"));
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
