package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Base;

public class AddPatientPage extends Base {
	
	//WebDriver driver;

	public AddPatientPage() {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text( )='Patients'])[1]")
	WebElement patientsClick;
	
	@FindBy(xpath="//a[text( )='ADD PATIENT']")
	WebElement addPatientClick;
	
	@FindBy(name="patientname")
	WebElement patientNameField;
	
	@FindBy(name="phoneNumber")
	WebElement phoneNoField;
	
	@FindBy(name="occupation")
	WebElement OccupationField;
	
	@FindBy(name="emergency")
	WebElement emergencyField;
	
	@FindBy(name="address")
	WebElement addressField;
	
	@FindBy(name="allergies")
	WebElement allergiesField;
	
	@FindBy(xpath="//textarea[@class='CreatePatient_clinicalObservationInput__1YjjP']")
	WebElement remarksField;
	
	@FindBy(name="history")
	WebElement historyField;
	
	@FindBy(name="habits")
	WebElement habitsField;
	
	@FindBy(xpath="//a[@class='CreatePatient_addinvestigationtests__18P-9']")
	WebElement clickingPlusSign;
	
	@FindBy(xpath="//button[text( )='Save']")
	WebElement saveButton;

	//public WebDriver getDriver() {
		//return driver;
	//}

	public WebElement getPatientsClick() {
		return patientsClick;
	}

	public WebElement getAddPatientClick() {
		return addPatientClick;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getPhoneNoField() {
		return phoneNoField;
	}

	public WebElement getOccupationField() {
		return OccupationField;
	}

	public WebElement getEmergencyField() {
		return emergencyField;
	}

	public WebElement getAllergiesField() {
		return allergiesField;
	}

	public WebElement getRemarksField() {
		return remarksField;
	}

	public WebElement getHistoryField() {
		return historyField;
	}

	public WebElement getHabitsField() {
		return habitsField;
	}

	public WebElement getClickingPlusSign() {
		return clickingPlusSign;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	

}
