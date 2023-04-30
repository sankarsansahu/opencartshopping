package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistationPage extends BasePage {

	public AccountRegistationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "firstname")
	WebElement txtFirstname;

	@FindBy(name = "lastname")
	WebElement txtLasttname;

	@FindBy(name = "email")
	WebElement txtEmail;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(name = "agree")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLasttname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setPrivacyPolicy() {
		chkdPolicy.click();

	}

	public void clickContinue() {

		btnContinue.click();}
		
		
		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());
		
	}

		}}
