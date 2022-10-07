package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.HomePageAppointment;
import pageObjects.LoginPage;

public class TC_HomePageAppointmentTest_006 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() {
		log = LogManager.getLogger(TC_HomePageAppointmentTest_006.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test
	public void Appointment() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getClickingplus().click();
		log.debug("Clicked Plus Sign");
		hp.getNameField().sendKeys("Sohit");
		log.debug("Entered Name");
		Thread.sleep(2000);
		hp.getLastNameField().sendKeys("Jain");
		log.debug("Entered LastName");
		Thread.sleep(2000);
		hp.getVisitReasonField().sendKeys("Fever1");
		log.debug("Entered VisitReason");
		Thread.sleep(2000);
		hp.getMobileField().sendKeys("8087366616");
		log.debug("Entered MobileNo.");
		Thread.sleep(2000);
		hp.getAddAppointmentButton().click();
		Thread.sleep(3000);

	}

	@Test
	public void CancelAppointment() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getCancelExistingAppointment().click();
		log.debug("Clicked on  x ");
		Thread.sleep(3000);

	}

	@Test
	public void EditExistingAppointment() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getEditExistingAppointment().click();
		log.debug("clicked on Edit option");
		Thread.sleep(3000);
		hp.getMobileField().clear();
		Thread.sleep(3000);
		hp.getMobileField().sendKeys("8087366686");
		Thread.sleep(3000);
		hp.getUpdateButton().click();
		log.debug("clicked on Update Button");
		Thread.sleep(3000);

	}

	@Test
	public void ClickSMSReminder() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getSMSReminder().click();
		log.debug("Clicking on SMS Reminder");
		Thread.sleep(3000);

	}

	@Test
	public void ClickAgainSMSReminder() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getClickingplus().click();
		log.debug("Clicked Plus Sign");
		hp.getNameField().sendKeys("Sohit");
		log.debug("Entered Name");
		Thread.sleep(2000);
		hp.getLastNameField().sendKeys("Jain");
		log.debug("Entered LastName");
		Thread.sleep(2000);
		hp.getVisitReasonField().sendKeys("Fever1");
		log.debug("Entered VisitReason");
		Thread.sleep(2000);
		hp.getMobileField().sendKeys("8087366617");
		log.debug("Entered MobileNo.");
		Thread.sleep(2000);
		hp.getSMSReminder().click();
		log.debug("Clicking again on SMS Reminder");
		Thread.sleep(3000);
	}

	@Test
	public void EditingPhoneNumber() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		HomePageAppointment hp = new HomePageAppointment(driver);
		hp.getEditExistingAppointment().click();
		log.debug("clicked on Edit option");
		Thread.sleep(3000);
		hp.getMobileField().sendKeys("8087366686");
		log.debug("Entered MobileNo.");
		Thread.sleep(2000);
		hp.getUpdateButton().click();
		log.debug("clicked on Update Button");
		Thread.sleep(3000);
		hp.getSMSReminder().click();
		log.debug("Clicking again on SMS Reminder");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
