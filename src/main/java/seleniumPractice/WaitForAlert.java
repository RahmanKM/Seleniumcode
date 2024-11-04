package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();

	}
	
	//Js alert + wait
	public static Alert WaitForAlert(int timeout) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public static String getAlertText(int timeout) {
	return WaitForAlert(timeout).getText();
	}
	
	public static void acceptAlert(int timeout) {
		WaitForAlert(timeout).accept();
	}
	
	public static void dismissAlert(int timeout) {
		WaitForAlert(timeout).dismiss();
	}
	
	public static void alertSendKeys(int timeout, String value) {
		WaitForAlert(timeout).sendKeys(value);
	}
}