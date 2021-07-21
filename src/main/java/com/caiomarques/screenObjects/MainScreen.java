package com.caiomarques.screenObjects;
import org.openqa.selenium.By;
import com.caiomarques.core.BaseScreen;

import io.appium.java_client.MobileElement;

import static com.caiomarques.core.DriverFactory.getDriver;

public class MainScreen extends BaseScreen{
	
	//Region - Mapeamento
	
		By btnMenu = 		By.xpath("//android.widget.Button[@text='Menu']");
		
		By btnCONTEUDO = 	By.xpath("//android.view.View[@text='CONTEÚDO']");
		By btnSOBRE = 		By.xpath("//android.view.View[@text='SOBRE NÓS']");
		By btnOQFAZEMOS = 	By.xpath("//android.view.View[@text='O QUE FAZEMOS']");
		By btnFACAPARTE =	By.xpath("//android.view.View[@text='FAÇA PARTE']");
		By btnPROJETOS = 	By.xpath("//android.view.View[@text='PROJETOS']");
		By btnCONTATO = 	By.xpath("//android.view.View[@text='CONTATO']");
		By btnDOAR = 		By.xpath("//android.view.View[@text='DOAR AGORA']");
		
		By btnQUEMSOMOS = 		By.xpath("//android.view.View[@text='QUEM SOMOS']");
		By btnTRANSPARENCIA = 	By.xpath("//android.view.View[@text='TRANSPARÊNCIA']");
		
		By btnATUACAO = 		By.xpath("//android.view.View[@text='ATUAÇÃO EM ESCOLAS']");
		By btnCONTEUDOS = 		By.xpath("//android.view.View[@text='CONTEÚDOS']");
		By btnLIDERES = 		By.xpath("//android.view.View[@text='FORMAÇÃO DE LÍDERES']");
		By btnCANALYOUTUBE = 	By.xpath("//android.view.View[@text='CANAL NO YOUTUBE']");
		By btnPRIVACIDADE = 	By.xpath("//android.view.View[@text='POLÍTICA DE PRIVACIDADE']");
		
		By btnDOE = 			By.xpath("//android.view.View[@text='DOE!']");
		By btnVOLUNTARIO = 		By.xpath("//android.view.View[@text='SEJA UM VOLUNTÁRIO']");
		By btnTRABCONOSCO = 	By.xpath("//android.view.View[@text='TRABALHE CONOSCO']");
		By btnREPUBLIQUE = 		By.xpath("//android.view.View[@text='REPUBLIQUE OS CONTEÚDOS']");
		
		By btnACADEMIAINOVA = 	By.xpath("//android.view.View[@text='ACADEMIA DE INOVAÇÃO CIDADÃ']");
		By btnARTQUINTO = 		By.xpath("//android.view.View[@text='ARTIGO QUINTO']");
		By btnCANVASPOLITIC = 	By.xpath("//android.view.View[@text='CANVAS DE POLITICAS PUBLICAS']");
		By btnDESPOLARIZE = 	By.xpath("//android.view.View[@text='DESPOLARIZE']");
		By btnDIALOGA = 		By.xpath("//android.view.View[@text='DIALOGA!']");
		By btnEQUIDADE = 		By.xpath("//android.view.View[@text='EQUIDADE']");
		By btnHACKATON = 		By.xpath("//android.view.View[@text='HACKATON CÍVICO']");
		By btnNAOMECANC = 		By.xpath("//android.view.View[@text='NÃO ME CANCELA']");
			
		By labelPorcent =	By.xpath("//android.view.View[@resource-id='fl-post-25']");
	    
		By btnExtVLibras = 	By.xpath("//android.widget.Image[@text='Conteúdo acessível em libras usando o VLibras Widget com opções dos Avatares Ícaro ou Hozana.']");
		By btnExtAcess = 	By.xpath("//android.view.View[@resource-id='real-accessability-btn']");
	
	//EndRegion
		
	//Region - Objetos de tela

		public MobileElement botaoCONTEUDO(){
		    return getDriver().findElement(btnCONTEUDO);
		}
		
		public MobileElement botaoSOBRE(){
		    return getDriver().findElement(btnSOBRE);
		}
		
		public MobileElement botaoOQFAZEMOS(){
		    return getDriver().findElement(btnOQFAZEMOS);
		}
		
		public MobileElement botaoFACAPARTE(){
		    return getDriver().findElement(btnFACAPARTE);
		}
		
		public MobileElement botaoPROJETOS(){
		    return getDriver().findElement(btnPROJETOS);
		}
		
		public MobileElement botaoCONTATO(){
		    return getDriver().findElement(btnCONTATO);
		}
		
		public MobileElement botaoDOAR(){
		    return getDriver().findElement(btnDOAR);
		}
		
		public MobileElement botaoQUEMSOMOS(){
		    return getDriver().findElement(btnQUEMSOMOS);
		}
		
		public MobileElement botaoTRANSPARENCIA(){
		    return getDriver().findElement(btnTRANSPARENCIA);
		}
		
		public MobileElement botaoATUACAO(){
		    return getDriver().findElement(btnATUACAO);
		}
		
		public MobileElement botaoCONTEUDOS(){
		    return getDriver().findElement(btnCONTEUDOS);
		}
		
		public MobileElement botaoLIDERES(){
		    return getDriver().findElement(btnLIDERES);
		}
		
