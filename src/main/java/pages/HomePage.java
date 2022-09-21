package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//a[@id='nav-logo-sprites']")
	public static WebElement logo;
	
	@FindBy(xpath="//input[@id='ap_email']")
	public static WebElement userId;
	
	public void clickUserIdField() {
		userId.click();
		
	}
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed" + flag);
		return flag;
	}
	


}
