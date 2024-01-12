package businessLibrary;

import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass;
import pageObjectRepository.RegisterPage;

public class RegisterBusiness extends BaseClass {

	public static void personalInformationText() {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.getTextPersonalInformation();
	}
	public static void enterFirstName(String firstname) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setFirstName(firstname);
	}
	public static void enterLastName(String lastname) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setLastName(lastname);
	}
	public static void enterEmail(String email) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setEmail(email);
	}
	public static void enterPhoneNumber(String phoneNumber) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setPhoneNumber(phoneNumber);
	}
	
	public static void enterBillingAddress(String companyName, String address1, String address2, String city, String state, String postalCode) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setCompanyName(companyName);
		rp.setStreetAddress1(address1);
		rp.setStreetAddress2(address2);
		rp.setCity(city);
		rp.setState(state);
		rp.setPinCode(postalCode);
	}
	
	public static void enterMobileNumber(String mobileNumber) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setMobileNumber(mobileNumber);
	}
	
	public static void enterpassword(String newPassword, String confirmPassword) {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.setNewPassword(newPassword);
		rp.setConfirmPassword(confirmPassword);
	}
	
	public static void clickMailingListToggle() {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.clickOptionJoinOurMailingList();;
	}
	
	public static void clickRegisterButton() {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.cickButtonRegister();;
	}
	
	
	
	
}
