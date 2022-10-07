package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.AddPrescriptionPage;
import pageObjects.LoginPage;

public class TC_AddPrescriptionTest_008 extends Base {

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
	public void AddPrescription() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		log.debug("Entered Email Address");
		Thread.sleep(3000);
		lp.getPasswordfield().sendKeys("sonam29");
		log.debug("Entered Password");
		Thread.sleep(3000);
		lp.getSubmitButton().submit();
		AddPrescriptionPage pp = new AddPrescriptionPage(driver);
		//click(pp.getSaveButton(), "Gotit Button", driver);
		
		//click(lp.getSubmitButton(), "Submit Button", driver);
		log.debug("Clicked On Submit Button");
		Thread.sleep(3000);
							
		
		//driver.findElement(By.xpath("(//a[text()='Prescription'])[1]")).click();
		pp.getclickPrescriptionlink().click();
		log.debug("Clicked on Link");
		Thread.sleep(2000);
		pp.getPatientNameField().sendKeys("sonam");
		log.debug("Entered Value in patientfield");
		Thread.sleep(2000);
		pp.getEmailField().sendKeys("sonamoswal2907@gmail.com");
		log.debug("Entered Value in emailfield");
		Thread.sleep(2000);
		pp.getClickingPlusSign().click();
		log.debug("Clicked On Plus Sign");
		Thread.sleep(2000);
		pp.getMedicineNameField().sendKeys("Dolo650");
		log.debug("Entered Value as Dolo650");
		Thread.sleep(2000);
		pp.getTotalNumberDays().sendKeys("12");
		log.debug("Entered No of Days");
		Thread.sleep(2000);
		pp.getTimingsInput().sendKeys("Morning");
		log.debug("Entered Time Zone");
		Thread.sleep(2000);
		pp.getAmountInput().sendKeys("2mg");
		log.debug("Entered Amount to be Taken");
		Thread.sleep(2000);
		pp.getSaveAndPrintButton().click();
		log.debug("Clicked On Save Button");
		Thread.sleep(2000);
		pp.getBackButton().click();
		log.debug("Clicked On Back Button");
		Thread.sleep(4000);
	}
		
		//@AfterClass
		//public void tearDown() {
			//driver.close();
		//}
		
	}

		

