package BaseUtil;
 import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
	//System is a class and setProperty is a method
   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\khale\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");
   	driver = new ChromeDriver(); // This line will instantiate the webdriver and chromedriver will be used	
   	driver.manage().window().maximize();// or full screen() method
   	driver.manage().deleteAllCookies();
   	driver.get("https://www.amazon.com/");
   	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   	
   	homePage = new HomePage(driver);
   	
	}
	
    @AfterMethod
    public void treatUp() {
   	 driver.quit();
    }
	
	
	

}
