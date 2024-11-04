package seleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandleWithList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new EdgeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		
		Set<String> handles =driver.getWindowHandles();
		
		//Set to list:
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWIndowId =handlesList.get(0);
		System.out.println(parentWIndowId);
		
		String childWindowId =handlesList.get(1);
		System.out.println(childWindowId);
		
		
		//switching window:
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		//close child window:
		driver.close();
		 
		//switching to parent window id and closing:
		driver.switchTo().window(parentWIndowId);
		driver.quit();
		
	}		
}
