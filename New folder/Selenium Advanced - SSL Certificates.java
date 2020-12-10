// Selenium Advanced - SSL Certificates
// Carson Pemble
// 12/9/2020

public class Demo09_SSL_FF {
	private WebDriver driver;
	@BeforeClass
	public void setUp() {

			 // Access the profile created in the script
			 ProfilesIni prof = new ProfilesIni();
			 FirefoxProfile ffProfile = prof.getProfile("Selenium");

			 ffProfile.setAcceptUntrustedCertificates(true);
			 ffProfile.setAssumeUntrustedCertificateIssuer(false);

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
	}

	@Test
	public void openApplication() {
			driver.get("https://cacert.org/");
			String pageTitle = driver.getTitle();
			String expectedTitle = "Welcome to CAcert.org";
			Assert.assertEquals(pageTitle, expectedTitle);
	}

	@AfterClass
	public void tearDown() {
			driver.quit();
	}
}






// ChromeDriver

ProfilesIni prof = new ProfilesIni();
ChromeOptions option = new ChromeOptions();
options.addArguments("--ignore-certificate-errors");
System.setProperty("webdriver.chrome.driver", "C\\elcipse\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver(option);

							or

ChromeOptions co= new ChromeOptions();
co.setAcceptInsecureCerts(true);
driver = new ChromeDriver (co);





// IE

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
WebDriver driver = new InternetExplorerDriver(capabilities)
