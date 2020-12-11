// Selenium Advanced - Log4J Demo
// Carson Pemble
// 12/10/2020

// Create an instance of logger class using getLogger(). Logs will be generated for this class.class
static Logger logger = Logger.getLogger("Demo16_Basic_Configurator.class");

public static void main(String[] args)throws Exception {
  WebDriver driver;
  // Automatically generate log files pre-configured
  // BasicConfigurator.configure();
  // OR
  // Configure log4j using log4j.properties file
  PropertyConfigurator.configure("log4j.properties");
  
  driver.get("http://10.67.89.41/Automation/PackAndGo_v2/index.html");
  logger.info("Opening Pack and Go application");
  
  //clicking on Login button
  driver.findElement(By.xpath("//*[@id=\'myNavbar\']/ul/li[4]/a")).click();
  Thread.sleep(2000);

  //entering username
  driver.findElement(By.id("usernameLogin")).sendKeys("pgGru");
  logger.info("Entering Username");
  
  //entering password
  driver.findElement(By.id("passwordLogin")).sendKeys("freezeray");
  logger.info("Entering Password");
  
  //clicking on login button 
  driver.findElement(By.id("login")).click();
  logger.info("Click on Login button");
 
  //clicking on logout button
  driver.findElement(By.id("topMenu2")).click();
  logger.info("Logout from the application");
  
  driver.quit();
 
}






log4j.properties:

#Set level
log4j.rootCategory=INFO,console,file

# Appender which writes to console
log4j.appender.console=org.apache.log4j.ConsoleAppender

#Appender which writes to file
log4j.appender.file=org.apache.log4j.RollingFileAppender
log4j.appender.file.File=.\\Logs\\AppLogs.log

#Define pattern layout for console logs
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{MM-dd-yyyy HH:mm:ss} %F %-5p [%t] %c{2} %L - %m%n

# Defining maximum size of a log file
log4j.appender.file.MaxFileSize=5KB
log4j.appender.file.MaxBackupIndex=3
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%d{ISO8601} %5p %F [%t] %c{1}:%L - %m%n



log4j.properties.xml:

  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
  <log4j:configuration debug="true"
    xmlns:log4j='http://jakarta.apache.org/log4j/'>
  	<appender name="console" class="org.apache.log4j.ConsoleAppender">
  	    <layout class="org.apache.log4j.PatternLayout">
  		<param name="ConversionPattern" value="%d{MM-dd-yyyy HH:mm:ss} %F %-5p [%t] %c{2} %L - %m%n" />
  	    </layout>
  	</appender>
  	<appender name="file" class="org.apache.log4j.RollingFileAppender">
  	    <param name="append" value="false" />
  	    <param name="maxFileSize" value="5KB" />
  	    <param name="maxBackupIndex" value="3" />
  	    <param name="file" value=".\\Logs\\AppLogs.log" />
  	    <layout class="org.apache.log4j.PatternLayout">
  		<param name="ConversionPattern" value%d{ISO8601} %5p %F [%t] %c{1}:%L - %m%n />
  	    </layout>
  	</appender>
  	<root>
  		<level value="INFO" />
  		<appender-ref ref="console" />
  		<appender-ref ref="file" />
  	</root>
  </log4j:configuration>
