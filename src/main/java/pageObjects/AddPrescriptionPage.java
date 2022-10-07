package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPrescriptionPage {
	
	public WebDriver driver;

	public AddPrescriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text( )='Prescription'])[1]")
	WebElement clickPrescriptionlink;
	
	@FindBy(name="patientname")
	WebElement patientNameField;
	
	@FindBy(name="email")
	WebElement emailField;
	
	@FindBy(xpath="//a[@class='AddPrescription_addinvestigationtests__BMTsR ']")
	WebElement clickingPlusSign;
	
	@FindBy(xpath="//input[@name='medicinesInput']")
	WebElement medicineNameField;
	
	@FindBy(xpath="//input[@name='daysInput']")
	WebElement totalNumberDays;
	
	@FindBy(xpath="//input[@name='timingsInput']")
	WebElement timingsInput;
	
	@FindBy(xpath="//input[@name='amountInput']")
	WebElement amountInput;
	
	@FindBy(xpath="//button[@class=' AddPrescription_buttonscom__3_zBx']")
	WebElement saveAndPrintButton;
	
	@FindBy(xpath="//a[@class='AddPrescription_buttonscom__3_zBx']")
	WebElement backButton;
	

	//public WebDriver getDriver() {
		//return driver;
	//}

	public WebElement getclickPrescriptionlink() {
		return clickPrescriptionlink;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getClickingPlusSign() {
		return clickingPlusSign;
	}

	public WebElement getMedicineNameField() {
		return medicineNameField;
	}

	public WebElement getTotalNumberDays() {
		return totalNumberDays;
	}

	public WebElement getTimingsInput() {
		return timingsInput;
	}

	public WebElement getAmountInput() {
		return amountInput;
	}

	public WebElement getSaveAndPrintButton() {
		return saveAndPrintButton;
	}

	public WebElement getBackButton() {
		return backButton;
	}

	public WebElement getSaveButton() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
}
