// Selenium Basics Demo 5
// Carson Pemble

package com.test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo007_InteractionwithWebTables {
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


		//Click on Offers Link
		driver.findElement(By.linkText("Offers")).click();

		//Fetch the Account details table
		WebElement tblAccountDetails = driver.findElement(By.id("offersTable"));

		//Fetch all the rows inside the Account details table using the tr tag and store it in rows list
		List<WebElement> rows = tblAccountDetails.findElements(By.tagName("tr"));

		//Print the number of rows
		System.out.println("Number of rows: " + rows.size());

		//Iterate over all the rows
		for (WebElement row : rows) {
			//Find all the cols inside the particular row using the td tag
			List<WebElement> cols = row.findElements(By.tagName("td"));

			//Iterate over all the columns inside the particular row
			for (WebElement col : cols) {
				//Print the cell value
				System.out.print("Column value: " + col.getText());
			}
		}
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
