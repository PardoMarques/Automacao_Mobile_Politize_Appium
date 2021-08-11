package com.caiomarques.core;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import com.caiomarques.screenObjects.SplashScreen;

public abstract class BaseTest {
	
	private SplashScreen splash = new SplashScreen();
	
	@Before()
	public void setUp() {
		splash.esperarImplicitamente();
		Assert.assertEquals("Politize!", splash.obterTitulo()); 
	}
	
	// Ao finalizar o teste, será deletado aquele motorista para que o proximo teste possa iniciar sem cache
	@After()
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
}
