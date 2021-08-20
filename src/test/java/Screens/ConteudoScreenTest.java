package Screens;
import org.junit.Assert;
import org.junit.Test;

import com.caiomarques.core.BaseTest;
import com.caiomarques.screenObjects.ConteudoScreen;
import com.caiomarques.screenObjects.MainScreen;


public class ConteudoScreenTest extends BaseTest{
		
		private MainScreen mains = new MainScreen();
		private ConteudoScreen conteudo = new ConteudoScreen();
		
		@Test
		public void validandoBotaoMenuEmConteudo()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			Assert.assertEquals(mains.clicavelMenu(), true); 
		}
		
		@Test
		public void validandoMenuTopicos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			mains.clicarMenu();
			
			Assert.assertEquals(mains.botaoCONTEUDO().getText(), "CONTEÚDO"); 
			Assert.assertEquals(mains.botaoSOBRE().getText(), "SOBRE NÓS"); 
			Assert.assertEquals(mains.botaoOQFAZEMOS().getText(), "O QUE FAZEMOS"); 
			Assert.assertEquals(mains.botaoFACAPARTE().getText(), "FAÇA PARTE"); 
			Assert.assertEquals(mains.botaoPROJETOS().getText(), "PROJETOS"); 
			Assert.assertEquals(mains.botaoCONTATO().getText(), "CONTATO"); 
			Assert.assertEquals(mains.botaoDOAR().getText(), "DOAR AGORA"); 
		}
		
		@Test
		public void validandoMenuSubTopicosSobreNos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			mains.clicarMenu();
			mains.clicarOpcaoMenu("SOBRE NÓS");
			
			Assert.assertEquals(mains.botaoQUEMSOMOS().getText(), "QUEM SOMOS");
			Assert.assertEquals(mains.botaoTRANSPARENCIA().getText(), "TRANSPARÊNCIA");
		}
		
		@Test
		public void validandoMenuSubTopicosOqueFazemos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
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
			mains.clicarOpcaoMenu("CONTEÚDO");
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
			mains.clicarOpcaoMenu("CONTEÚDO");
			mains.clicarMenu();
			mains.clicarOpcaoMenu("PROJETOS");
			
			Assert.assertEquals(mains.botaoARTQUINTO().getText(), "ARTIGO QUINTO");
			Assert.assertEquals(mains.botaoCANVASPOLITIC().getText(), "CANVAS DE POLITICAS PUBLICAS");
			Assert.assertEquals(mains.botaoDIALOGA().getText(), "DIALOGA!");
			Assert.assertEquals(mains.botaoEQUIDADE().getText(), "EQUIDADE");
			Assert.assertEquals(mains.botaoHACKATHON().getText(), "HACKATHON CÍVICO");
			Assert.assertEquals(mains.botaoNAOMECANC().getText(), "NÃO ME CANCELA");
		}
		
		@Test
		public void validandoComboBoxDePesquisa()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			
			Assert.assertEquals(conteudo.clicavelCboxSelAutor(), true); 
			Assert.assertEquals(conteudo.clicavelCboxSelFormato(), true); 
			Assert.assertEquals(conteudo.clicavelCboxSelNomeCategoria(), true); 
		}
		
		@Test
		public void validandoFiltrarSomentePorPesquisa()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			
			Assert.assertEquals(conteudo.clicavelCboxSelAutor(), true); 
		}
		
//		@Test
//		public void validandoMutacaoSomentePorAutor()  {
//			mains.clicarMenu();
//			mains.clicarOpcaoMenu("CONTEÚDO");
//			conteudo.comboboxMSelecioneAutor("Adriana Cravo");
//			
//			Assert.assertEquals(conteudo.comboboxMSelecioneAutor().getText(), "ADRIANA CRAVO (2)"); 
//		}
//		
//		@Test
//		public void validandoMutacaoSomentePorFormato()  {
//			mains.clicarMenu();
//			mains.clicarOpcaoMenu("CONTEÚDO");
//			conteudo.comboboxMSelecioneFormato("Podcast");
//			
//			Assert.assertEquals(conteudo.comboboxMSelecioneFormato().getText(), "PODCAST (28)"); 
//		}
//
//		@Test
//		public void validandoMutacaoSomentePorCategoria()  {
//			mains.clicarMenu();
//			mains.clicarOpcaoMenu("CONTEÚDO");
//			conteudo.comboboxMSelecioneCategoria("Atualidades");
//
//			Assert.assertEquals(conteudo.comboboxMSelecioneCategoria().getText(), "ATUALIDADES (67)"); 
//		}
		
		@Test
		public void validandoFiltrarSomentePorAutor()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			conteudo.comboboxMSelecioneAutor("Adriana Cravo");
			conteudo.deslizarParaBaixo();
			conteudo.esperar(2);
			
			Assert.assertEquals(conteudo.labelMContemResposta().getText(), "Conteúdos Recentes"); 
		}
		
		@Test
		public void validandoFiltrarSomentePorFormato()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			conteudo.comboboxMSelecioneFormato("Podcast");
			conteudo.deslizarParaBaixo();
			conteudo.esperar(2);
			
			Assert.assertEquals(conteudo.labelMContemResposta().getText(), "Conteúdos Recentes"); 
		}
		
		@Test
		public void validandoFiltrarSomentePorCategoria()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			conteudo.comboboxMSelecioneCategoria("Atualidades");
			conteudo.deslizarParaBaixo();
			conteudo.esperar(2);
			
			Assert.assertEquals(conteudo.labelMContemResposta().getText(), "Conteúdos Recentes"); 
		}
}
