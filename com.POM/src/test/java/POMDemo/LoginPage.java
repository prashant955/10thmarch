package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	
	}
	public WebElement getUname()                              //Getting WebElement
	{
		return driver.findElement(By.id("email"));
	}
	public WebElement getPass()
	{
		return driver.findElement(By.id("password"));
	}
	public WebElement getButton()
	{
		return driver.findElement(By.xpath("//button"));
	}
	
	
	public void enterUname(String text) 					//Operating WebElement
	{
		getUname().sendKeys(text);
	}
	public void enterPass(String text)
	{
		getPass().sendKeys(text);
	}
	public void clickLogin()
	{
		getButton().click();
	}
	
	public void validLogin()
	{
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLogin();
	}
	

}
