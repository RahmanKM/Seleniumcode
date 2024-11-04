package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandleWithAllWindows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWindowId= driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click(); //linkedin
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click(); //facebook
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click(); //Twetter
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click(); //Youtube
		
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		
		while(it.hasNext()) {
			String windowId=it.next();
			driver.switchTo().window(windowId);
			String title =driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
			if (!windowId.equals(parentWindowId)) {
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
}
}