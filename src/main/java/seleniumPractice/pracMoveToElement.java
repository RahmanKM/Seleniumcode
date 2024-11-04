package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class pracMoveToElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		By parent= By.xpath("//a[@class= 'dropdown-toggle' and text()='Laptops & Notebooks']");
//		By child= By.xpath("//a[text()='Windows (0)']");
//		ElementUtil eUtil= new ElementUtil(driver);		
//		eUtil.handleLeveOneMenuItems(parent, child);
		
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@class= 'dropdown-toggle' and text()='Laptops & Notebooks']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Windows (0)']")).click();
}
}