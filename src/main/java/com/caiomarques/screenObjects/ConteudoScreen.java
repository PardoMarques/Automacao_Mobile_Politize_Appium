package com.caiomarques.screenObjects;

import static com.caiomarques.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.caiomarques.core.BaseScreen;

import io.appium.java_client.MobileElement;

public class ConteudoScreen extends BaseScreen{
	
	//Mapeamento
	By inputPesquisa = By.id("br.com.politize.politize:id/yt-search-query");
	By comboboxSelecioneAutor = By.xpath("//android.widget.Button[@text='SELECIONE']");	
	By comboboxSelecioneFormato = By.xpath("//android.widget.Button[@text='SELECIONE']");
	By comboboxSelecioneCategoria = By.xpath("//android.widget.Button[@text='SELECIONE']");
	By checkboxNome = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[5]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By checkboxFormato = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[6]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By checkboxNomeCategoria = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[7]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By buttonBUSCAR = By.xpath("//android.widget.Button[@text='BUSCAR']");
	
	public MobileElement comboboxMSelecioneAutor() {
		return getDriver().findElements(comboboxSelecioneAutor).get(0);
	}
	
	public MobileElement comboboxMSelecioneFormato() {
		return getDriver().findElements(comboboxSelecioneFormato).get(1);
	}
	
	public MobileElement comboboxMSelecioneCategoria() {
		return getDriver().findElements(comboboxSelecioneCategoria).get(2);
	}
	
	public void comboboxMSelecioneAutor(String autor) {
		esperar(2);
		String abcde = comboboxMSelecioneAutor().getText();
		System.out.println(abcde);
		comboboxMSelecioneAutor().click();
		obterElementoQueContemClasseETexto("android.widget.CheckBox",autor).click();
		comboboxMSelecioneAutor().click();
		esperar(1);
	}
	
	public void comboboxMSelecioneFormato(String formato) {
		esperar(2);
		comboboxMSelecioneFormato().click();
		obterElementoQueContemClasseETexto("android.widget.CheckBox",formato).click();
		comboboxMSelecioneFormato().click();
	}
	
	public void comboboxMSelecioneCategoria(String categoria) {
		esperar(2);
		comboboxMSelecioneCategoria().click();
		obterElementoQueContemClasseETexto("android.widget.CheckBox",categoria).click();
		comboboxMSelecioneCategoria().click();
	}
	
	public void inserirPesquisa(String texto) {
		esperarImplicitamente();
		getDriver().findElement(inputPesquisa).sendKeys(texto);
	}  
	
	public void clicarCboxSelAutor() {
		esperarImplicitamente();
		clicar(comboboxSelecioneAutor);
	} 
	
	public void clicarCboxNSelFormato() {
		esperarImplicitamente();
		clicar(comboboxSelecioneFormato);
	} 
	
	public void clicarCboxSelNomeCategoria() {
		esperarImplicitamente();
		clicar(comboboxSelecioneCategoria);
	} 
	
	public void clicarCheckboxNomeExemplo() {
		esperarImplicitamente();
		clicar(checkboxNome);
	}   
	
	public void clicarCheckboxFormatoExemplo() {
		esperarImplicitamente();
		clicar(checkboxFormato);
	}   
	
	public void clicarCheckboxNomeCategoriaExemplo() {
		esperarImplicitamente();
		clicar(checkboxNomeCategoria);
	}   
	
	public void clicarBUSCAR() {
		esperarImplicitamente();
		clicar(buttonBUSCAR);
	} 
	
	public boolean clicavelCboxSelAutor() {
		return obterStatusAtr(comboboxMSelecioneAutor(), "clickable");
	}
	
	public boolean clicavelCboxSelFormato() {
		return obterStatusAtr(comboboxMSelecioneFormato(), "clickable");
	}
	
	public boolean clicavelCboxSelNomeCategoria() {
		return obterStatusAtr(comboboxMSelecioneCategoria(), "clickable");
	}
	
}
