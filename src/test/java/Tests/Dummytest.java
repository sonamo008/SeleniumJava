package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.Base;


   public class Dummytest extends Base {
	   public WebDriver driver;
	
	@Test   
	public void dummytest() throws InterruptedException {
		
		driver = initializeDriver();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		Assert.assertTrue(false);
		driver.close();






   }

}
