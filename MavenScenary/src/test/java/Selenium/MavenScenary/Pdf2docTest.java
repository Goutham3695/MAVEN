package Selenium.MavenScenary;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Pdf2docTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.pdf2doc.com");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
