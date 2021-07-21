package Screens;
import org.junit.Assert;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import org.junit.Test;

import com.caiomarques.core.BaseTest;
import com.caiomarques.screenObjects.MainScreen;


public class MainScreenTest extends BaseTest{
		
		private MainScreen mains = new MainScreen();
		
		@Test
		public void validandoBotaoMenu()  {
			Assert.assertEquals(mains.clicavelMenu(), true); 
		}
		
		@Test
		public void validandoMenuTopicos()  {
			mains.clicarMenu();
			
			Assert.assertEquals(mains.botaoCONTEUDO().getText(), "CONTEÚDO"); 
			Assert.assertEquals(mains.botaoSOBRE().getText(), "SOBRE NÓS"); 
			Assert.assertEquals(mains.botaoOQFAZEMOS().getText(), "O QUE FAZEMOS"); 
			Assert.assertEquals(mains.botaoFACAPARTE().getText(), "FAÇA PARTE"); 
			Assert.assertEquals(mains.botaoPROJETOS().getText(), "PROJETOS"); 
			Assert.assertEquals(mains.botaoCONTATO().getText(), "CONTATO"); 
			Assert.assertEquals(mains.botaoDOAR().getText(), "DOAR"); 
		}
		
		@Test
		public void validandoMenuSubTopicosSobreNos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("SOBRE NÓS");
			
			Assert.assertEquals(mains.botaoQUEMSOMOS(), "QUEM SOMOS");
			Assert.assertEquals(mains.botaoTRANSPARENCIA(), "TRANSPARÊNCIA");
		}
		
		@Test
		public void validandoMenuSubTopicosOqueFazemos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("O QUE FAZEMOS");
			
			Assert.assertEquals(mains.botaoATUACAO().getText(), "ATUAÇÃO EM ESCOLAS");
			Assert.assertEquals(mains.botaoCONTEUDOS().getText(), "CONTEÚDOS");
			Assert.assertEquals(mains.botaoLIDERES().getText(), "FORMAÇÃO DE LÍDERES");
			Assert.assertEquals(mains.botaoCANALYOUTUBE().getText(), "CANAL NO YOUTUBE");
			Assert.assertEquals(mains.botaoPRIVACIDADE().getText(), "POLÍTICA DE PRIVACIDADE");
		}
		
		@Test
		public void validandoMenuSubTopicosFacaParte()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("FAÇA PARTE");
			
			Assert.assertEquals(mains.botaoDOE().getText(), "DOE!");
			Assert.assertEquals(mains.botaoVOLUNTARIO().getText(), "SEJA UM VOLUNTÁRIO");
			Assert.assertEquals(mains.botaoTRABCONOSCO().getText(), "TRABALHE CONOSCO");
			Assert.assertEquals(mains.botaoREPUBLIQUE().getText(), "REPUBLIQUE OS CONTEÚDOS");
		}
		
		@Test
		public void validandoMenuSubTopicosProjetos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("PROJETOS");
			
			Assert.assertEquals(mains.botaoACADEMIAINOVA().getText(), "ACADEMIA DE INOVAÇÃO CIDADÃ");
			Assert.assertEquals(mains.botaoARTQUINTO().getText(), "ARTIGO QUINTO");
			Assert.assertEquals(mains.botaoCANVASPOLITIC().getText(), "CANVAS DE POLITICAS PUBLICAS");
			Assert.assertEquals(mains.botaoDESPOLARIZE().getText(), "DESPOLARIZE");
			Assert.assertEquals(mains.botaoDIALOGA().getText(), "DIALOGA!");
			Assert.assertEquals(mains.botaoEQUIDADE().getText(), "EQUIDADE");
			Assert.assertEquals(mains.botaoHACKATON().getText(), "HACKATON CÍVICO");
			Assert.assertEquals(mains.botaoNAOMECANC().getText(), "NÃO ME CANCELA");
		}
}
