package testCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import commonFunction.BaseClass;
import pageObjects.BookHotel;

public class HotelBook extends BaseClass{
	
	@Test
	public void bookHotel() throws InterruptedException {
		PageFactory.initElements(driver, BookHotel.class);
		extentTest = extent.createTest("Hotel booking");
		extentTest.info("on the hotelbook page and will click on hotel");
		BookHotel.hotel.click();
		extentTest.pass("Navigated to Hotel booking", MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenShot()).build());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(BookHotel.hotelText));
		BookHotel.city.click();
		BookHotel.search.sendKeys("Bhub");
		Thread.sleep(2000);
		BookHotel.selectCity.click();
		
		
	}

}
