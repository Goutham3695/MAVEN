package Selenium.MavenScenary;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MindqTest {
	WebDriver driver;
  @Test
  public void f() {
	  Actions a = new Actions(driver);
	  a.moveToElement(driver.findElement(By.linkText("Online-Chat With Us"))).build().perform();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://www.mindqsystems.com");
		 driver.manage().window().maximize();
  }

}
