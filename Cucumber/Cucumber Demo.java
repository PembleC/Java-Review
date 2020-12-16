// Cucumber Demo
// Carson Pemble
// 12/16/2020


# Feature Files

@OpenAUT
Feature: Tags in Feature FIle
  @EDUBankCustomer
  Scenario: Open AUT and Print Title
    Given The Customer is on EDU customer Login Page
    When Enters Login credentials
    Then Get title of the Page Displayed
  @EDUBankTeller
  Scenario: Open AUT and Print Title
    Given EDU Bank Teller Home Page
    When Enters login Details
    Then Logged in




# Code Snippet

You can implement missing steps with the snippets below:

@Given("^The Customer is on EDU customer Login Page$")
public void the_Customer_is_on_EDU_customer_Login_Page() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@When("^Enters Login credentials$")
public void enters_Login_credentials() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@Then("^Get title of the Page Displayed$")
public void get_title_of_the_Page_Displayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@Given("^EDU Bank Teller Home Page$")
public void edu_Bank_Teller_Home_Page() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@When("^Enters login Details$")
public void enters_login_Details() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@Then("^Logged in$")
public void logged_in() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}




// Java Class

package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Tags {
	static WebDriver driver;
	static String url2="http://vjeemys-19:3333/EDUBank/tellerLogin";
	static String url1="http://vjeemys-19:3333/EDUBank/ ";

	@Given("^The Customer is on EDU customer Login Page$")
		public void the_Customer_is_on_EDU_customer_Login_Page() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		 //   throw new PendingException();
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Selenium Jar Files Recent\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url1);
		}
		@When("^Enters Login credentials$")
		public void enters_Login_credentials() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			driver.findElement(By.name("loginName")).sendKeys("Steven");
			driver.findElement(By.name("password")).sendKeys("Steven!123");
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/form/button")).click();
		}
		@Then("^Get title of the Page Displayed$")
		public void get_title_of_the_Page_Displayed() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new PendingException();
			System.out.println(driver.getTitle());
			driver.quit();
		}
		@Given("^EDU Bank Teller Home Page$")
		public void edu_Bank_Teller_Home_Page() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		 //   throw new PendingException();
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Selenium Jar Files Recent\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url2);

		}
		@When("^Enters login Details$")
		public void enters_login_Details() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new PendingException();
			driver.findElement(By.name("loginName")).sendKeys("T7302");
			driver.findElement(By.name("password")).sendKeys("T7302*abc");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
		}
		@Then("^Logged in$")
		public void logged_in() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			System.out.println(driver.getTitle());
			driver.quit();
		}
}



// Runner class

package demos;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		tags={"@EDUBankTeller "}    // only runs scenario with this tag
    //tags = {"@regression","@sanity"}    // AND
    //tags = {"@regression,@sanity"}      // OR
    //tags = {"@regression","~@sanity"}   // NOT

		)
public class TaggedHooksRunner {

}



// Results

Starting ChromeDriver 2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a) on port 4715
Only local connections are allowed.
Mar 12, 2019 5:53:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS

Teller Home

1 Scenarios (_[32m1 passed_[0m)
3 Steps (_[32m3 passed_[0m)
0m14.414s
