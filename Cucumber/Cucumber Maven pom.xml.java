// Cucumber Maven pom.xml File2
// Carson Pemble
// 12/16/2020

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>cucumber.testng.maven</groupId>
  <artifactId>CucumberTestNGMaven</artifactId>
  <version>0.0.1-SNAPSHOT</version>

  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>

  <build>
<plugins>
<plugin>
 <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M3</version>
<configuration>
<!-- Suite testng xml file to consider for test execution -->
  <suiteXmlFiles>
	   <file>src/test/resources/cucumbertestng.xml</file>
  </suiteXmlFiles>
  <source>1.8</source>
  <target>1.8</target>

<testFailureIgnore>true</testFailureIgnore>
</configuration>
</plugin>
</plugins>
</build>
<dependencies>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit-dep</artifactId>
    <version>4.11</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-core</artifactId>
    <version>5.4.1</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>5.4.1</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-html</artifactId>
    <version>0.2.6</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>1.2.6</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>5.4.1</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-jvm-deps</artifactId>
    <version>1.0.6</version>
</dependency>
<dependency>
    <groupId>net.masterthought</groupId>
    <artifactId>cucumber-reporting</artifactId>
    <version>5.1.1</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>gherkin</artifactId>
    <version>2.12.2</version>
    <!--  <scope>provided</scope>-->
</dependency>
<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest-core</artifactId>
    <version>2.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.14.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-server</artifactId>
    <version>3.14.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>

    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.1.0</version>
    <!--  <scope>test</scope>-->
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>5.4.2</version>
</dependency>
</dependencies>
</project>
