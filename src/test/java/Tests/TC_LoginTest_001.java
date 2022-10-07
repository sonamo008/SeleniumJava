package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LoginPage;
import pageObjects.MyPage;

public class TC_LoginTest_001 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() throws InterruptedException {
		log = LogManager.getLogger(TC_LoginTest_001.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}

	@Test(priority=1)
	public void login() throws InterruptedException {

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
		//driver.navigate().back();

		Thread.sleep(5000);

		MyPage mp = new MyPage(driver);

		String actual = null;
		try {
			if (mp.getEditaccinfo().isDisplayed()) {
				log.debug("user got logged in");
				actual = "successful";
			}
		} catch (Exception e) {
			log.debug("User didn't login");

			actual = "failure";
		}

		Assert.assertTrue(mp.getEditaccinfo().isDisplayed());
		
	}
	
	@Test(priority=2)
	public void SubmitButtonWithoutData() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("");
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		lp.getPasswordfield().sendKeys("");
		log.debug("Entered Password");
		Thread.sleep(1000);
		lp.getSubmitWithoutDataButtonClick().click();
		log.debug("Clicked on Submit Button");

		Thread.sleep(5000);MyPage mp = new MyPage(driver);

		String actual = null;
		try {
			if (mp.getEditaccinfo().isDisplayed()) {
				log.debug("user got logged in");
				actual = "successful";
			}
		} catch (Exception e) {
			log.debug("User didn't login");

			actual = "failure";
		}

		Assert.assertTrue(mp.getEditaccinfo().isDisplayed());
		
	}
		
	

}

