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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


        WebDriver driver;
        
     public WebDriver initializeDriver()  {
    	 
    	 String browserName="Chrome";
    	 
    	    	    	    	 
 		WebDriverManager.chromedriver().setup();
 		driver= new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 
    	 return driver;
     }
    	 
    	 /*public String takeScreenShot(String testName,WebDriver driver) throws IOException {
    		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		String destFile=System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
    		FileUtils.copyFile(srcFile, new File(destFile));
    		return destFile;
    	 }*/


    	
     
     
    	      


}