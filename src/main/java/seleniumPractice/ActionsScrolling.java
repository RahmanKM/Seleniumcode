package seleniumPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions act= new Actions (driver);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();
}
}