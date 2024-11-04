package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver;
		
		String browser= "chrome";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("please pass the right browser...");
			break;
		}
		
		driver.get("https:\\www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
