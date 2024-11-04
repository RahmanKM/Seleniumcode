package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	//Explicit wait:
	//applied for a specific element, not for all the elements
	// not a global wait.
	// can be used for non web elements --> title, url, alerts
	// pooling/interval 
		//1. webdriverwait
		//2. fluentwait
	
	//Webdriverwait(c) --extends--> Fluentwait(c) --implements--> Wait(I) ___ until()
	
	//Fluentwait(c) --until() -- @override + other methods
	static WebDriver driver;
	
	public static void main() {
		driver = new EdgeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By logo = By.cssSelector("img.img-responsive");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		WebElement emailId_el =wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		emailId_el.sendKeys("pari@gmail.com");
//		driver.findElement(pwd).sendKeys("pk123");
//		
//		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement logo_el =wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
//		boolean flag= logo_el.isDisplayed();
//	System.out.println(flag);
	
	waitForElementPresence(emailId, 10).sendKeys("Pari@gmail.com");
	getElement(pwd).sendKeys("pk123");
	
	if (waitForElementPresence(logo, 5).isDisplayed()) {
	System.out.println("Logo is printed");	
	}
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page. and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0
	 * @param locator
	 * @param timeout
	 * @return
	 */
	 
	 
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
	}
}
