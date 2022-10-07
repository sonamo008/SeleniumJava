package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='userName']")
	private WebElement usernamefield;

	@FindBy(css = "input[name='password']")
	private WebElement passwordfield;

	@FindBy(css = "input[type='submit'],[class='authCommon_button__1kwT_ authCommon_btnText__32n4S']")
	WebElement SubmitButton;

	@FindBy(css = "input[type='submit'],[class='authCommon_button__1kwT_ authCommon_btnText__32n4S']")
	WebElement SubmitWithoutDataButtonClick;

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getSubmitWithoutDataButtonClick() {
		return SubmitWithoutDataButtonClick;
	}

	
}
