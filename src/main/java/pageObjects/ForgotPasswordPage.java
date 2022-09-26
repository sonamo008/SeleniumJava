package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = (WebDriver) driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text( )='Forgot password?']")
	WebElement forgotpassword;

	@FindBy(name = "userName")
	WebElement usernamefield;

	@FindBy(xpath = "//button[text( )='Reset Password']")
	WebElement ResetButtonClick;

	@FindBy(xpath = "//a[text( )='Back to Login']")
	WebElement BackLoginPage;

	public WebElement getForgotPassword() {
		return forgotpassword;
	}

	public WebDriver getDriver() {
		return driver;

	}

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getResetButtonClick() {
		return ResetButtonClick;
	}

	public WebElement getBackLoginPage() {
		return BackLoginPage;
	}

}
