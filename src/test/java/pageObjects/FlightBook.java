package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBook {
	
	@FindBy(xpath ="(//a[@class='nav-link fadeout  waves-effect'])[3]")
	public static WebElement flight;
	
	@FindBy(xpath ="(//a[text()='Flights'])")
	public static WebElement Bookflight;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]")
	public static WebElement fromCity;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[2]")
	public static WebElement toCity;
	
	@FindBy(xpath ="//input[@class='select2-search__field']")
	public static WebElement fromCityName;
	
	@FindBy(xpath ="//input[@class='select2-search__field']")
	public static WebElement toCityName;
	
	@FindBy(xpath ="//ul[@class='select2-results__options']")
	public static WebElement selectFromCity;
	
	@FindBy(xpath ="//ul[@class='select2-results__options']")
	public static WebElement selectToCity;
	
	@FindBy(xpath="//*[@class='depart form-control']")
	public static WebElement departureDate;
	
	@FindBy(xpath="(//th[@class='next'])[1]")
	public static WebElement Month;
	
	@FindBy(xpath="(//td[text()='9'])[1]")
	public static WebElement Date;
	
	@FindBy(xpath="//*[@class='dropdown-toggle dropdown-btn travellers waves-effect']")
	public static WebElement Traveller;
	
	@FindBy(xpath="(//*[@class='qtyInc'])[2]")
	public static WebElement child;
	
	@FindBy(xpath="(//*[@class='qtyInc'])[1]")
	public static WebElement parent;
	
	@FindBy(xpath="//*[@type='submit']")
	public static WebElement searchFlight;
	
	@FindBy(xpath="//*[@id='direct']")
	public static WebElement directFlight;
	
	@FindBy(xpath="//*[@value='.oneway_Indigo']")
	public static WebElement Indigo;
	
	@FindBy(xpath="(//*[text()='Select Flight'])[1]")
	public static WebElement SelectFlight;
	

}
