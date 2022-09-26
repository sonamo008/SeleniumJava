package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LoginPage;
import pageObjects.MyPage;

public class TC_LoginDDT_002 extends Base {

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

	@Test(dataProvider = "getLoginData")
	public void login(String email, String pass, String expected) throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys(email);
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		lp.getPasswordfield().sendKeys(pass);
		log.debug("Entered Password");
		Thread.sleep(1000);
		lp.getSubmitButton().submit();
		log.debug("Clicked on Submit Button");

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

	@AfterMethod
	public void tearDown() {
		driver.close();
		log.debug("Browser got closed");
	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "sonamo008@aanksolutions.in", "soanam29", "successful" },
				{ "sample@test.com", "sonam29", "failure" }, { "sonamo008@aanksolutions.in", "saniya", "failure" },
				{ "", "", "" }, };

		return data;
	}

	
	

	}


