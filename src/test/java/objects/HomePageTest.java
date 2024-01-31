package objects;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.App;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	
	
public void screensotTest() throws IOException, InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();	
	Thread.sleep(2000);
	
	WebElement closepopup = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
	closepopup.click();
	
	WebElement mobiles = driver.findElement(By.cssSelector("img[alt='Mobiles']"));
	boolean displaystatus = mobiles.isDisplayed();
	if(displaystatus)
	{
		System.out.println("present");
	}
	else
	{
		System.out.println("not present");
	}
	mobiles.click();
	
	
	WebElement logo= driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
	
	File file= logo.getScreenshotAs(OutputType.FILE);
	File destfile= new File("logo.png");
	FileUtils.copyFile(file, destfile);
	driver.quit();
}
}



