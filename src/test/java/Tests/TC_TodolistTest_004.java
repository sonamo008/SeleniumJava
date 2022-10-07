package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.With;
import pageObjects.LoginPage;
import pageObjects.TodolistPage;

public class TC_TodolistTest_004 extends Base {

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
	public void Todolist() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();

		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		log.debug("Clicking plus Sign");
		td.getTaskfield().sendKeys("Cleaning");
		log.debug("Entering Value");
		td.getAddtask().click();
		log.debug("Clicked on Add Task Button");
		Thread.sleep(5000);
		td.getCancelAddNewTask().click();
		log.debug("Cancelling task");
		Thread.sleep(5000);
		td.getClickingComplete().click();
		log.debug("Clicked on Clicking Complete");
		Thread.sleep(2000);
		td.getDeleteTask().click();
		log.debug("Deleting task");
		Thread.sleep(3000);
		td.getViewCompletedTask().click();

		String msg = null;
		if (msg.contains("Task record Added")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void WithoutDueDate() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();
		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		Thread.sleep(2000);
		td.getTaskfield().sendKeys("Cleaning");
		log.debug("Entering Task Value");
		Thread.sleep(2000);
		td.getWithoutDueDate().click();
		log.debug("Clicked on cross Button");
		Thread.sleep(2000);
		td.getAddtask().click();
		log.debug("Clicked on Add Task Button");
		Thread.sleep(2000);
	}

	@Test
	public void ViewCompletedTasks() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();
		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		log.debug("Clicked on plus Sign");
		Thread.sleep(5000);
		td.getViewCompletedTask().click();
		log.debug("Clicked on Completed Task");
		Thread.sleep(5000);
	}

	@Test
	public void ViewOpenTask() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();
		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		log.debug("Clicked on plus Sign");
		Thread.sleep(5000);
		td.getViewCompletedTask().click();
		log.debug("Clicked on Completed Task");
		Thread.sleep(5000);
		td.getViewOpenTask();
		log.debug("Clicked on view Open Task");
		Thread.sleep(5000);

	}

	@Test
	public void WithoutMandatoryField() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();
		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		log.debug("Clicked on plus Sign");
		Thread.sleep(5000);
		td.getAddtask().click();
		log.debug("Clicked on Add Task Button");
		Thread.sleep(6000);

	}
	
	@Test
	public void WithDueDate() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamefield().sendKeys("sonamo008@aanksolutions.in");
		lp.getPasswordfield().sendKeys("sonam29");
		lp.getSubmitButton().submit();
		Thread.sleep(2000);

		TodolistPage td = new TodolistPage(driver);
		td.getWithDueDate().click();
		Thread.sleep(2000);
		td.getTaskfield().sendKeys("Cleaning");
		log.debug("Entering Task Value");
		Thread.sleep(2000);
		td.getDateSelect().click();
		log.debug("Clicked on Date");
		Thread.sleep(2000);
		td.getAddtask().click();
		log.debug("Clicked on Add Task Button");
		Thread.sleep(2000);
	}

	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
