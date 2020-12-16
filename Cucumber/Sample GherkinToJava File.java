// Sample Gherkin->Java File
// Carson Pemble
// 12/15/2020

package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class First {
	static WebDriver driver;
	static String url="http://vjeemys-19:3333/EDUBank/ ";
@Given("^User navigates to the Home Page$")
public void user_navigates_to_the_Home_Page() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Selenium Jar Files Recent\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
}
@When("^user Enters the Signup Details$")
public void user_Enters_the_Signup_Details() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.findElement(By.name("loginName")).sendKeys("Steven");
	driver.findElement(By.name("password")).sendKeys("Steven!123");
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/form/button")).click();
}
@Then("^User Logged In to EDU$")
public void user_Logged_In_to_EDU() throws Exception {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
	System.out.println(driver.getTitle());
	driver.quit();
}
}




// Second File
package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Background {

	static WebDriver driver;
	static String url="http://vjeemys-19:3333/EDUBank/tellerLogin";

	@Given("^User is on EDU Teller Login Page$")
	public void user_is_on_EDU_Teller_Login_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Selenium Jar Files Recent\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("loginName")).sendKeys("T7302");
		driver.findElement(By.name("password")).sendKeys("T7302*abc");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
	}
	@When("^User checks for Add Money$")
	public void user_checks_for_Add_Money() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a/span")).click();

	}
	@Then("^Enter Account number details and Search$")
	public void enter_Account_number_details_and_Search() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.findElement(By.name("accountNumber")).sendKeys("318269");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/form/button")).click();
	}
	@Then("^Closes$")
	public void closes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.quit();
	}
	@When("^The user checks for My Customers link$")
	public void the_user_checks_for_My_Customers_link() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a/span")).click();

	}
	@Then("^All Customer details displayed$")
	public void all_Customer_details_displayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println(driver.getTitle());
	}
	@Then("^Closes The Browser$")
	public void closes_The_Browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		driver.quit();
	}
}
