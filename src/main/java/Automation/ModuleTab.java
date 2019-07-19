package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModuleTab {
	WebDriver driver;

	public ModuleTab(WebDriver driver) {
		this.driver = driver;
	}

	By Module1 = By.xpath("//div[@class='panel-body']/div/table/tbody/tr[1]/td/div/label");
	By Module2 = By.xpath("//div[@class='panel-body']/div/table/tbody/tr[3]/td/div/label");
	By Module3 = By.xpath("//div[@class='panel-body']/div/table/tbody/tr[5]/td/div/label");
	By Module4 = By.xpath("//div[@class='panel-body']/div/table/tbody/tr[7]/td/div/label");
	By Module5 = By.xpath("//div[@class='panel-body']/div/table/tbody/tr[9]/td/div/label");

	public WebElement Module1() {
		return driver.findElement(Module1);

	}

	public WebElement Module2() {
		return driver.findElement(Module2);

	}

	public WebElement Module3() {
		return driver.findElement(Module3);

	}

	public WebElement Module4() {
		return driver.findElement(Module4);

	}

	public WebElement Module5() {
		return driver.findElement(Module5);

	}

}
