package Screens;
import org.junit.Test;
import com.caiomarques.core.BaseTest;
import com.caiomarques.screenObjects.SplashScreen;
import org.junit.Assert;

public class SplashScreenTest extends BaseTest{
		
		private SplashScreen splash = new SplashScreen();
		
		@Test
		public void validandoSplash()  {
			Assert.assertEquals(splash.obterTitulo(), "Politize!"); 
		}
}
