// Selenium Basics Demo 4
// Carson Pemble

package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo006_CheckBox_RadioButton_DropdownList {

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
	public void test() throws InterruptedException {
		//Click on Login
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//Enter the username
		driver.findElement(By.id("usernameLogin")).sendKeys("pgGru");
		//Enter the password
		driver.findElement(By.id("passwordLogin")).sendKeys("freezeray");
		//Click on Login button
		driver.findElement(By.id("login")).click();

		//Find the From dropdown list and store it as a WebElement
		WebElement fromsrc = driver.findElement(By.id("fromDD"));

		//Use the select reference variable for selecting any option using index/value/visible text approach
		selectFrom.selectByIndex(1);

		//Find the From dropdown list and store it as a WebElement
		WebElement toDest = driver.findElement(By.id("toDD"));

		//Pass the reference variable for toDest as a parameter for the Select class
		Select selectTo = new Select(toDest);

		//Use the select reference variable for selecting any option using index/value/visible text approach
		selectTo.selectByValue("Hyderabad");

		//click on Search Buses button
		driver.findElement(By.id("searchBus")).click();

		//Select the Radio button Search Bus corresponding to BNGHYD2200
		driver.findElement(By.id("radio3")).click();

		//Select the Proceed to Booking button
		driver.findElement(By.id("book")).click();


	}

	@After
	public void tearDown() {
		driver.close();
	}

}
