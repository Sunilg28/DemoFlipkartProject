package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchpage {
	
	WebDriver driver;
	
	public GoogleSearchpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchbox = By.id(("APjFqb"));
	By search_btn = By.xpath("((//input[@name='btnK'])[1])");
	By facebook_link = By.xpath("//a[@href ='https://www.facebook.com/']");
	
	
	public void searchgoogle(String Searchinput) 
	{
		try 
		{
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(1000);
			driver.findElement(search_btn).click();
			
		} 	
		catch (Exception e) {
			System.out.println("Exception Caught" +e.getMessage());
		}
	}
	
	public void  clickFacebook()
	{
		try {
			
			driver.findElement(facebook_link).click();
			
		}
		catch (Exception e) {
			System.out.println("Exception Caught" +e.getMessage());
		}
		
	}
}