package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
	
	// Use of Id attribute as locator
	@FindBy(id = "//input[@id='signInSubmit']")
	WebElement signinButton;
	
	// 2nd way to write the WebElement: not common, here forgotUserId, I used
	// I will show it in the next class how to write method for this
	By forgotUserId = By.id("auth-fpp-link-bottom");
	
	// 3rd way to write the WebElement: tough, you need to recognize if used in your office,
		// no need to use this in your framework
		@FindBy(how = How.XPATH, using = "//a[@class='a-link-normal' and @id='auth-fpp-link-bottom']")
		WebElement forgotPassword;
	
	public void clickUserIdField() {
		userId.click();//
		
	}
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed" + flag);
		return flag;
	}
	public void clickUserIdField1() {
		userId.click();
	}
	
	public void loginButtonClicked() throws InterruptedException {
		Thread.sleep(1000);
		WebElement loginButton = null;
		loginButton.click();
		Thread.sleep(1000);
	}
	
	public void forgotPasswordClicked () throws InterruptedException {
		Thread.sleep(1000);
		forgotPassword.click();
		Thread.sleep(1000);
	}
	
}
