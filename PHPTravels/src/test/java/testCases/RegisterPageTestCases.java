package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import businessLibrary.RegisterBusiness;
import genericLibrary.BaseClass;

public class RegisterPageTestCases extends BaseClass {
	
	@BeforeMethod
	public void gearUp() {
		launchBrowser("chrome");
		implicitWait();
		openUrl("https://phptravels.org/register.php");
		
	}
	@Test (description = "Testing the happy flow of Php travels register page")
	public void testHapppyFlow() {
		RegisterBusiness.enterFirstName("Vedant1111");
		RegisterBusiness.enterLastName("Shukla111");
		RegisterBusiness.enterEmail("vedant11111@gmail.com");
		RegisterBusiness.enterPhoneNumber("1234567890");
		RegisterBusiness.enterBillingAddress("abc pvt ltd", "first Street", "secondd Lane", "ohio", "New York", "123456");
		RegisterBusiness.enterMobileNumber("1234567890");
		RegisterBusiness.enterpassword("123456@VS", "123456@VS");
		RegisterBusiness.clickMailingListToggle();
		RegisterBusiness.clickRegisterButton();
		String errorText = driver.findElement(By.xpath("//li[text()='Please complete the captcha and try again.']")).getText();
		Assert.assertEquals(errorText, "Please complete the captcha and try again.", "text is matched");
	
		
	}
	@Test (description = "Check if user is on correct page while validating title")
	public void titleValidation() {
		Assert.assertEquals(driver.getTitle(), "Register - PHPTRAVELS", "Title is correct");
	}
	
	@Test (description = "Check weather we are on correct page while validating URL")
	public void urlValidation() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://phptravels.org/register.php", "URL is correct");
	}
	
	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
