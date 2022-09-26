package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.RegistrationPage;
import pageObjects.VerifyregisterPage;

public class TC_RegistrationTest_003 extends Base {

	public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() {
		log = LogManager.getLogger(TC_RegistrationTest_003.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/register");
		log.debug("navigated to application URL");

	}

	@Test(priority = 1)
	public void Registration() throws InterruptedException {

		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bharti Jain");
		log.debug("Entered Name");
		Thread.sleep(1000);
		rp.getEmailfield().sendKeys("bharatijain2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(1000);
		rp.getUsernamefield().sendKeys("bharati2907");
		log.debug("Entered UserName");
		Thread.sleep(1000);
		rp.getConfirmusernamefield().sendKeys("bharati2907");
		log.debug("Entered ConfirmUserName");
		Thread.sleep(1000);
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");
		Thread.sleep(2000);
		rp.getClickregisterbutton().click();
		log.debug("Clicked On Register Button");

		Thread.sleep(2000);

		String ExpectedText = "Successful registration";
		Assert.assertEquals("Successful registration", ExpectedText);

		String msg = driver.findElement(By.tagName("body")).getText();
	}

	@Test(priority = 2)
	public void NotConfirmUsernameField() throws InterruptedException {
		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bhayu Jain");
		log.debug("Entered Name");
		Thread.sleep(2000);
		rp.getEmailfield().sendKeys("bhayuswal2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(2000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(2000);
		rp.getUsernamefield().sendKeys("bhayu2907");
		log.debug("Entered UserName");
		Thread.sleep(2000);
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");
		Thread.sleep(3000);
		rp.getClickregisterbutton().click();
		log.debug("Clicked On Register Button");

		Thread.sleep(3000);

		String ExpectedText = "Successful registration";
		Assert.assertEquals("Successful registration", ExpectedText);

		String msg = driver.findElement(By.tagName("body")).getText();

	}

	@Test(priority = 3)
	public void IncorrectConfirmUsernameField() throws InterruptedException {
		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bhayu Jain");
		log.debug("Entered Name");
		Thread.sleep(2000);
		rp.getEmailfield().sendKeys("bhayuswal2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(2000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(2000);
		rp.getUsernamefield().sendKeys("bhayu2907");
		log.debug("Entered UserName");
		Thread.sleep(2000);
		rp.getConfirmusernamefield().sendKeys("Saayyu2907");
		log.debug("Entered ConfirmUserName");
		Thread.sleep(2000);
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");
		Thread.sleep(3000);
		rp.getClickregisterbutton().click();
		log.debug("Clicked On Register Button");

		Thread.sleep(3000);

		String ExpectedText = "Registration Successful";
		Assert.assertEquals("Registration Successful ", ExpectedText);

		String msg = driver.findElement(By.tagName("body")).getText();

	}

	@Test(priority = 4)
	public void WithoutSelectingCheckBoxRegistration() throws InterruptedException {

		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bhayu Jain");
		log.debug("Entered Name");
		Thread.sleep(2000);
		rp.getEmailfield().sendKeys("bhayuswal2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(2000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(2000);
		rp.getUsernamefield().sendKeys("bhayu2907");
		log.debug("Entered UserName");
		Thread.sleep(2000);
		rp.getConfirmusernamefield().sendKeys("bhayu2907");
		log.debug("Entered ConfirmUserName");
		Thread.sleep(3000);
		rp.getClickregisterbutton().click();
		log.debug("Clicked On Register Button");

		Thread.sleep(3000);

		String ExpectedText = "Registration Successful";
		Assert.assertEquals("Registration Successful ", ExpectedText);

		String msg = driver.findElement(By.tagName("body")).getText();

	}

	@Test(priority = 5)
	public void WithoutDataRegistration() throws InterruptedException {

		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("");
		log.debug("Entered Name");
		rp.getEmailfield().sendKeys("");
		log.debug("Entered Email Address");
		rp.getMobilefield().sendKeys("");
		log.debug("Entered Phone Number");
		rp.getUsernamefield().sendKeys("");
		log.debug("Entered UserName");
		rp.getConfirmusernamefield().sendKeys("");
		log.debug("Entered ConfirmUserName");
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");

		Thread.sleep(3000);
		rp.getClickregisterbutton().click();
		log.debug("Clicked On Register Button");

		Thread.sleep(5000);

		String actualRegistrationMessage = driver.findElement(By.xpath("//span[contains(@class,'register_modalText')]"))
				.getText();

		String expectedRegistrationMessage = "Registration Successful";
		Assert.assertEquals(actualRegistrationMessage, expectedRegistrationMessage);

	}

	@Test(priority = 6)
	public void RegistrationwithImUser() throws InterruptedException {

		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bhayu Jain");
		log.debug("Entered Name");
		Thread.sleep(1000);
		rp.getEmailfield().sendKeys("bhayuswal2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(1000);
		rp.getUsernamefield().sendKeys("bhayu2907");
		log.debug("Entered UserName");
		Thread.sleep(1000);
		rp.getConfirmusernamefield().sendKeys("bhayu2907");
		log.debug("Entered ConfirmUserName");
		Thread.sleep(1000);
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");
		Thread.sleep(2000);
		// rp.getClickregisterbutton().click();
		// log.debug("Clicked On Register Button");

		// Thread.sleep(2000);

		rp.getClickImAlreadyUSer().click();

		VerifyregisterPage vp = new VerifyregisterPage(driver);

		String actual = null;
		try {
			if (vp.getVerifypageofIamAlreadyuser().isDisplayed()) {
				log.debug("user go to the login Page");
				actual = "successful";
			}
		} catch (Exception e) {
			log.debug("User didn't go to login page");

			actual = "failure";
		}

		Assert.assertTrue(vp.getVerifypageofIamAlreadyuser().isDisplayed());
	}

	@Test(priority = 7)
	public void RegistrationwithClickHelp() throws InterruptedException {

		RegistrationPage rp = new RegistrationPage(driver);
		// rp.getClickRegisterNow().click();
		log.debug("Clicked RegisterNow Button");
		rp.NameField.sendKeys("Bhayu Jain");
		log.debug("Entered Name");
		Thread.sleep(1000);
		rp.getEmailfield().sendKeys("bhayuswal2907@gmail.com");
		log.debug("Entered Email Address");
		Thread.sleep(1000);
		rp.getMobilefield().sendKeys("8087366616");
		log.debug("Entered Phone Number");
		Thread.sleep(1000);
		rp.getUsernamefield().sendKeys("bhayu2907");
		log.debug("Entered UserName");
		Thread.sleep(1000);
		rp.getConfirmusernamefield().sendKeys("bhayu2907");
		log.debug("Entered ConfirmUserName");
		Thread.sleep(1000);
		rp.getAgreetermcheckbox().click();
		log.debug("Clicked Checkbox");
		Thread.sleep(2000);

		rp.getClickHelp().click();
		
	}
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
		

	
	}
