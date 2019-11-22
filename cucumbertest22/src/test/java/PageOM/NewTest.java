package PageOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageOM.pomwithpf;




public class NewTest 
{
  @Test
  public void f() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pomwithpf locateElements = PageFactory.initElements(driver, pomwithpf.class);
		locateElements.loginMethod("aishwaryamusale123@gmail.com", "Aish12");
		
		
  }
}
