package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		By doGetText= By.tagName("h1");
//		String header= driver.findElement(doGetText).getText();
//		System.out.println(header);
//		
//		if (header.equals("Register Account")) {
//			System.out.println("Header Passed");
//		}
//		else {
//			System.out.println("test failed");
//		}

		By check= By.linkText("Recurring payments");
			String rec= driver.findElement(check).getText();		
		
			if (rec.equals("Recurring payments")) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
	}
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
	

}
