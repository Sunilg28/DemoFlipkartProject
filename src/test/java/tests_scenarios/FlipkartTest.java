package tests_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.FlipkartPage;

public class FlipkartTest {

		WebDriver driver;
		
		
		@BeforeTest
		public void beforetest()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		@Test (priority = 0)
		public void closepopup()throws Exception
		{	FlipkartPage f1 = new FlipkartPage (driver);
			
			f1.closepup();
			//validation
			String 	ExpTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String 	ActTitle = driver.getTitle();
			//compare both the titles
			Assert.assertEquals(ExpTitle, ActTitle,"Title Verified");
			System.out.println("Title Verified");
			
			WebElement logo = driver.findElement(By.className("aqQN50"));
			Assert.assertTrue(logo.isDisplayed());
			System.out.println("Logo Verified");
		}
		
		
		@Test (priority = 1)
		public void selectcategory() {
			FlipkartPage f1 = new FlipkartPage (driver);
			f1.selectmobilecategory();
			WebElement mobilecategory = driver.findElement(By.cssSelector("img[alt='Mobiles']"));
			Assert.assertTrue(mobilecategory.isDisplayed());
			System.out.println("Mobile category link is present");
		}
		
		@Test (priority = 2)
		public void selectbrandname() {
			FlipkartPage f1 = new FlipkartPage (driver);
			f1.selectmobilbrand();	
			
			String 	ExpTitle = "Mobile Phones Online at Best Prices in India";
			Assert.assertEquals(ExpTitle, driver.getTitle());
			
			WebElement mobilebrand = driver.findElement(By.cssSelector("img[alt='SAMSUNG']"));
			Assert.assertTrue(mobilebrand.isDisplayed());
			System.out.println("Mobile brand - Samsung is present");
		}
		
		@Test (priority = 3)
		public void selectmodelname() {
			FlipkartPage f1 = new FlipkartPage (driver);
			f1.selectmodel();
			
			String 	ExpTitle = "Mobile Price List | Compare Mobiles on Buy Online @ Flipkart.";
			Assert.assertEquals(ExpTitle, driver.getTitle());
			
			WebElement model = driver.findElement(By.xpath("//*[contains(text(),'SAMSUNG Galaxy F04 (Opal Green, 64 GB)')]"));
			Assert.assertTrue(model.isDisplayed());
			System.out.println("Model - SAMSUNG Galaxy F04 (Opal Green, 64 GB) is present");
		}
		
		/*@Test (priority = 4)
		public void addtocartitem() {
			FlipkartPage f1 = new FlipkartPage (driver);
			f1.addtocart();
			
		}*/
		
		
}
