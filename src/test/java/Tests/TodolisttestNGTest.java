package Tests;

import org.testng.Assert;
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

public class TodolisttestNGTest extends Base {

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
		td.getTaskfield().sendKeys("Cleaning");
		td.getAddtask().click();
		Thread.sleep(5000);
		td.getCancelAddNewTask().click();
		Thread.sleep(5000);
		td.getClickingComplete().click();
		Thread.sleep(2000);
		td.getDeleteTask().click();
		Thread.sleep(3000);
		td.getViewCompletedTask().click();

		String msg = null;
		if (msg.contains("Task record Added")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
