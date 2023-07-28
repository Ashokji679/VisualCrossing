package weather_Data;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Commons;
import utility.TestBaseClass;

public class TC01WeatherMenu extends TestBaseClass {

	Weather_Data_POMClass w;

	@BeforeClass

	public void weatherMenu() throws InterruptedException {
		launchBrowser();
		w = new Weather_Data_POMClass(driver);
		w.clickOnWeatherMenu();
		Thread.sleep(2000);

		w.search_Text();
		Thread.sleep(2000);

		w.clickOnSearchButton();
		Thread.sleep(2000);

		w.getText_Weather_Forecast_Actual_City_Name();
		Thread.sleep(2000);

	}

	@Test
	public void validate_Weather_City_Name() throws EncryptedDocumentException, IOException {

		String expected_City_Name = Commons.read_Data_From_Excel(0, 0);
		String act_City_Name = w.getText_Weather_Forecast_Actual_City_Name();

		Assert.assertEquals(expected_City_Name, act_City_Name,
				"TestCase failed :Actual and expected city name is not matching");

	}

	@AfterClass

	public void browserClosed() throws InterruptedException {
		closeBrowser();
		Thread.sleep(2000);
	}

}
