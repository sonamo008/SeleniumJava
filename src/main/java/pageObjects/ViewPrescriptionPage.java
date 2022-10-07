package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPrescriptionPage {
	
	public WebDriver driver;

	public ViewPrescriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='PrescriptionDetails_buttonactive__2WOh8 PrescriptionDetails_addprescription__2z_aO']")
	WebElement viewPrescriptionLink;
	
	@FindBy(xpath="//input[@name='patientname']")
	WebElement patientNameField;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getViewPrescriptionLink() {
		return viewPrescriptionLink;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}
	
	
	

}
