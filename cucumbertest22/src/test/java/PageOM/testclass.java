package PageOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		PageClass PObject = new PageClass(driver);
		PObject.clicklink();
		String username=null;
		PObject.typename(username);
		String password=null;
        PObject.typepassword(password);
        PObject.clickonloginlyn();
        PObject.clickonlogoutlyn();
        System.out.println("title of the page is:" +driver.getTitle());
       
	} 

}
