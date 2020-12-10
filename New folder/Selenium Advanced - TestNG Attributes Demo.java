// Selenium Advanced - TestNG Attributes Demo
// Carson Pemble
// 12/8/2020

@BeforeSuite
@Parameters({ "browsername", "url" })
public void setup(@Optional("Firefox")String browsername,String url) {
	switch (browsername) {
	case "IE":
	//Code to initialize webdriver instance
		driver.get(url);
		break;
	case "Firefox":
		//Code to initialize webdriver instance
		driver.get(url);
		break;
	case "chrome":
		//Code to initialize webdriver instance
		driver.get(url);
		break;
	}	
}


@Test(dataProvider="getData")
  public void login(String username,String password)
  {
	   //Code to Login to the application
		  driver.findElement(By.xpath("//*[@id=\'myNavbar\']/ul/li[4]/a")).click();
		  driver.findElement(By.id("usernameLogin")).sendKeys(username);
		  driver.findElement(By.id("passwordLogin")).sendKeys(password);
		  driver.findElement(By.id("login")).click();

      try {
	       //verifying the presence of webelement
			   new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("topMenu2")));
			   System.out.println("login success");
			} catch(Exception e) {
				 System.out.println("Login failure");
			}

      driver.findElement(By.id("topMenu2")).click();
	  }
  }

@DataProvider
public Object[][]getData() {
    Object[][]data=new Object[2][2];
    data[0][0]="pgGru";
    data[0][1]="freezeray";
    data[1][0]="pgAlmacho";
    data[1][1]="freezeray";
    return data;
}




  @Test(dependsOnMethods="login")
      public void dashboardTest()
      {
        driver.findElement(By.id("sideMenu2")).click();      
      }
    
    @Test(dependsOnMethods="dashboardTest",enabled=false)
      public void logOut()
      {
          driver.findElement(By.id("topMenu2")).click();
      }
  }



  @Test(dependsOnMethods="dashboardTest",enabled=false)
  	public void logOut()
  	{
  		//code for logout from the application
  	}

@AfterSuite
public void tearDown() {
  driver.quit();
}




test.xml =

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<parameter name="browserName" value="Firefox"></parameter>
	<parameter name="url"
		value="http://localhost:8080/PackAndGo_v2/index.html"></parameter>
	<test name="Test">
		<classes>
			<class name="fully fledged classname" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
