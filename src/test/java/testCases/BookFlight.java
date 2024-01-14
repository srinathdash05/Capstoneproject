package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import commonFunction.BaseClass;
import pageObjects.FlightBook;

public class BookFlight extends BaseClass{
	
	@Test
	
	public void bookFlight() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, FlightBook.class);
		extentTest = extent.createTest("book flight");
		extentTest.info("On book flight page");
		FlightBook.Bookflight.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement clickFromCity = wait.until(ExpectedConditions.elementToBeClickable(FlightBook.fromCity));
		clickFromCity.click();
		extentTest.pass("Clicked on from city", MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenShot()).build());
		FlightBook.fromCityName.sendKeys("Bangalore");
		
		Thread.sleep(1000);
		FlightBook.selectFromCity.click();
		Thread.sleep(1000);

		FlightBook.toCity.click();
		Thread.sleep(1000);

		FlightBook.toCityName.sendKeys("Bhub");
		Thread.sleep(1000);

		FlightBook.selectToCity.click();
		Thread.sleep(1000);

		FlightBook.departureDate.click();
		Thread.sleep(1000);

		FlightBook.Month.click();
		Thread.sleep(1000);

		FlightBook.Date.click();
		Thread.sleep(1000);

		FlightBook.Traveller.click();
		Thread.sleep(1000);

		FlightBook.child.click();
		Thread.sleep(1000);

		FlightBook.parent.click();
		Thread.sleep(1000);

		FlightBook.searchFlight.click();
		Thread.sleep(1000);

		/*WebElement selectFlightType = wait.until(ExpectedConditions.elementToBeClickable(FlightBook.directFlight));
		selectFlightType.click();
		FlightBook.Indigo.click();
		FlightBook.SelectFlight.click();*/
		
	}

}
