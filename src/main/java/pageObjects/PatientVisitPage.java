package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientVisitPage {
	
	WebDriver driver;

	public PatientVisitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//a[@class='patientDetails_buttonactive__22z18 patientDetails_anchorlinks__Lg6As']") 
    WebElement patientvisitClick;
    
    @FindBy(xpath="//input[@class='PatientVisit_patientnameinput__53SG5']")
    WebElement patientVisitName;
    
    @FindBy(xpath="//input[@class='PatientVisit_primaryComplaininput__23WPZ']")
    WebElement primaryComplaint;
    
    @FindBy(xpath="//input[@name='symtomsIndicationsInput']")
    WebElement symptoms;
    
    @FindBy(xpath="//a[@class='PatientVisit_addsymtoms__1b_WG ']")
    WebElement clickingPlusSign;
    
    @FindBy(xpath="//input[@name='investigationtests']")
    WebElement InvestigationTests;
    
    @FindBy(xpath="//a[@class='PatientVisit_addinvestigationtests__3VHP_ PatientVisit_indication150__I0XhM']")
    WebElement clickingInvestigationTest;
    
    @FindBy(xpath="//a[@class=' PatientVisit_buttonscom__2NWJ0']")
    WebElement saveButton;
    
    @FindBy(xpath="//a[@class='PatientVisit_buttonscom__2NWJ0']")
    WebElement followup;
    
    @FindBy(xpath="//input[@name='visitReason']")
    WebElement visitReason;
    
    @FindBy(xpath="//a[text( )='Add Appointment']")
    WebElement addAppointment;

	public WebElement getPatientvisitClick() {
		return patientvisitClick;
	}

	public WebElement getPatientVisitName() {
		return patientVisitName;
	}

	public WebElement getPrimaryComplaint() {
		return primaryComplaint;
	}

	public WebElement getClickingPlusSign() {
		return clickingPlusSign;
	}

	public WebElement getSymptoms() {
		return symptoms;
	}

	public WebElement getInvestigationTests() {
		return InvestigationTests;
	}

	public WebElement getClickingInvestigationTest() {
		return clickingInvestigationTest;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getFollowup() {
		return followup;
	}

	public WebElement getAddAppointment() {
		return addAppointment;
	}

	public WebElement getVisitReason() {
		return visitReason;
	}
    
	
    
    
    
	
	
}
