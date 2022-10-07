package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {

	WebDriver driver;

	public ReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"responsive-navbar-nav\"]/div[1]/li[5]/a")
	WebElement ClickReports;

	@FindBy(xpath = "//button[@class='reports_button__UT7hg']")
	WebElement ClickAddPatient;

	@FindBy(name = "patientname")
	WebElement PatientNameField;

	@FindBy(name = "phoneNumber")
	WebElement PhonenumberField;

	@FindBy(name = "occupation")
	WebElement OccupationField;

	@FindBy(name = "emergency")
	WebElement EmergencyField;

	@FindBy(name = "address")
	WebElement AddressField;

	@FindBy(name = "allergies")
	WebElement AllergiesField;

	@FindBy(className = "CreatePatient_diagnosisRemarkInput__2xCRI")
	WebElement RemarksField;

	@FindBy(name = "history")
	WebElement HistoryField;

	@FindBy(name = "habits")
	WebElement HabitsField;

	@FindBy(xpath = "//button[text( )='Save']")
	WebElement ClickSaveButton;

	@FindBy(xpath = "//*[contains(text(),'Got it')]")
	WebElement gotItButton;

	@FindBy(xpath = "//button[@class='reports_cancel__2pOmr']")
	WebElement patientsTab;

	@FindBy(xpath = "//button[@class='reports_buttonactive__1z9kS reports_topbtns__3csCF']")
	WebElement yearlyTab;

	@FindBy(xpath = "//button[@class='reports_buttonactive__1z9kS reports_topbtns__3csCF']")
	WebElement monthlyTab;

	@FindBy(xpath = "//button[text( )='Weekly']")
	WebElement weeklyTab;

	@FindBy(xpath = "//button[text( )='Daily']")
	WebElement dailyTab;
	
	@FindBy(xpath="//a[@title='Cancel']")
	WebElement cancelButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickReports() {
		return ClickReports;
	}

	public WebElement getClickAddPatient() {
		return ClickAddPatient;
	}

	public WebElement getPatientNameField() {
		return PatientNameField;
	}

	public WebElement getPhonenumberField() {
		return PhonenumberField;
	}

	public WebElement getOccupationField() {
		return OccupationField;
	}

	public WebElement getEmergencyField() {
		return EmergencyField;
	}

	public WebElement getAddressField() {
		return AddressField;
	}

	public WebElement getAllergiesField() {
		return AllergiesField;
	}

	public WebElement getRemarksField() {
		return RemarksField;
	}

	public WebElement getHistoryField() {
		return HistoryField;
	}

	public WebElement getHabitsField() {
		return HabitsField;
	}

	public WebElement getClickSaveButton() {
		return ClickSaveButton;
	}

	public WebElement getGotItButton() {
		return gotItButton;
	}

	public WebElement getPatientsTab() {
		return patientsTab;
	}

	public WebElement getYearlyTab() {
		return yearlyTab;
	}

	public WebElement getMonthlyTab() {
		return monthlyTab;
	}

	public WebElement getWeeklyTab() {
		return weeklyTab;
	}

	public WebElement getDailyTab() {
		return dailyTab;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	

}
