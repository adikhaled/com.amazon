package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseUtil.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass {
	// When you don't define who will test first?
	// It follow the name alphabetically

	// If enabled is true, the test case will run
	// If enabled is false, the test case will not run

	@Test
	public void logoTest() {
		boolean logo= homePage.logoDisplayed();
	System.out.println("Amazon Logo is dispalyed >>  "+logo);
		
	}

	@Test(enabled = false, priority = 3)
	public void clickUserIdFieldTest() {
		homePage.clickUserIdField(); // updated again
	}

	@Test(enabled = false, priority = 2)
	public void loginButtonTest() throws InterruptedException {
		homePage.loginButtonClicked();
	}
	
	@Test(enabled = false)
	public void forgotPasswordTest() throws InterruptedException {
		homePage.forgotPasswordClicked();
	}
	
	// I will fix it in the next class
	@Test(enabled = true)
	public void newUserRegistrationButtonClickTest() {
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
	}
	
	

}
