// Cucumber Maven pom.xml File
// Carson Pemble
// 12/16/2020

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

  <modelVersion>4.0.0</modelVersion>
  <groupId>com.edu</groupId>
  <artifactId>maven_project</artifactId>
  <version>0.0.1-SNAPSHOT</version>
    	<build>
		<sourceDirectory>src/test/java</sourceDirectory>
		<plugins>

		<plugin>

    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M4</version>
				<configuration>
					<!-- Suite testng xml file to consider for test execution -->
					<suiteXmlFiles>
						<file>src/test/java/configurationFiles/testng.xml</file>
					</suiteXmlFiles>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
  <properties>
  	<maven.compiler.source>1.8</maven.compiler.source>
  	<maven.compiler.target>1.8</maven.compiler.target>
  	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  <dependencies>

  	<dependency>
  		<groupId>org.seleniumhq.selenium</groupId>
  		<artifactId>selenium-java</artifactId>
  		<version>3.141.59</version>
  	</dependency>
  	<dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.0.0</version>
            <scope>compile</scope>
</dependency>
  	<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-server</artifactId>
    <version>3.141.59</version>
</dependency>
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>5.4.2</version>
      <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm-deps -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-jvm-deps</artifactId>
    <version>1.0.6</version>
    <scope>provided</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
 </dependencies>
</project>
