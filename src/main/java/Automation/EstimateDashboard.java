package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EstimateDashboard {

	WebDriver driver;

	public EstimateDashboard(WebDriver driver) {
		this.driver = driver;
	}

	By EstimateCreateButton = By.xpath("//*[text()='CREATE ESTIMATE']");
	By EstimateName = By.xpath("//input[@name='estimateName']");
	By clientName = By.xpath("//input[@name='clientName']");
	By OppID = By.xpath("//input[@name='clientID']");
	By SolID = By.xpath("//input[@name='solutionID']");
	By RefName = By.xpath("//input[@name='referenceName']");
	By BaseModel = By.xpath("//md-select[@name='baseModel']");
	By AVS = By.xpath("//md-option[@value='39']");
	By CreateButton = By.xpath("//button[@type='submit']");

	public WebElement EstimateCreateButton() {
		return driver.findElement(EstimateCreateButton);

	}

	public WebElement EstimateName() {
		return driver.findElement(EstimateName);

	}

	public WebElement clientName() {
		return driver.findElement(clientName);

	}

	public WebElement OppID() {
		return driver.findElement(OppID);

	}

	public WebElement SolID() {
		return driver.findElement(SolID);

	}

	public WebElement RefName() {
		return driver.findElement(RefName);

	}

	public WebElement BaseModel() {
		return driver.findElement(BaseModel);

	}

	public WebElement AVS() {
		return driver.findElement(AVS);

	}

	public WebElement CreateButton() {
		return driver.findElement(CreateButton);

	}

}
