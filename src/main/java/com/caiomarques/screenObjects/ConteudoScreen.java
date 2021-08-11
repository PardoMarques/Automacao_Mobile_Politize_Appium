package com.caiomarques.screenObjects;

import static com.caiomarques.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.caiomarques.core.BaseScreen;

public class ConteudoScreen extends BaseScreen{
	
	//Mapeamento
	By labelLoading = By.id("br.com.politize.politize:id/texViewSplash");
	
	public String obterTitulo() {
		esperarImplicitamente();
		return getDriver().findElement(labelLoading).getText();
	}   
}
