// Selenium Basics Demo 6
// Carson Pemble

package com.test;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo010_ExcelReading {
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
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception {
		//Path from where the excel file has to be read
		String filePath = System.getProperty("user.dir") + "\\Cred.xlsx";

				//File input stream which needs the input as the file location
				FileInputStream fileStream = new FileInputStream(filePath);

				//Workbook reference of the excel file
				XSSFWorkbook workbook = new XSSFWorkbook(fileStream);

				//Sheet which needs to be accessed from within the workbook
				XSSFSheet sheet = workbook.getSheet("Sheet1");

				//Count the number of rows
				int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

				//Iterate the Username/Password/
				for (int i = 1; i <= rowCount; i++) {
					//Pass the row number and the cell number from where the value has to be fetched

					driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();

					Thread.sleep(2000);

					driver.findElement(By.id("usernameLogin")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());


					driver.findElement(By.id("passwordLogin")).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());


					driver.findElement(By.id("login")).click();

					String message = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]")).getText();
					System.out.println(message);

					driver.findElement(By.linkText("LogOut")).click();
				}
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
