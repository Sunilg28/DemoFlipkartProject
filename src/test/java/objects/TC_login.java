package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {
	@Test
	public void login_test() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin"); 
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	driver.close();
	
	}
}
