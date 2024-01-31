package objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;	


public class Facebookpage {
	
	WebDriver driver;
	
	public Facebookpage(WebDriver driver)
	{
		this.driver = driver;
	}

	By Username = By.id("email");
	By Password = By.id("pass");
	By Login_Btn = By.name("login");
	
	public void EnterUsername(){
		driver.findElement(Username).sendKeys("sunilgaikwad0384@gmail.com");
		
	}
	
	public void EnterPassword() {
		driver.findElement(Password).sendKeys("Tester@123");
	}
	
	public void VerifyLogin() {
		driver.findElement(Login_Btn).click();
		
	}
	
	
	
	
}
