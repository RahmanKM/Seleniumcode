package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class NewWIndowConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWindowId =driver.getWindowHandle();
		
//		driver.switchTo().newWindow(WindowType.TAB);

		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.close(); 
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
}
}