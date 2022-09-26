package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordTest extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() {
		log = LogManager.getLogger(TC_LoginTest_001.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test
	public void forgotpassword() throws InterruptedException {

		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.getForgotPassword().click();
		log.debug("Clicked On Application");
		fp.getUsernamefield().sendKeys("sonamo008");
		Thread.sleep(5000);
		fp.getResetButtonClick().click();

	}

	@Test
	public void BackLoginPage() throws InterruptedException {
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.getForgotPassword().click();
		log.debug("Clicked On Application");
		Thread.sleep(5000);
		fp.getBackLoginPage().click();

	}

}
