package screenTests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.caiomarques.core.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Testando {
	
	private static AndroidDriver<MobileElement> driver;
	
	// Ao iniciar um teste, ele irá crair um motorista do zero com o aplicativo resetado
	@Before
	public void inicializarAppium() {
		driver = DriverFactory.getDriver();
	}
	
	// Ao finalizar o teste, será deletado aquele motorista para que o proximo teste possa iniciar sem cache
	@After()
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	
	@Test
	public void deveSomarDoisValores()  {
		
		
	    
	    
	    //Assert.assertEquals(labelLoading.getText(), "Politize!");  
	    
	    MobileElement btnMenu = 		driver.findElement(By.xpath("//android.widget.Button[@text='Menu']"));
	    Assert.assertEquals(btnMenu.getAttribute("clickable"), "true");
	    Assert.assertEquals(btnMenu.getAttribute("enabled"), "true");
	    btnMenu.click();
	    
	    MobileElement btnCONTEUDO = 	driver.findElement(By.xpath("//android.view.View[@text='CONTEÚDO']"));
	    MobileElement btnSOBRE = 		driver.findElement(By.xpath("//android.view.View[@text='SOBRE NÓS']"));
	    MobileElement btnOQFAZEMOS = 	driver.findElement(By.xpath("//android.view.View[@text='O QUE FAZEMOS']"));
	    MobileElement btnFACAPARTE =	driver.findElement(By.xpath("//android.view.View[@text='FAÇA PARTE']"));
	    MobileElement btnPROJETOS = 	driver.findElement(By.xpath("//android.view.View[@text='PROJETOS']"));
	    MobileElement btnCONTATO = 		driver.findElement(By.xpath("//android.view.View[@text='CONTATO']"));
	    MobileElement btnDOAR = 		driver.findElement(By.xpath("//android.view.View[@text='DOAR AGORA']"));
	    MobileElement btnOK = 			driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
	    MobileElement labelPorcent =	driver.findElement(By.xpath("//android.view.View[@resource-id='fl-post-25']"));
	    
	    MobileElement btnExtVLibras = 	driver.findElement(By.xpath("//android.widget.Image[@text='Conteúdo acessível em libras usando o VLibras Widget com opções dos Avatares Ícaro ou Hozana.']"));
	    MobileElement btnExtAcess = 	driver.findElement(By.xpath("//android.view.View[@resource-id='real-accessability-btn']"));


	    driver.quit();
	
	}

}
