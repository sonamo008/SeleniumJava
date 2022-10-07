package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.AppointmentCalenderPage;
import pageObjects.LoginPage;
import pageObjects.ReportPage;

public class TC_AppointmentCalenderTest_007 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() {
		log = LogManager.getLogger(TC_AppointmentCalenderTest_007.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test
	public void NewAppointment() throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(3000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(3000);
		AppointmentCalenderPage ap = new AppointmentCalenderPage(driver);
		click(ap.getGotItButton(), "Gotit Button", driver);
		lp.getSubmitButton().submit();
		click(lp.getSubmitButton(), "Submit Button", driver);
		log.debug("Clicked On Submit Button");
		Thread.sleep(3000);
		ap.getClickAppointmentCalender().click();
		log.debug("Clicked On Appointment Link");
		Thread.sleep(3000);
		ap.getNewAppointment().click();
		log.debug("Clicked On New Appointment Button");
		Thread.sleep(3000);
		ap.getFirstNameField().sendKeys("sonam");
		log.debug("Entered value as Sonam");
		Thread.sleep(3000);
		ap.getLastNameField().sendKeys("Jain");
		log.debug("Entered value as Jain");
		Thread.sleep(3000);
		ap.getVisitreasonField().sendKeys("Fever");
		log.debug("Entered value fever");
		Thread.sleep(4000);
		ap.getSaveAppointmentButton().click();
		log.debug("Clicking on Save Button");
		Thread.sleep(5000);
		ap.getMonthButton().click();
		log.debug("Clicked on Month Button");
		Thread.sleep(5000);
		ap.getWeekButton().click();
		log.debug("Clicked on Week Button");
		Thread.sleep(5000);
		ap.getTodaybuttonWeek().click();
		log.debug("Clicked on Week Today Button");
		Thread.sleep(5000);
		ap.getBackButtonWeek().click();
		log.debug("Clicked on Week Back Button");
		Thread.sleep(5000);
		ap.getNextButtonWeek().click();
		log.debug("Clicked on Week Next Button");
		Thread.sleep(5000);
		ap.getDayButton().click();
		log.debug("Clicked on Day Button");
		Thread.sleep(5000);
		ap.getAgendaButton().click();
		log.debug("Clicked on Agenda Button");
		Thread.sleep(5000);
		ap.getTodayAgendaButton().click();
		log.debug("Clicked on Toady Agenda  Button");
		Thread.sleep(5000);
		ap.getBackAgendaButton().click();
		log.debug("Clicked on Back Agenda  Button");
		Thread.sleep(5000);
		ap.getNextAgendaButton().click();
		log.debug("Clicked on Next Agenda  Button");
		Thread.sleep(5000);
		ap.getDayToday().click();
		log.debug("Clicked on Today Day Button");
		Thread.sleep(3000);
		ap.getBackDay().click();
		log.debug("Clicked on Back Day Button");
		Thread.sleep(3000);
		ap.getNextDay().click();
		log.debug("Clicked on next Day Button");
		Thread.sleep(3000);
		ap.getTodayMonth();
		log.debug("Clicked on today month Button");
		Thread.sleep(3000);
		ap.getBackMonth().click();
		log.debug("Clicked on back month Button");
		Thread.sleep(3000);
		ap.getNextMonth().click();
		log.debug("Clicked on next month Button");
		Thread.sleep(3000);

	}

	@Test
	public void ExistingAppointment() throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(3000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(3000);
		AppointmentCalenderPage ap = new AppointmentCalenderPage(driver);
		click(ap.getGotItButton(), "Gotit Button", driver);
		lp.getSubmitButton().submit();
		click(lp.getSubmitButton(), "Submit Button", driver);
		log.debug("Clicked On Submit Button");
		Thread.sleep(3000);
		ap.getClickAppointmentCalender().click();
		log.debug("Clicked On Appointment Link");
		Thread.sleep(3000);
		ap.getNewAppointment().click();
		log.debug("Clicked On New Appointment Button");
		Thread.sleep(3000);
		ap.getExistingAppointment().click();
		log.debug("Clicked On New Existing Appointment");
		Thread.sleep(3000);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
