# language: pt
@Splash
Funcionalidade: Splash
  	Como: um usuário
  	Quero: passsar da abertura inicial da tela
  	Para: acessar os principais fluxos das funcionalidades

	  @ct0_Splash
	  Cenario: Validar tela Splash
		    Dado acesso a tela Splash
		    Então deve conter o texto "Politize!"
