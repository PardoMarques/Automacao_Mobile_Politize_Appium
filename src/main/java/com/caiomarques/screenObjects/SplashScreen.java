package com.caiomarques.screenObjects;

import org.openqa.selenium.By;

import com.caiomarques.core.BaseScreen;
import static com.caiomarques.core.DriverFactory.getDriver;

// Splash Screen são telas de aberturas de aplicativos móveis
public class SplashScreen extends BaseScreen{
	
	//Mapeamento
	By labelLoading = By.id("br.com.politize.politize:id/texViewSplash");
	
	public String obterTitulo() {
		esperarImplicitamente();
		return getDriver().findElement(labelLoading).getText();
	}   
}
