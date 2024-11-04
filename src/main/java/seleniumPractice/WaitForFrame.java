package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
			
}

	public static void waitForFrame(int timeout, int frameIndex) {
		WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	
	public static void waitForFrame(int timeout, String nameOrId) {
		WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}
	
	public static void waitForFrame(int timeout, WebElement FrameElement) {
		WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));
	}
	
	public static void waitForFrame(int timeout, By FrameLocator) {
		WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));
	}
}