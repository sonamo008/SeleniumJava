package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.AddPatientPage;
import pageObjects.AppointmentCalenderPage;
import pageObjects.LoginPage;

public class TC_AddPatientTest_009 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeClass
	public void openApplication() {
		log = LogManager.getLogger(TC_AddPatientTest_009.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test()
	public void AddPatient() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(3000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(3000);
		lp.getSubmitButton().submit();
		//click(lp.getSubmitButton(), "Submit Button", driver);
		log.debug("Clicked On Submit Button");
		Thread.sleep(3000);
		
		AddPatientPage app = new AddPatientPage();
		//click(app.getSaveButton(), "Gotit Button", driver);
		
		app.getPatientsClick().click();
		log.debug("Clicked on patients link");
		Thread.sleep(3000);
		app.getAddPatientClick().click();
		log.debug("Clicked on AddpatientTab");
		Thread.sleep(3000);
		app.getPatientNameField().sendKeys("SonamJain");
		log.debug("Entered Name");
		Thread.sleep(3000);
		app.getPhoneNoField().sendKeys("8087366616");
		log.debug("Entered PhoneNo");
		Thread.sleep(3000);
		app.getOccupationField().sendKeys("QA");
		log.debug("Entered Occupation");
		Thread.sleep(3000);
		app.getEmergencyField().sendKeys("1234567890");
		log.debug("Entered emergencyNumber");
		Thread.sleep(3000);
		app.getAllergiesField().sendKeys("Acidity");
		log.debug("Entered Acidity");
		Thread.sleep(3000);
		app.getRemarksField().sendKeys("Good");
		log.debug("Entered Remark value");
		Thread.sleep(3000);
		app.getHabitsField().sendKeys("Eating Chocolates");
		log.debug("Entered Habits value");
		Thread.sleep(3000);
		app.getSaveButton().click();
		log.debug("Clicked on Save Button");
		Thread.sleep(3000);

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
