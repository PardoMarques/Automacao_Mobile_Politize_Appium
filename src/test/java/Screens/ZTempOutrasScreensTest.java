package Screens;
import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

public class ZTempOutrasScreensTest {

	@Dado("^acesso a página inicial$")
	public void acesso_a_página_inicial() {
		int numero = 1;
		assertEquals(1, numero);
	}

	@Quando("^clico no menu principal$")
	public void clico_no_menu_principal() throws Throwable {
		int numero = 2;
		assertEquals(2, numero);
	}

	@Entao("^encontro as opções de busca$")
	public void encontro_as_opções_de_busca() throws Throwable {
	    throw new PendingException();
	}
	
}
