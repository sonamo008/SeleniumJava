package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.ViewEditPage;

public class TC_ViewEditTest_010 extends Base{
	
	//public WebDriver driver;
	Logger log;

	@BeforeMethod
	public void openApplication() throws Exception {
		log = LogManager.getLogger(TC_ViewEditTest_010.class.getName());
		driver = initializeDriver();
		log.debug("Browser got launched");

		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
		log.debug("navigated to application URL");

	}
	@Test
	public void ViewEdit() throws InterruptedException {
		
		ViewEditPage vp = new ViewEditPage(driver);
		vp.getViewEdit().click();
		log.debug("Clicked On ViewEditTab");
		Thread.sleep(3000);
	}
	

}
