package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClicksandSendKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName= By.id("input-firstname");
		By priPolicy= By.xpath("//input[@name='agree']");
		
		Actions act= new Actions(driver);
		
		act.sendKeys(driver.findElement(firstName), "parizat").build().perform();
		act.click(driver.findElement(priPolicy)).build().perform();
		
		
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act= new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	public static void doActionsSendkeys(By locator, String value) {
		Actions act= new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
}