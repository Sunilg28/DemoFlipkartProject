package objects;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	
	public void screensotTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		WebElement logo= driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
		
		File file= logo.getScreenshotAs(OutputType.FILE);
		File destfile= new File("logo.png");
		FileUtils.copyFile(file, destfile);
		driver.quit();
	}
	
	
	public void openNewTab() throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		driver.quit();
		
	}
}

