package para;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameter 
{
	WebDriver driver=null;
	
	@Given("User is open the application")
	public void user_is_open_the_application() 
	{
	    
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    String url= "http://demowebshop.tricentis.com";
		    driver.get(url);
		    driver.manage().window().maximize();
	}

	@When("user clicks on to Login link")
	public void user_clicks_on_to_Login_link() 
	{
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("the title of the page is "+driver.getTitle());
		
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) 
	{
	    driver.findElement(By.name("Email")).sendKeys(username);
	    driver.findElement(By.name("Password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]"));
	    	driver.close();
	    	
	}

	@Then("Message displayed login Successfully")
	public void message_displayed_login_Successfully() 
	{
	    
	}

}
