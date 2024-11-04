package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickMethod {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new EdgeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//1:
//		driver.findElement(By.id("username")).sendKeys("pari@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("pari123");
//		driver.findElement(By.id("loginBtn")).click();

		
		//2:
//		WebElement un= driver.findElement(By.id("username"));
//		WebElement pwd= driver.findElement(By.id("password"));
//		WebElement lgn= driver.findElement(By.id("loginBtn"));
//		
//		un.sendKeys("pk@gmail.com");
//		pwd.sendKeys("p123");
//		lgn.click();
		
		//3:
		
//		By un= By.id("username");
//		By pwd= By.id("password");
//		By lgn= By.id("loginBtn");
//		
//		driver.findElement(un).sendKeys("pari@gmail.com");
//		driver.findElement(pwd).sendKeys("pa123");
//		driver.findElement(lgn).click();		
		
		
		//4:
		
//		By un= By.id("username");
//		By pwd= By.id("password");
//		By lgn= By.id("loginBtn");
//		
//		getElement(un).sendKeys("msa@gmail.com");
//		getElement(pwd).sendKeys("msa1231421");
//		driver.findElement(lgn).click();

		
		//5:
		
//		By un= By.id("username");
//		By pwd= By.id("password");
//		By lgn= By.id("loginBtn");
//		
//		doSendKeys(un, "kmr@gmail.com");
//		doSendKeys(pwd, "kmr@gmailcom");
//		driver.findElement(lgn).click();		
	}
	
	
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);	
	}

		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
}	