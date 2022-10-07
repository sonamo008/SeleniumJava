package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

import Resources.Base;
import pageObjects.LoginPage;
import pageObjects.ReportPage;

public class TC_ReportsTest_005 extends Base {

	//public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() throws Exception {
		log = LogManager.getLogger(TC_ReportsTest_005.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test(dependsOnMethods={"Tests.TC_LoginTest_001.login"})
	public void Reports() throws Exception {

		//LoginPage lp = new LoginPage(driver);
		//lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		//lp.getPasswordfield().sendKeys("sonam29");
		ReportPage rp = new ReportPage(driver);
		click(rp.getGotItButton(), "Gotit Button", driver);
		//lp.getSubmitButton().submit();
		//click(lp.getSubmitButton(), "Submit Button", driver);

		Thread.sleep(2000);

		rp.getGotItButton().click();
		rp.getClickReports().click();
		log.debug("Clicked on Reports");
		Thread.sleep(3000);
		waitForElementVisibility(rp.getClickAddPatient(), Duration.ofSeconds(20), "AddPatent", driver);
		rp.getClickAddPatient().click();
		log.debug("Clicked on Add Patient");
		waitForElementVisibility(rp.getPatientNameField(), Duration.ofSeconds(20), "AddPatent", driver);
		// Thread.sleep(3000);
		rp.getPatientNameField().sendKeys("Sonam");
		log.debug("Entering Name");
		Thread.sleep(3000);
		rp.getPhonenumberField().sendKeys("8087366616");
		log.debug("Entering PhoneNumber");
		Thread.sleep(3000);
		rp.getOccupationField().sendKeys("QA");
		log.debug("Entering QA value");
		Thread.sleep(3000);
		rp.getAddressField().sendKeys("930,DharmapuriWai");
		log.debug("Entering Address");
		Thread.sleep(3000);
		rp.getEmergencyField().sendKeys("1234567890");
		log.debug("Entering Emergency Number");
		Thread.sleep(3000);
		rp.getAllergiesField().sendKeys("Acidity");
		log.debug("Entering Value");
		Thread.sleep(3000);
		rp.getHistoryField().sendKeys("Normal");
		log.debug("Entering Value");
		Thread.sleep(3000);
		rp.getHabitsField().sendKeys("Eating Chocolates");
		log.debug("Entering Value");
		Thread.sleep(3000);
		rp.getClickSaveButton().click();
		log.debug("Clicking Save Button");
		Thread.sleep(3000);

	}

	@Test(dependsOnMethods={"Tests.TC_LoginTest_001.login"})
	public void PatientsTab() throws Exception {

		//LoginPage lp = new LoginPage(driver);
		//lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		//lp.getPasswordfield().sendKeys("sonam29");
		ReportPage rp = new ReportPage(driver);
		click(rp.getGotItButton(), "Gotit Button", driver);
		//lp.getSubmitButton().submit();
		//click(lp.getSubmitButton(), "Submit Button", driver);

		rp.getClickReports().click();
		Thread.sleep(3000);
		log.debug("Clicked on Reports");
		rp.getPatientsTab().click();
		log.debug("Clicked On Patients Tab");
		Thread.sleep(3000);
		rp.getYearlyTab().click();
		log.debug("Clicked on Yrly Tab");
		Thread.sleep(3000);
		rp.getMonthlyTab().click();
		log.debug("Clicked on Monthly Tab");
		Thread.sleep(3000);
		rp.getWeeklyTab().click();
		log.debug("Clicked on Weekly Tab");
		Thread.sleep(3000);
		rp.getDailyTab().click();
		log.debug("Clicked on Daily Tab");
		Thread.sleep(3000);

	}

	@Test(dependsOnMethods={"Tests.TC_LoginTest_001.login"})
	public void Cancel() throws Exception {
		//LoginPage lp = new LoginPage(driver);
		//lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		//lp.getPasswordfield().sendKeys("sonam29");
		ReportPage rp = new ReportPage(driver);
		//click(rp.getGotItButton(), "Gotit Button", driver);
		//lp.getSubmitButton().submit();
		//click(lp.getSubmitButton(), "Submit Button", driver);

		rp.getClickReports().click();
		Thread.sleep(3000);
		log.debug("Clicked on Reports");
		Thread.sleep(3000);
		rp.getCancelButton().click();
		log.debug("Clicked on Cancel");
		Thread.sleep(3000);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
