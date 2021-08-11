![Alt Appium_Politize](https://raw.githubusercontent.com/PardoMarques/Appium_Politize/master/img_01.png)

# Framework de testes automatizados <br> JAVA | APPIUM | CUCUMBER | JUNIT
<br><br><br>
> A literatura que envolve as técnicas de amadurecimento para a qualidade de um software indica que para cada nível da Pirâmide de Testes, é necessário criar um ambiente próprio e com estrutura suficiente para as validações existentes em cada camada.

A literatura que envolve as técnicas de amadurecimento para a qualidade de um software indica que para cada nível da Pirâmide de Testes, é necessário criar um ambiente próprio e com estrutura suficiente para as validações existentes em cada camada. 
Para testes de interface gráfica (Camada de Sistemas), podemos alavancar a velocidade dos testes regressivos, gerar menos custos e aumentar a maturidade de nosso projeto quando implementamos a estrutura de testes automatizados. 

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

![Alt Appium_Politize](https://raw.githubusercontent.com/PardoMarques/Appium_Politize/master/ScreenObjectsUML.png)
