// Selenium Advanced - Extent Reports Demo
// Carson Pemble
// 12/10/2020


public class ExtentReportsClass {

	String url;
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;

	@Test
	public void test() throws IOException {
	test.log(LogStatus.INFO, "userName given is Steven");
	driver.findElement(By.name("loginName")).sendKeys("Steven");
	test.log(LogStatus.INFO, "user password is entered");
	driver.findElement(By.name("password")).sendKeys("Steven!123");
	test.log(LogStatus.INFO, "user clicked on submit button");
	driver.findElement(By.xpath("//*[@type='submit']")).click();

	String expPageTitle = "Customer Home";
	String actPageTitle = driver.getTitle();

	if(expPageTitle.equals(actPageTitle)) {
		test.log(LogStatus.PASS, "Login is success");
	}
	else {
		test.log(LogStatus.FAIL, "Login is failed");
		test.log(LogStatus.FAIL, test.addScreenCapture(capture(driver))+ "test failed");
	}
	}

	@BeforeMethod
	public void setUp() {

	url = "http://vjeemys-19:3333/EDUBank/";
	reports = new ExtentReports("user.dir"+"\\extentreports.html");
	test = reports.startTest("ExtentDemo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nagesh_boregowda\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);

	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	test.log(LogStatus.INFO, "Home page of the application is opened");

	}

	@AfterMethod
	public void tearDown() {

		reports.endTest(test);
		reports.flush();
		driver.close();
	}


	private String capture(WebDriver driver) throws IOException {

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("src/../ErrImages"+System.currentTimeMillis()+".png");
		String errflpath = destFile.getAbsolutePath();
		FileUtils.copyFile(srcFile, destFile);
		return errflpath;

	}
}
