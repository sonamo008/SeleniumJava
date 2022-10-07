package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.AddPrescriptionPage;
import pageObjects.LoginPage;
import pageObjects.ViewPrescriptionPage;

public class TC_ViewPrescriptionTest_009 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeClass
	public void openApplication() throws Exception {
		log = LogManager.getLogger(TC_ReportsTest_005.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test
	public void ViewPrescription() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(3000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(3000);
		lp.getSubmitButton().submit();

		AddPrescriptionPage pp = new AddPrescriptionPage(driver);
		pp.getclickPrescriptionlink().click();
		log.debug("Clicked on Link");
		Thread.sleep(2000);

		ViewPrescriptionPage vp = new ViewPrescriptionPage(driver);
		log.debug("Clicked On Submit Button");
		Thread.sleep(3000);
		// AddPrescriptionPage pp = new AddPrescriptionPage(driver);
		// pp.getclickPrescriptionlink().click();
		// log.debug("Clicked on Link");
		// Thread.sleep(2000);

		vp.getViewPrescriptionLink().click();
		log.debug("Clicked On View Prescription ");
		Thread.sleep(3000);
		vp.getPatientNameField().sendKeys("Sonam");
		log.debug("Entered Value as Sonam");
		Thread.sleep(2000);

	}
}
