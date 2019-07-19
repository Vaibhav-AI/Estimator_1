package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By Username = By.xpath("//input[@id='userNameInput']");
	By Password = By.xpath("//input[@id='passwordInput']");
	By SignIn = By.xpath("//span[@id='submitButton']");
	By CheckboxClick = By.xpath("//input[@name='checkbox']");
	By SubmitButton = By.xpath("//button[@type='submit']");

	public WebElement Username() {
		return driver.findElement(Username);

	}

	public WebElement Password() {
		return driver.findElement(Password);

	}

	public WebElement SignIn() {
		return driver.findElement(SignIn);

	}

	public WebElement CheckboxClick() {
		return driver.findElement(CheckboxClick);

	}

	public WebElement SubmitButton() {
		return driver.findElement(SubmitButton);

	}

}
