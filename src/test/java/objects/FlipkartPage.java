package objects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;
public class FlipkartPage {
	
	WebDriver driver;
	
	
	public FlipkartPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By closepopup = By.xpath("//span[@class='_30XB9F']");
	By mobiles = By.cssSelector("img[alt='Mobiles']");
	By mobilebrand = By.cssSelector("img[alt='SAMSUNG']");
	By model = By.xpath("//*[contains(text(),'SAMSUNG Galaxy F23 5G (Aqua Blue, 128 GB)')]");
	//By addtocart_btn = By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']");	
	//By placeorder = By.cssSelector("button[class='_2KpZ6l _2ObVJD _3AWRsL']");
	
	
	public void closepup()
	{
		driver.findElement(closepopup).click();
	}
	
	public void selectmobilecategory()
	{
		driver.findElement(mobiles).click();
	}
	
	public void selectmobilbrand()
	{	
		driver.findElement(mobilebrand).click();
	}
	
	public void selectmodel()
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(model).click();	
	}

	/*public void addtocart()
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(addtocart_btn).click();	
	}*/
	
}
