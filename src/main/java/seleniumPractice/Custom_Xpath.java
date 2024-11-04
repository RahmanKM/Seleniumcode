package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Custom_Xpath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. abs xpath: tag by tag -> we don't use
		// 2. relative/custom xpath:
		
//		//htmltag[@attribute='']
//		
//		//text():
//		//htmltag[text()='']
		
	
}
}