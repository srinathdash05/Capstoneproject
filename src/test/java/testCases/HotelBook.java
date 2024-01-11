package testCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunction.BaseClass;
import pageObjects.BookHotel;

public class HotelBook extends BaseClass{
	
	@Test
	public void bookHotel() throws InterruptedException {
		PageFactory.initElements(driver, BookHotel.class);
		BookHotel.hotel.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(BookHotel.hotelText));
		BookHotel.city.click();
		BookHotel.search.sendKeys("Bhub");
		Thread.sleep(2000);
		BookHotel.selectCity.click();
		
		
	}

}
