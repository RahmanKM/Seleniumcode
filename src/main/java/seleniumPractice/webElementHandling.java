package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webElementHandling {
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https:\\naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1:
//		driver.findElement(By.id("input-email")).sendKeys("pk@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("pk123");
		

		
		//2:
//		WebElement emailId= driver.findElement(By.id("input-email"));
//		WebElement pwd= driver.findElement(By.id("input-password"));
//		emailId.sendKeys("kmr@gmail.com");
//		pwd.sendKeys("kmr123");
		
		//3:
		
//		By email= By.id("input-email");
//		By pwd= By.id("input-password");
//		
//		WebElement emailId= driver.findElement(email);
//		WebElement password= driver.findElement(pwd);
//		
//		emailId.sendKeys("msa@gmail.com");
//		password.sendKeys("msa123");

		//4:
		
//		By email= By.id("input-email");
//		By pwd= By.id("input-password");
//		
//		getElement(email).sendKeys("pk@gmail.com");
//		getElement(pwd).sendKeys("pk123");
		
		//5:
		
//		By email= By.id("input-email");
//		By pwd= By.id("input-password");
//		
//		doSendKeys(email, "pari@gmail.com");
//		doSendKeys(pwd, "pari123");
//		
		//6:
//		By email= By.id("input-email");
//		By pwd= By.id("input-password");
//		
//		ElementUtil Eutil= new ElementUtil(driver);
//		Eutil.doSendKeys(email, "msa@gmail.com");
//		Eutil.doSendKeys(pwd, "msa098");
	
		//7: By locators + brUtil + EleUtil
		
		
	}	
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		

	}

}
