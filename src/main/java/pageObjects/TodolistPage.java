package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TodolistPage {

	WebDriver driver;

	public TodolistPage(WebDriver driver) {
		this.driver = (WebDriver) driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div/div[1]/div/a")
	private WebElement withDueDate; // Clicking + Sign

	// @FindBy (xpath="//div[@class='todoList_addition__2ehiU']")
	// private WebElement Clicked

	@FindBy(xpath = "//textarea[@name='task_description']")
	private WebElement taskfield;

	@FindBy(xpath = "//button[text()='Add Task']")
	private WebElement Addtask;

	@FindBy(xpath = "//button[@class='react-datepicker__close-icon']")
	private WebElement withoutDueDate;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div/div[1]/div/a")
	private WebElement CancelAddNewTask;

	@FindBy(xpath = "(//a[@title='Complete'])[1]")
	private WebElement ClickingComplete;

	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	private WebElement deleteTask;

	@FindBy(xpath = "//a[text( )='View Completed Tasks']")
	private WebElement ViewCompletedTask;

	@FindBy(xpath = "//a[text( )='View Open Tasks']")
	private WebElement ViewOpenTask;
	
	@FindBy(xpath="//input[@value='09/28/2022, 2:20 PM']")
	private WebElement DateSelect;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWithDueDate() {
		return withDueDate;
	}

	public WebElement getTaskfield() {
		return taskfield;
	}

	public WebElement getAddtask() {
		return Addtask;
	}

	public WebElement getWithoutDueDate() {
		return withoutDueDate;
	}

	public WebElement getCancelAddNewTask() {
		return CancelAddNewTask;
	}

	public WebElement getClickingComplete() {
		return ClickingComplete;
	}

	public WebElement getDeleteTask() {
		return deleteTask;
	}

	public WebElement getViewCompletedTask() {
		return ViewCompletedTask;
	}

	public WebElement getViewOpenTask() {
		return ViewOpenTask;
	}

	public WebElement getDateSelect() {
		return DateSelect;
	}
	
	
}
