package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
	
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	By searchbox = By.id(("APjFqb"));
	
}
