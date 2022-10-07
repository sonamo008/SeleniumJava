package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewEditPage {
	
	WebDriver driver;

	public ViewEditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text( )='VIEW/EDIT']")
	WebElement viewEdit;
	
	@FindBy(xpath="//input[@name='patientname']")
	WebElement patientNameField;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phoneNumberField;
	
	@FindBy(xpath="//div[text( )='sundar']")
	WebElement patientListClick;
	
	@FindBy(xpath="//button[text( )='Update']")
	WebElement updateButtonClick;
	
	@FindBy(xpath="//button[text( )='Cancel']")
	WebElement cancelButtonClick;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getViewEdit() {
		return viewEdit;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public WebElement getPatientListClick() {
		return patientListClick;
	}

	public WebElement getUpdateButtonClick() {
		return updateButtonClick;
	}

	public WebElement getCancelButtonClick() {
		return cancelButtonClick;
	}
	
	
	
	
}
