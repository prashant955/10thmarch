package POMDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage 
{
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public List<WebElement> Courses()
	{
		return driver.findElements(By.xpath("//h3"));
	}

		public void getCourses() 
		{
			for(WebElement course : Courses()) 
			{
				System.out.println(course.getText());
			}
		}
}
