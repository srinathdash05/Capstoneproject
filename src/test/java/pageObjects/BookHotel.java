package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel {
	
	@FindBy(xpath="//a[text()='Hotels']")
	public static WebElement hotel;
	
	@FindBy(xpath = "//strong[text()='Search for best hotels']")
	public static WebElement hotelText;
	
	@FindBy(xpath = "//*[@title=' Search by City']")
	public static WebElement city;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	public static WebElement search;
	
	@FindBy(xpath ="//ul[@class='select2-results__options']")
	public static WebElement selectCity;
	
	@FindBy(xpath="//input[@id='checkin']")
	public static WebElement CheckinDate;
	
	@FindBy(xpath="(//th[@class='next'])[1]")
	public static WebElement Month;
	
	@FindBy(xpath="//input[@id='checkout']")
	public static WebElement CheckOutDate;
	
	@FindBy(xpath="(//td[text()='9'])[1]")
	public static WebElement checkInDate;
	
	@FindBy(xpath="(//td[text()='11'])[1]")
	public static WebElement CheckDate;
	
	@FindBy(xpath="//*[@class='dropdown-toggle dropdown-btn travellers waves-effect']")
	public static WebElement Traveller;
	
	@FindBy(xpath="(//*[@class='qtyInc'])[2]")
	public static WebElement child;
	
	@FindBy(xpath="(//*[@class='qtyInc'])[1]")
	public static WebElement parent;
	
	
	

}
