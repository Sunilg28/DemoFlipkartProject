package tests_scenarios;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BaseTest;

import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Facebookpage;


public class FacebookTest extends BaseTest{

	
	@Test (priority = 0)
	public void launchapp()
	{	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1) //, retryAnalyzer = common.Retry.class)
	public void verifyusername()throws Exception
	{	
		Facebookpage fb = new Facebookpage (driver);
	
		fb.EnterUsername();
		//validation
		String 	ExpTitle = "Facebook – log in or sign up";
		String 	ActTitle = driver.getTitle();
		Assert.assertTrue(false);
		
		//compare both the titles
		//Assert.assertEquals(ActTitle,ExpTitle ,"Title Verified");
		
		//System.out.println("Title Verified");
		
		//compare both the logo
		WebElement logo =  driver.findElement(By.xpath("//*[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("Logo Verified");
	}
	
	@Test (priority = 2)
	public void verifypassword()throws Exception
	{	
		Facebookpage fb = new Facebookpage (driver);
		
		fb.EnterPassword();
		
		
		WebElement placeholder = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		Assert.assertTrue(placeholder.isDisplayed());
		System.out.println("Placeholder Verified");
		
	}
	
	@Test (priority = 3)
	public void verifyuser()throws Exception
	{	
		Facebookpage fb = new Facebookpage (driver);
		
		fb.VerifyLogin();

		
	}
	
	
	
}
