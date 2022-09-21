package BaseUtil;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\khale\\eclipse-workspace\\com.amazon\\driver\\chromedriver.exe");
   	driver = new ChromeDriver(); // This line will instantiate the webdriver and chromedriver will be used	
   	driver.get("https://www.amazon.com/");
   	homePage = new HomePage(driver);
   	
	}
	
    @AfterMethod
    public void treatUp() {
   	 driver.quit();
    }
	
	
	

}
