package Screens;
import org.junit.Assert;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
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
		public void validandoComboBoxDePesquisa()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("CONTEÚDO");
			Assert.assertEquals(conteudo.clicavelCboxSelAutor(), true); 
			Assert.assertEquals(conteudo.clicavelCboxSelFormato(), true); 
			Assert.assertEquals(conteudo.clicavelCboxSelNomeCategoria(), true); 
		}
}
