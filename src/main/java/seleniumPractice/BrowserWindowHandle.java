package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserWindowHandle {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/tags/att_a_target.asp");
		
		driver.findElement(By.cssSelector("div.sn-b-def.sn-blue")).click();
		
		driver.findElement(By.cssSelector("a.w3-margin-bottom")).click();
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentWindowId= it.next();
		System.out.println("parent window id: "+parentWindowId);
		
		String childWindowId =it.next();
		System.out.println("child window id: "+childWindowId);
		
		//Switching: 
		driver.switchTo().window(childWindowId);
		
		//close child window:
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		String title= driver.getTitle();
		System.out.println(title);
	}		
}