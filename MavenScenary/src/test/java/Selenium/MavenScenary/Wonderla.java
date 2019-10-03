package Selenium.MavenScenary;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class Wonderla {
	WebDriver driver;
	
  @Test
public void f() throws IOException {
	  Actions a = new Actions(driver);
	  a.moveToElement(driver.findElement(By.linkText("Parks & Resort"))).build().perform();
	  driver.findElement(By.xpath("//span[contains(text(),'Hyderabad Park')]")).click();
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("D:\\MavenProject\\screenshots\\wondela.jpg"));
  }
  @BeforeTest
  public void booking() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.wonderla.com/");
	  driver.manage().window().maximize();
	  
  }

}
