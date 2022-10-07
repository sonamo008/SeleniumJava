package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PatientVisitPage;

public class TC_PatientvisitTest_011 {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() throws InterruptedException {
		log = LogManager.getLogger(TC_LoginTest_001.class.getName());
		//driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}
	@Test
	public void PatientVisit() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(1000);
		lp.getSubmitButton().submit();
		log.debug("Clicked on Submit Button");
		Thread.sleep(2000);
		
		PatientVisitPage ppv = new PatientVisitPage(driver);
		ppv.getPatientvisitClick().click();
		log.debug("Clicked on Patient visit Tab");
		Thread.sleep(2000);
		ppv.getPatientVisitName().sendKeys("Sanyia");
		log.debug("Clicked on Patient visit Tab");
		Thread.sleep(2000);
		ppv.getPrimaryComplaint().sendKeys("Fever");
		log.debug("Clicked on Primary Complaint Tab");
		Thread.sleep(2000);		
		ppv.getSymptoms().sendKeys("Acidity");
		log.debug("Clicked on Primary Complaint Tab");
		Thread.sleep(2000);	
		ppv.getClickingPlusSign().click();
		log.debug("Clicked on Plus Sign");
		Thread.sleep(2000);	
		ppv.getInvestigationTests().sendKeys("Tests");
		log.debug("Clicked on Investigation tests");
		Thread.sleep(2000);
		ppv.getSaveButton().click();
		log.debug("Clicked on Save Button");
		Thread.sleep(2000);
	}
	
	@Test
	public void Followup() throws InterruptedException {
		
		PatientVisitPage ppv = new PatientVisitPage(driver);
		ppv.getFollowup().click();
		log.debug("Clicked on Followup Button");
		Thread.sleep(2000);
		ppv.getVisitReason().sendKeys("fever1");
		log.debug("Clicked on visitreason Button");
		Thread.sleep(2000);
		ppv.getAddAppointment().click();
		log.debug("Clicked on Followup Button");
		Thread.sleep(2000);
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
