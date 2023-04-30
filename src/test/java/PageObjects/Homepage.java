package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(linkText="Register")
	WebElement linkregistaion;
	@FindBy(linkText = "Login")   // Login link added in step6
	WebElement linkLogin;
	
	public void clickkmyaccount() {
		
		linkmyaccount.click();
	}
	public void clickmyregistaion() {
		linkregistaion.click();
	}
	

    public void clickLogin()    // added in step6
    {
	linkLogin.click();
    }
	
	
}
