package testCases;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunction.BaseClass;
import pageObjects.FlightBook;
import pageObjects.LogIn;

public class LogInTC extends BaseClass {
	
	@Test(priority =1)
	public void landingPage()throws Exception{
		PageFactory.initElements(driver, LogIn.class);
		loadPropertyFile();
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		LogIn.username.sendKeys(username);
		LogIn.password.sendKeys(password);
		Thread.sleep(3000);
		LogIn.LoginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='logo p-1 rounded']")));
		//LogIn.cookieHide.click();
		if(logo.isDisplayed()) {
			System.out.println("Log in successful");
			
		}else {
			System.out.println("Log in failed");
		}
		String Title = driver.getTitle();
		System.out.println(" The title is : " +Title);
		
		Thread.sleep(2000);
	}
	
		
		
	

}
