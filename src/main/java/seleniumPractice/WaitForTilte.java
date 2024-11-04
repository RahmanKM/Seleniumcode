package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTilte {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https://www.freshworks.com/");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		if (wait.until(ExpectedConditions.titleContains("Modern and Easy"))) {
			System.out.println(driver.getTitle());
	
		}
}


	public static String WaitForTitleContains(int timeout, String titleFraction) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		
		else {
				return null;
		}
}

	public static String WaitForTitleIs(int timeout, String titleValue) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		if (wait.until(ExpectedConditions.titleIs(titleValue))) {
			return driver.getTitle();
		}
		
		else {
				return null;
		}
}
	
	
}