package Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public WebDriverWait webDriverWait;

	public WebDriver initializeDriver() {

		String browserName = "Chrome";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

	public void waitForElementVisibility(WebElement element, Duration sec, String pageElementName, WebDriver driver
			) throws Exception {

		webDriverWait = new WebDriverWait(driver, sec);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));

	}

	public void click(WebElement element, String pageElementName, WebDriver driver )
			throws Exception {

		waitForElementVisibility(element, Duration.ofSeconds(20), pageElementName, driver );
		element.click();

	}

	/*
	 * public String takeScreenShot(String testName,WebDriver driver) throws
	 * IOException { File srcFile=
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); String
	 * destFile=System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
	 * FileUtils.copyFile(srcFile, new File(destFile)); return destFile; }
	 */
}
