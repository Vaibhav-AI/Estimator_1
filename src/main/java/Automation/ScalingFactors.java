package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScalingFactors {
	WebDriver driver;

	public ScalingFactors(WebDriver driver) {
		this.driver = driver;
	}

	By Inevntorybtn = By.xpath("//div[@class='import-inventory-button-container']/button[2]");
	By Browserbtn = By.xpath("//div[@class='col-sm-3']/button");
	By Importbtn = By.xpath("//div[@class='modal-footer']/div/button[1]");
	// Overall Scope
	By plan = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr[1]/td[1]");
	By ABuild = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr[2]/td/div/label[3]");
	By CEDesign = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr[4]/td/div/label[2]");
	// Test Application
	By TestApplicationScope = By.xpath("//button[@title='Test Application Scope']"); // "//div[@class='left-nav-toggle']/div[2]/button[@title='Test
																						// Application Scope']"
	By AssemblyTest = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr/td[1]");
	By ProductTest = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr/td[2]");
	By OppTest = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr/td[6]");
	// Detailed Scope
	By DetailedScope = By.xpath("//button[@title='Detailed Scope']");
	By QMultisite = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr[1]/td/div/label");
	By QCE = By.xpath("//div[@class='panel-body']/div/div/table/tbody/tr[1]/td/div/label");

	public WebElement Inevntorybtn() {
		return driver.findElement(Inevntorybtn);
	}

	public WebElement Browserbtn() {
		return driver.findElement(Browserbtn);
	}

	public WebElement Importbtn() {
		return driver.findElement(Importbtn);
	}

	// Overall Scope
	public WebElement plan() {
		return driver.findElement(plan);
	}

	public WebElement ABuild() {
		return driver.findElement(ABuild);
	}

	public WebElement CEDesign() {
		return driver.findElement(CEDesign);
	}

	// Test Application Scope
	public WebElement TestApplicationScope() {
		return driver.findElement(TestApplicationScope);
	}

	public WebElement AssemblyTest() {
		return driver.findElement(AssemblyTest);
	}

	public WebElement ProductTest() {
		return driver.findElement(ProductTest);
	}

	public WebElement OppTest() {
		return driver.findElement(OppTest);
	}

	// Detailed scope Questions
	public WebElement DetailedScope() {
		return driver.findElement(DetailedScope);
	}

	public WebElement QMultisite() {
		return driver.findElement(QMultisite);
	}

	public WebElement QCE() {
		return driver.findElement(QCE);
	}

}
