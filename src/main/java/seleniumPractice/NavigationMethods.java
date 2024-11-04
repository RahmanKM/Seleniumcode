package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationMethods {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new EdgeDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https:\\\\www.amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
