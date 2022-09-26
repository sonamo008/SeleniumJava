package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyregisterPage {

	WebDriver driver;

	public VerifyregisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[@class='authCommon_title2__3cJid']")
	WebElement VerifypageofIamAlreadyuser;

	public WebElement getVerifypageofIamAlreadyuser() {
		return VerifypageofIamAlreadyuser;
	}

}
