package testCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunction.BaseClass;
import pageObjects.FlightBook;

public class BookFlight extends BaseClass{
	
	@Test
	
	public void bookFlight() throws InterruptedException {
		
		PageFactory.initElements(driver, FlightBook.class);
		FlightBook.Bookflight.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement clickFromCity = wait.until(ExpectedConditions.elementToBeClickable(FlightBook.fromCity));
		clickFromCity.click();
		FlightBook.fromCityName.sendKeys("Bangalore");
		Thread.sleep(1000);
		FlightBook.selectFromCity.click();
		Thread.sleep(1000);

		FlightBook.toCity.click();
		Thread.sleep(1000);

		FlightBook.toCityName.sendKeys("Bhubaneswar");
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

		WebElement selectFlightType = wait.until(ExpectedConditions.elementToBeClickable(FlightBook.directFlight));
		selectFlightType.click();
		FlightBook.Indigo.click();
		FlightBook.SelectFlight.click();
		
	}

}
