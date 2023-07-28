package weather_Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Weather_Data_POMClass {
	
	private WebDriver driver;
	
	
	
	// Weather data 
	
	@FindBy(xpath = "(//a[text()='Weather Data'])[1]")
	private WebElement weather_Data ;
	
	@FindBy(xpath = "//input[@placeholder='Enter a location']")
	private WebElement search_City ;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg rounded-pill w-100 w-md-auto ms-sm-3']")
	private WebElement searchButton;
	
	@FindBy(xpath ="//a[@id= 'locationDropdownMenuButton']")
	private WebElement cityName;
	
	
	
	
	public Weather_Data_POMClass(WebDriver driver)
	
	{
	//	this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	// Click on Weather Data menu
	public void clickOnWeatherMenu()
	{
		Reporter.log("clickOnWeatherMenu" , true);
		weather_Data.click();
	}
	
	
	// Search the city name
	
	public void search_Text()
	{
		search_City.sendKeys("Pune");
	}
	
	
// Click on search button after entering the city name
	public void clickOnSearchButton()
	{
		searchButton.click();
		
	}
	
	
	// Verify weather forecast for the searched city is showing or not
	
	
	public String getText_Weather_Forecast_Actual_City_Name()
	{
		
		String Actaul_City = cityName.getText();
		return Actaul_City;
	}
	
	
	
	
	
	
	
	
	
	
	

}
