package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("edge");
		driver.get("https:\\\\naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By email= By.id("input-email");
		By pwd= By.id("input-password");
		
		eleUtil.doSendKeys(email, "Parizat@gmail.com");
		eleUtil.doSendKeys(pwd, "Parizat123");
		
		
		
		

	}

}
