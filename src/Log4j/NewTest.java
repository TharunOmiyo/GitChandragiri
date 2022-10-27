package Log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  Logger log= Logger.getLogger("Techlearn.in");
	  PropertyConfigurator.configure("Log4j.properties");
	  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  log.info("Google");
	  driver.manage().window().maximize();
	  log.info("Browser maximized");
	  driver.get("https://www.google.com/");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

}
