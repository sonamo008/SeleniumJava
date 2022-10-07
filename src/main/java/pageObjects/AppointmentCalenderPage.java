package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentCalenderPage {

	//WebDriver driver;

	public AppointmentCalenderPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Appointments")
	WebElement clickAppointmentCalender;

	@FindBy(xpath = "//button[text( )='NEW APPOINTMENT']")
	WebElement NewAppointment;

	@FindBy(xpath = "//*[contains(text(),'Got it')]")
	WebElement gotItButton;

	@FindBy(name = "firstname")
	WebElement firstNameField;

	@FindBy(name = "lastname")
	WebElement lastNameField;

	@FindBy(name = "visitreason")
	WebElement visitreasonField;

	@FindBy(name = "contactnumber")
	WebElement contactNumberField;

	@FindBy(xpath = "//button[text( )='Save Appointment']")
	WebElement saveAppointmentButton;

	@FindBy(xpath = "//button[text( )='Month']")
	WebElement monthButton;

	@FindBy(xpath = "//button[text( )='Week']")
	WebElement weekButton;

	@FindBy(xpath = "//button[text( )='Day']")
	WebElement dayButton;

	@FindBy(xpath = "//button[text( )='Agenda']")
	WebElement agendaButton;

	@FindBy(xpath = "//button[text( )='Today']")
	WebElement todaybuttonWeek;

	@FindBy(xpath = "//button[text( )='Back']")
	WebElement backButtonWeek;

	@FindBy(xpath = "//button[text( )='Next']")
	WebElement nextButtonWeek;

	@FindBy(xpath = "//button[text( )='Today']")
	WebElement todayAgendaButton;

	@FindBy(xpath = "//button[text( )='Back']")
	WebElement backAgendaButton;

	@FindBy(xpath = "//button[text( )='Next']")
	WebElement nextAgendaButton;
	
	@FindBy(xpath="//div[text( )='gg']")
    WebElement existingAppointment;
	
	@FindBy(xpath="//button[text( )='Today']")
	WebElement dayToday;
	
	@FindBy(xpath="//button[text( )='Back']")
	WebElement backDay;
	
	@FindBy(xpath="//button[text( )='Next']")
	WebElement nextDay;
	
	@FindBy(xpath="//button[text( )='Today']")
	WebElement todayMonth;
	
	@FindBy(xpath="//button[text( )='Back']")
	WebElement backMonth;
	
	@FindBy(xpath="//button[text( )='Next']")
	WebElement nextMonth;
	
	public WebElement getGotItButton() {
		return gotItButton;
	}

	//public WebDriver getDriver() {
		//return driver;
	//}

	public WebElement getNewAppointment() {
		return NewAppointment;
	}

	public WebElement getClickAppointmentCalender() {
		return clickAppointmentCalender;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getVisitreasonField() {
		return visitreasonField;
	}

	public WebElement getContactNumberField() {
		return contactNumberField;
	}

	public WebElement getSaveAppointmentButton() {
		return saveAppointmentButton;
	}

	public WebElement getMonthButton() {
		return monthButton;
	}

	public WebElement getWeekButton() {
		return weekButton;
	}

	public WebElement getDayButton() {
		return dayButton;
	}

	public WebElement getAgendaButton() {
		return agendaButton;
	}

	public WebElement getTodaybuttonWeek() {
		return todaybuttonWeek;
	}

	public WebElement getBackButtonWeek() {
		return backButtonWeek;
	}

	public WebElement getNextButtonWeek() {
		return nextButtonWeek;
	}

	public WebElement getTodayAgendaButton() {
		return todayAgendaButton;
	}

	public WebElement getBackAgendaButton() {
		return backAgendaButton;
	}

	public WebElement getNextAgendaButton() {
		return nextAgendaButton;
	}

	public WebElement getExistingAppointment() {
		return existingAppointment;
	}

	public WebElement getDayToday() {
		return dayToday;
	}

	public WebElement getBackDay() {
		return backDay;
	}

	public WebElement getNextDay() {
		return nextDay;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getTodayMonth() {
		return todayMonth;
	}

	public WebElement getBackMonth() {
		return backMonth;
	}
	
	
	
	

	
	
}
