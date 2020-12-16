// Parameterization Using Data Tables
// Carson Pemble
// 12/15/2020

# Cucumber File
Feature: Login Action
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    |p&gAlmacho |freezeray |
    | p&gGru | freezeray|
	Then Message displayed DASHBOARD


// Java File
  @When("^User enters Credentials to LogIn$")
    public void user_enters_Credentials_to_LogIn(DataTable usercredentials) {

 	   for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {

 		driver.findElement(By.id("usernameLogin")).sendKeys(data.get("Username"));
 		driver.findElement(By.id("passwordLogin")).sendKeys(data.get("Password"));
 		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button[1]")).click();
 		  driver.findElement(By.xpath("//*[@id=\"topMenu2\"]/a")).click();
 		   System.out.println("logout Sucessfull");
 	   }
    }
