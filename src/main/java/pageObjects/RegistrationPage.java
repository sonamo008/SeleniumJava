package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register Now']")
	WebElement ClickRegisterNow;

	@FindBy(name = "fullName")
	public WebElement NameField;

	@FindBy(name = "email")
	WebElement emailfield;

	@FindBy(name = "mobile")
	WebElement mobilefield;

	@FindBy(name = "userName")
	WebElement usernamefield;

	@FindBy(name = "confirmUserName")
	WebElement confirmusernamefield;

	@FindBy(name = "agreeterm")
	WebElement agreetermcheckbox;

	@FindBy(xpath = "//button[text()='Register']")
	WebElement clickregisterbutton;

	@FindBy(xpath = "//span[text( )='Please check your email for login instructions']")
	WebElement SuccessMsg;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/form/div/div[2]/div[9]/div/a")
	WebElement ClickImAlreadyUSer;

	@FindBy(xpath = "//a[@class='TooltipAuth_helpTag__DvHOH']")
	WebElement clickHelp;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickRegisterNow() {
		return ClickRegisterNow;
	}

	public WebElement getNameField() {
		return NameField;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getMobilefield() {
		return mobilefield;
	}

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getConfirmusernamefield() {
		return confirmusernamefield;
	}

	public WebElement getAgreetermcheckbox() {
		return agreetermcheckbox;
	}

	public WebElement getClickregisterbutton() {
		return clickregisterbutton;
	}

	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}

	public WebElement getClickImAlreadyUSer() {
		return ClickImAlreadyUSer;
	}

	public WebElement getClickHelp() {
		return clickHelp;
	}
}
