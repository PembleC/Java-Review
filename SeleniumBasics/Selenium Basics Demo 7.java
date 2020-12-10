// Selenium Basics Demo 7
// Carson Pemble

package com.test;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo012_TakeScreenshot {
	WebDriver driver;
	String url = "http://localhost:8080/PackAndGo_v2/index.html";

	@Before
	public void setUp() {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe"); 

		//Open browser instance
		driver = new FirefoxDriver();

		//Open the AUT
		driver.get(url);

		//Declare an implicit wait which is bounded to WebDriver instance
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void test() throws Exception {
		//Click on Login
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();

		Thread.sleep(2000);
		//Enter the username
		driver.findElement(By.id("usernameLogin")).sendKeys("pgGru");

		//Enter the password
		driver.findElement(By.id("passwordLogin")).sendKeys("freezeray");

		//Click on Login button
		driver.findElement(By.id("login")).click();

		//Post login take a screenshot of the dashboard page

		//Typecast the driver reference variable with TakesScreenshot for access the methods from TakesScreenshot interface
		//getScreenshotAs method will take arguement for the output type of the file
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//Using the FileUtils class copy the generated screenshot file to any location
		FileUtils.copyFile(scrFile, new File("C:\\Users\\some_user\\Desktop\\Image.png"));

		//Click on logout link
		driver.findElement(By.linkText("LogOut")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
