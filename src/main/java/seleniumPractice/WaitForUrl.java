package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForUrl {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
}

	
	
	public static String waitForUrl(int timeout, String urlFraction) {
	WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
	
	if	(wait.until(ExpectedConditions.urlContains(urlFraction))) {
		return driver.getCurrentUrl();
	}
	else {
		return null;
	}
		
}
	
	public static String waitForUrlis(int timeout, String urlValue) {
	WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
	
	if	(wait.until(ExpectedConditions.urlToBe(urlValue))) {
		return driver.getCurrentUrl();
	}
	else {
		return null;
	}
		
}
	
}