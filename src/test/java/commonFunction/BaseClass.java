package commonFunction;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver=null;
	public static Properties properties = null;
	
	public static Properties loadPropertyFile() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("Configuration.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchBrowser() throws Exception{
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		
		String url = properties.getProperty("url");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", driverLocation);
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		/*if(browser.equalsIgnoreCase("Chrome")) {
			//String driverLocation = properties.getProperty("driver1Location");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", driverLocation);
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
		}else if(browser.equalsIgnoreCase("Edge")) {
		String driverLocation = properties.getProperty("driver2Location");
		driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", driverLocation);
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		}else {
			System.out.println("Invalid Entry");
		}*/
		/*driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submitBTN")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo p-1 rounded']")));
		if(logo.isDisplayed()) {
			System.out.println("Log in successful");
			
		}else {
			System.out.println("Log in failed");
		}*/
		
	}
	
	@AfterTest
	public void navigateToLandingPage() {
		
		driver.findElement(By.xpath("//img[@class='logo p-1 rounded']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo p-1 rounded']")));
	}
	
	@AfterSuite
	public void tearDown() throws Exception{
		driver.close();
		driver.quit();
	}
}
