package com.caiomarques.screenObjects;

import static com.caiomarques.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.caiomarques.core.BaseScreen;

public class ConteudoScreen extends BaseScreen{
	
	//Mapeamento
	By inputPesquisa = By.id("br.com.politize.politize:id/yt-search-query");
	By comboboxSelecioneAutor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[5]/android.view.View[2]/android.widget.Button");	
	By checkboxNome = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[5]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By comboboxSelecioneFormato = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[6]/android.view.View[2]/android.widget.Button");
	By checkboxFormato = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[6]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By comboboxSelecioneCategoria = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[7]/android.view.View[2]/android.widget.Button");
	By checkboxNomeCategoria = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[6]/android.view.View[7]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View");
	By buttonBUSCAR = By.xpath("//android.widget.Button[@text='BUSCAR']");
	
	public void inserirPesquisa(String texto) {
		esperarImplicitamente();
		getDriver().findElement(inputPesquisa).sendKeys(texto);
	}  
	
	public void clicarCboxSelecioneAutor() {
		esperarImplicitamente();
		clicar(comboboxSelecioneAutor);
	} 
	
	public void clicarCboxNSelecioneFormato() {
		esperarImplicitamente();
		clicar(comboboxSelecioneFormato);
	} 
	
	public void clicarCboxNomeCategoria() {
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
	
	
}
