package PageOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass 
{
	WebDriver driver;
	By Inc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By link=By.xpath("//input[@value='Log in']");
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clicklink()
	{
		driver.findElement(Inc).click();
	}
	
	public void typename(String username)
	{
		driver.findElement(uname).sendKeys("aishwaryamusale123@gmail.com");
	}
	
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("Aish12");
	}
	
	
	public void clickonloginlyn()
	{
		driver.findElement(link).click();
	}
	
	public void clickonlogoutlyn()
	{
		driver.findElement(link).click();
	}
}
