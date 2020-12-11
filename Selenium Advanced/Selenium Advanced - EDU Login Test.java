// Selenium Advanced - EDU Login Test
// Carson Pemble
// 12/11/2020


@Test
  public void EDU_test() throws InterruptedException, Exception {
	  // Create EDU login page object. Send web driver details

	  // Call login method with user id and password.

	  String file_path="C:\\Users\\Rakesh.R15\\Documents\\EclipseWorkSpace\\hybrid.xlsx";

	  XSSFWorkbook wbook=new XSSFWorkbook(file_path);
	  XSSFSheet sheet1=wbook.getSheet("Sheet1");

	  int rowNum=sheet1.getLastRowNum()-sheet1.getFirstRowNum();

	  for(int j=1;j<=rowNum;j++)
	  {

	 if((sheet1.getRow(j).getCell(1).getStringCellValue()).equals("login")) {
	  EDU_Login_Page EDU_login = new EDU_Login_Page(driver);
	  EDU_login.login(teller_userid, teller_pwd);
	  boolean create_aaccount_flag = driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/span")).isEmpty();

	  if (create_aaccount_flag) {
		  // Flag is true means Login is failed
		  System.out.println("Teller login failed");
	  } else {
		// Flag is false meansLogin is failed
		  System.out.println("Teller login passed");
	 }
	 }
	  /* Check if login is successful.
	  * Check if create account field exists on navigated page.
	  * Using isEmpty function of find elements check, if required element exists on the page
	  * if exist, isEmpty will return false
	  * else it returns true
	  */
	 else if((sheet1.getRow(j).getCell(1).getStringCellValue()).equals("logout"))
	 {

		// Logout from this screen
		  driver.findElement(By.linkText("Logout")).click();

	  }
	  }
	// Wait for 2 seconds
	  Thread.sleep(2000);

  }
