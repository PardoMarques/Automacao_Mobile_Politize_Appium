![Alt Appium_Politize](https://raw.githubusercontent.com/PardoMarques/Appium_Politize/master/img_01.png)

# Framework de testes automatizados <br> JAVA | APPIUM | CUCUMBER | JUNIT
<br><br>
## O Appium e o ScreenObjects
> A literatura que envolve as técnicas de amadurecimento para a qualidade de um software indica que para cada nível da Pirâmide de Testes, é necessário criar um ambiente próprio e com estrutura suficiente para as validações existentes em cada camada.

> Projetos de automação de testes para Web possuem métricas e técnicas práticas para uma padronização aceitável ao Mercado. Dentre essas técnicas e padrões, temos o Design Pattern PageObjects, que é um padrão de projeto destinado à automação de aplicações Web com interfaces gráficas. O PageObjects, como o próprio nome diz, nos norteia na organização e execução de nossas classes. Cada página de um sistema Web será separada em uma respectiva classe e seus elementos de página serão “totalmente” mapeadas a fim de alimentarem nossos métodos que vão simular todas as funcionalidades que um usuário poderia executar.

> Como uma opção equivalente, temos o ScreenObjects que tem como base, a mesma teoria e prática do PageObjects, porém com os testes voltados as telas do aplicativo. Lembrando que o framework utilizado para a automação do Mobile, o Appium, é uma extensão do framework utilizado em automação Web, o Selenium. As classes que orquestram o projeto são a BaseScreen, BaseTest e DriverFactory.
<br><br>
## Passos para executar o projeto [RESUMO]
1. Clonar o projeto em sua máquina
2. Ter instalado o Appium
3. Ter instalado o Android Studio
4. Preparar um dispositivo móvel (no caso, o emulador) para o projeto
5. Ligar o servidor do Appium
6. ✨Executar o projeto✨
<br><br>
## Dependencias utilizadas no Maven	

```

<build>
  	<plugins>
	  <plugin>
	  <groupId>org.apache.maven.plugins</groupId>
	  <artifactId>maven-compiler-plugin</artifactId>
	  <version>3.8.0</version>
	  <configuration>
	  <source>1.8</source>
	  <target>1.8</target>
	  </configuration>
	  </plugin>
 	</plugins>
 </build>

<dependencies>

	<dependency>
	    <groupId>io.appium</groupId>
	    <artifactId>java-client</artifactId>
	    <version>7.3.0</version>
	</dependency>
	
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    
	<dependency>
	    <groupId>info.cukes</groupId>
	    <artifactId>cucumber-java</artifactId>
	    <version>1.2.5</version>
	</dependency>
    
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>1.2.5</version>
    </dependency>
    
    <dependency>
	    <groupId>info.cukes</groupId>
	    <artifactId>cucumber-picocontainer</artifactId>
	    <version>1.2.5</version>
	    <scope>test</scope>
	</dependency>

</dependencies>

```

![Alt Appium_Politize](https://raw.githubusercontent.com/PardoMarques/Appium_Politize/master/ScreenObjectsUML2.jpg)
