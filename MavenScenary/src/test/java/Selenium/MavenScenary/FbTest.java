package Selenium.MavenScenary;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class FbTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("varshini@gmailcom");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pagal");
	  driver.findElement(By.linkText("Log In")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https:\\www.facebook.com");  
  }
}
