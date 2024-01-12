package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	/*
	 * Web elements
	 * use Encapsulation
	 * */
	
	@FindBy (xpath = "//h3[text()='Personal Information']")
	private WebElement textPersonalInformation;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy (xpath = "//input[@name='email']")
	private WebElement emailField;

	@FindBy (xpath = "//div[@class='flag-container']")
	private WebElement cuntryCode;
	
	@FindBy (xpath = "//input[@name='phonenumber']")
	private WebElement phoneNumber;
	
	@FindBy (xpath = "//h3[text()='Billing Address']")
	private WebElement textBillingAddress;

	
	@FindBy (xpath = "//input[@name='companyname']")
	private WebElement companyName;
	
	@FindBy (xpath = "//input[@name='address1']")
	private WebElement streetAddress1;

	@FindBy (xpath = "//input[@name='address2']")
	private WebElement streetAddress2;
	
	@FindBy (xpath = "//input[@name='city']")
	private WebElement city;
	
	@FindBy (xpath = "//input[@name='state']")
	private WebElement state;
	
	@FindBy (xpath = "//input[@name='postcode']")
	private WebElement pinCode;
	
	@FindBy (xpath = "//select[@name='country']")
	private WebElement SelectCountry;
	
	@FindBy (xpath = "//h3[text()='Additional Required Information']")
	private WebElement textAdditionalRequiredInformation;
	
	@FindBy (xpath = "//input[@id='customfield2']")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//h3[text()='Account Security']")
	private WebElement textAccouuntSecurity;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement newPassword;
	
	@FindBy (xpath = "//input[@name='password2']")
	private WebElement confirmPassword;
	
	@FindBy (xpath = "//h3[text()='Join our mailing list']")
	private WebElement textJoinOurMailingList;	
	
	@FindBy (xpath = "//div[contains(@class,'bootstrap-switch-on')]")
	private WebElement optionJoinOurMailingList;
	
	@FindBy (xpath = "//input[@value='Register']")
	private WebElement buttonRegister;
	
	public void getTextPersonalInformation() {
		textPersonalInformation.getText();
	}

	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void setEmail(String email) {
		emailField.sendKeys(email);
	}

	public void setCountryCode() {
		cuntryCode.click();
	}

	public void setPhoneNumber(String phonenumber) {
		phoneNumber.sendKeys(phonenumber);
	}

	public void getTextBillingAddress() {
		textBillingAddress.getText();
	}

	public void setCompanyName(String companyname) {
		companyName.sendKeys(companyname);;
	}

	public void setStreetAddress1(String streetaddress1) {
		streetAddress1.sendKeys(streetaddress1);
	}

	public void setStreetAddress2(String streetaddress2) {
		streetAddress2.sendKeys(streetaddress2);
	}

	public void setCity(String citye) {
		city.sendKeys(citye);
	}
	
	public void setState(String statee) {
		state.sendKeys(statee);
	}

	public void setPinCode(String pincode) {
		pinCode.sendKeys(pincode);
	}

	public void setSelectCountry(String selectcountry) {
		SelectCountry.sendKeys(selectcountry);
	}

	public void getTextAdditionalRequiredInformation() {
		textAdditionalRequiredInformation.getText();
	}

	public void setMobileNumber(String mobilenumber) {
		mobileNumber.sendKeys(mobilenumber);
	}

	public void getTextAccouuntSecurity() {
		textAccouuntSecurity.getText();
	}

	public void setNewPassword(String newpassword) {
		newPassword.sendKeys(newpassword);
	}

	public void setConfirmPassword(String confirmpassword) {
		confirmPassword.sendKeys(confirmpassword);
	}

	public void getTextJoinOurMailingList() {
		textJoinOurMailingList.getText();
	}

	public void clickOptionJoinOurMailingList() {
		optionJoinOurMailingList.click();
	}

	public void cickButtonRegister() {
		buttonRegister.click();
	}

	
	
	
}
