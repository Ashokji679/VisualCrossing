package utility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

public class TestBaseClass {
	protected WebDriver driver;
	
	
	
	public void launchBrowser() throws InterruptedException
	{
		
		ChromeOptions options = new ChromeOptions();
		 driver = new ChromeDriver(options);
		 options.addArguments("--disable-notifications");
		driver.get("https://www.visualcrossing.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		Thread.sleep(3000);
	}

	

	public void closeBrowser() throws InterruptedException
	{
		driver.close();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
}
