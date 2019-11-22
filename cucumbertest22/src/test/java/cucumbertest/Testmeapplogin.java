package cucumbertest;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Testmeapplogin 
{
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() 
	{
	    System.setProperty("webdriver.chrome.driver", "http://demowebshop.tricentis.com/chromedriver.exe");
	    driver = new ChromeDriver();
	    String url= "http://demowebshop.tricentis.com/";
	    driver.get(url);
	    driver.findElement(By.linkText("Log In")).click();
	
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username()
	{
	   driver.findElement(By.id("userName")).sendKeys("lalitha");
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) 
	{
	    driver.findElement(By.id("password")).sendKeys("password123");

	}

	@Then("user will find testmeapp homepage")
	public void user_will_find_testmeapp_homepage()
	{
	    driver.findElement(By.name("Login")).click();
	    System.out.println("the page title is "+driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("Home"));
	   
	    
	}
}
