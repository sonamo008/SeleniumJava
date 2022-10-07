package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPage {

      WebDriver driver;
      
      public MyPage(WebDriver driver) {
          this.driver=driver;
          PageFactory.initElements(driver, this);
      
      }
      
      @FindBy(id="responsive-navbar-nav")
      WebElement editaaccinfo;
      
      public WebElement getEditaccinfo() {
    	  return editaaccinfo;
      }
      
      
 
      
      
      }
