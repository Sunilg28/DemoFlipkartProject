package tests_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Facebookpage;
import objects.GoogleSearchpage;

public class GoogleSearchTest {	
	WebDriver driver;
	GoogleSearchpage objectrepo;
	Facebookpage fb;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test (priority = 0)
	public void SearchOperation()
	{
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.searchgoogle("facebook");
	}
	
	@Test (priority = 1)
	public void Accessfacebook()
	{
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.clickFacebook();
	}
	
	@Test (priority = 2)
	public void Loginfacebook()
	{
		fb = new Facebookpage(driver);
		fb.EnterUsername();
		fb.EnterPassword();
		fb.VerifyLogin();
	
	}
		
	/*@AfterTest
	public void aftertest()
	{
		driver.quit();
	}*/
}

