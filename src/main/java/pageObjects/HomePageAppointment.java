package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAppointment {

	WebDriver driver;

	public HomePageAppointment(WebDriver driver) {
		this.driver = (WebDriver) driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[contains(@class,'nextAppointment_addition_')]")
	WebElement Clickingplus;

	@FindBy(name = "firstName")
	WebElement NameField;

	@FindBy(name = "lastName")
	WebElement LastNameField;

	@FindBy(name = "visitReason")
	WebElement VisitReasonField;

	@FindBy(name = "mobile")
	WebElement MobileField;

	@FindBy(xpath = "//button[text( )='Add Appointment']")
	WebElement AddAppointmentButton;

	@FindBy(linkText = "X")
	WebElement CancelExistingAppointment;

	@FindBy(xpath = "//a[@class='nextAppointment_edit__teObG']")
	WebElement EditExistingAppointment;

	@FindBy(xpath = "//button[@id='cursorStyle']")
	WebElement UpdateButton;
	
	@FindBy(xpath="//button[@class='nextAppointment_smsnotification__3AA2j']")
	WebElement SMSReminder;

	public WebElement getClickingplus() {
		return Clickingplus;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNameField() {
		return NameField;
	}

	public WebElement getLastNameField() {
		return LastNameField;
	}

	public WebElement getVisitReasonField() {
		return VisitReasonField;
	}

	public WebElement getMobileField() {
		return MobileField;
	}

	public WebElement getAddAppointmentButton() {
		return AddAppointmentButton;
	}

	public WebElement getCancelExistingAppointment() {
		return CancelExistingAppointment;
	}

	public WebElement getEditExistingAppointment() {
		return EditExistingAppointment;
	}

	public WebElement getUpdateButton() {
		return UpdateButton;
	}

	public WebElement getSMSReminder() {
		return SMSReminder;
	}

	
}
