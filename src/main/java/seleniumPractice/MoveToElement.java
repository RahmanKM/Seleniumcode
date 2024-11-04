package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		Actions act= new Actions(driver);
//		
//		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("COURSES")).click();
		By content= By.className("menulink");
		By courses= By.linkText("COURSES");
		handleLevelOneMenuItems(content, courses);
}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleLevelOneMenuItems(By parentMenu, By childMenu) throws InterruptedException {
		Actions act= new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}
}