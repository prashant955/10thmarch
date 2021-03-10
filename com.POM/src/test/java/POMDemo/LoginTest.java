package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	LoginPage lp=null;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Java By kiran Selenium class\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Java%20By%20kiran%20Selenium%20class/Offline%20website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);	
	}
	
	@Test
	public void validLogin()
	{
		lp.enterUname("kiran@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
	}
	

}
