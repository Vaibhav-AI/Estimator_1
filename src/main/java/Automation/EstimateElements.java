package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimateElements {
	WebDriver driver;

	public EstimateElements(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * //Industry DropDown
	 * 
	 * @FindBy(xpath="//md-select[@name='industry']") WebElement IndustryName;
	 * 
	 * @FindBy(xpath="//*[text()='CMT C&M']") WebElement IndustryOpt;
	 * 
	 * //Stage DropDown
	 * 
	 * @FindBy(xpath="//md-select[@name='stage']") WebElement StageName;
	 * 
	 * @FindBy(xpath="//*[text()='2A']") WebElement StageOpt;
	 * 
	 * //DealInfo DropDown
	 * 
	 * @FindBy(xpath="//md-select[@name='deal']") WebElement DealName;
	 * 
	 * @FindBy(xpath="//*[@name='Contract Renewal']") WebElement DealOpt;
	 * 
	 * @FindBy(xpath="//button[@type='submit']") WebElement Savebtn;
	 */

	By IndustryName = By.xpath("//md-select[@name='industry']");
	By IndustryOpt = By.xpath("//*[text()='CMT C&M']");
	By StageName = By.xpath("//md-select[@name='stage']");
	By StageOpt = By.xpath("//*[text()='2A']");
	By DealName = By.xpath("//md-select[@name='deal']");
	By DealOpt = By.xpath("//*[text()='Contract Renewal']");
	By Savebtn = By.xpath("//button[@type='submit']");
	By Esavebtn = By.xpath("//div[@class='save-button-container']");
	By InevntoryTab = By.xpath("//div[@class='estimate-tab-container']/ul/li[2]");

	public WebElement IndustryName() {
		return driver.findElement(IndustryName);

	}

	public WebElement IndustryOpt() {
		return driver.findElement(IndustryOpt);

	}

	public WebElement StageName() {
		return driver.findElement(StageName);

	}

	public WebElement StageOpt() {
		return driver.findElement(StageOpt);

	}

	public WebElement DealName() {
		return driver.findElement(DealName);

	}

	public WebElement DealOpt() {
		return driver.findElement(DealOpt);

	}

	public WebElement Savebtn() {
		return driver.findElement(Savebtn);

	}

	public WebElement Esavebtn() {
		return driver.findElement(Esavebtn);

	}

}