		public MobileElement botaoCANALYOUTUBE(){
		    return getDriver().findElement(btnCANALYOUTUBE);
		}
		
		public MobileElement botaoPRIVACIDADE(){
		    return getDriver().findElement(btnPRIVACIDADE);
		}
		
		public MobileElement botaoDOE(){
		    return getDriver().findElement(btnDOE);
		}
		
		public MobileElement botaoVOLUNTARIO(){
		    return getDriver().findElement(btnVOLUNTARIO);
		}
		
		public MobileElement botaoTRABCONOSCO(){
		    return getDriver().findElement(btnTRABCONOSCO);
		}
		
		public MobileElement botaoREPUBLIQUE(){
		    return getDriver().findElement(btnREPUBLIQUE);
		}
		
		public MobileElement botaoACADEMIAINOVA(){
		    return getDriver().findElement(btnACADEMIAINOVA);
		}
		
		public MobileElement botaoARTQUINTO(){
		    return getDriver().findElement(btnARTQUINTO);
		}
		
		public MobileElement botaoCANVASPOLITIC(){
		    return getDriver().findElement(btnCANVASPOLITIC);
		}
		
		public MobileElement botaoDESPOLARIZE(){
		    return getDriver().findElement(btnDESPOLARIZE);
		}
		
		public MobileElement botaoDIALOGA(){
		    return getDriver().findElement(btnDIALOGA);
		}
		
		public MobileElement botaoEQUIDADE(){
		    return getDriver().findElement(btnEQUIDADE);
		}
		
		public MobileElement botaoHACKATON(){
		    return getDriver().findElement(btnHACKATON);
		}
		
		public MobileElement botaoNAOMECANC(){
		    return getDriver().findElement(btnNAOMECANC);
		}

	//EndRegion
		
	//Region - Métodos
	
		public void clicarMenu() {
			clicar(btnMenu);
		}
		
		public boolean clicavelMenu() {
			return obterStatusAtr(btnMenu, "clicável");
		}
		
		public void clicarOpcaoMenu(String topico) {
			
			switch (topico) {
				case "CONTEÚDO":
					clicar(btnCONTEUDO);
					break;
					
				case "SOBRE NÓS":
					clicar(btnSOBRE);
					break;
					
				case "O QUE FAZEMOS":
					clicar(btnOQFAZEMOS);
					break;
					
				case "FAÇA PARTE":
					clicar(btnFACAPARTE);
					break;
					
				case "PROJETOS":
					clicar(btnPROJETOS);
					break;
	
				case "CONTATO":
					clicar(btnCONTATO);
					break;
	
				case "DOAR AGORA":
					clicar(btnDOAR);
					break;
	
				default:
					System.out.println("TÓPICO INVÁLIDO");
				   	break;
			}
		}
		
		public void clicarOpcaoMenu(String topico, String subTopico) {
			
			switch (topico) {				
				case "SOBRE NÓS":
					clicar(btnSOBRE);
					switch (subTopico) {				
						case "QUEM SOMOS":
							clicar(btnQUEMSOMOS);
							break;
							
						case "TRANSPARÊNCIA":
							clicar(btnTRANSPARENCIA);
							break;
							
						default:
							System.out.println("OPÇÃO INVÁLIDA");
						   	break;
					}
					break;
					
				case "O QUE FAZEMOS":
					clicar(btnOQFAZEMOS);
					switch (subTopico) {				
						case "ATUAÇÃO EM ESCOLAS":
							clicar(btnATUACAO);
							break;
							
						case "CONTEÚDOS":
							clicar(btnCONTEUDOS);
							break;
							
						case "FORMAÇÃO DE LÍDERES":
							clicar(btnLIDERES);
							break;
							
						case "CANAL NO YOUTUBE":
							clicar(btnCANALYOUTUBE);
							break;
							
						case "POLÍTICA DE PRIVACIDADE":
							clicar(btnPRIVACIDADE);
							break;
							
						case "SOBRE NÓS":
							clicar(btnSOBRE);
							break;
							
						default:
							System.out.println("OPÇÃO INVÁLIDA");
						   	break;
					}
							
					break;
	
				case "FAÇA PARTE":
					clicar(btnFACAPARTE);
					switch (subTopico) {				
						case "DOE!":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "SEJA UM VOLUNTÁRIO":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "TRABALHE CONOSCO":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "REPUBLIQUE OS CONTEÚDOS":
							clicar(btnTRANSPARENCIA);
							break;
							
						default:
							System.out.println("OPÇÃO INVÁLIDA");
						   	break;
					}
					break;
	
				case "PROJETOS":
					clicar(btnPROJETOS);
					switch (subTopico) {				
						case "ACADEMIA DE INOVAÇÃO CIDADÃ":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "ARTIGO QUINTO":
							clicar(btnTRANSPARENCIA);
							break;
						case "CANVAS DE POLITICAS PUBLICAS":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "DESPOLARIZE":
							clicar(btnTRANSPARENCIA);
							break;
						case "DIALOGA!":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "EQUIDADE":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "HACKATON CÍVICO":
							clicar(btnTRANSPARENCIA);
							break;
							
						case "NÃO ME CANCELA":
							clicar(btnTRANSPARENCIA);
							break;
							
						default:
							System.out.println("OPÇÃO INVÁLIDA");
						   	break;
					}
					break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA");
				   	break;
			}
		}
		
	//EndRegion

}
