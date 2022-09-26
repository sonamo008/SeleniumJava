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

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[1]/span[2]/a[2]")
	private WebElement withoutDueDate;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div/div[1]/div/a")
	private WebElement CancelAddNewTask;

	@FindBy(xpath = "(//a[@title='Complete'])[1]")
	private WebElement ClickingComplete;

	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	private WebElement deleteTask;

	@FindBy(xpath = "//a[text( )='View Completed Tasks']")
	private WebElement ViewCompletedTask;

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
}
