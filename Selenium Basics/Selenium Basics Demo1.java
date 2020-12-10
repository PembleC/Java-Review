// Selenium Basics Demo 1
// Carson Pemble


package com.test;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class Demo02_WorkingWithBrowser {
 
	WebDriver driver;
	String url = "http://localhost:8080/PackAndGo_v2/index.html";
 
	@Before
	public void setUp() {
	//Set the key/value property according to the browser you are using.
      System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe"); 
			//System.setProperty("webdriver.ie.driver", "D:\\IE Driver Server\\IEDriverServer.exe");
 
    //Open browser instance
    driver = new FirefoxDriver();

		//Open the AUT
		driver.get(url);
	}
 
	@Test
	public void test() {
		//Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
	}
 
	@After
	public void tearDown() {
		//Close the browser
		driver.close();
	}
}
