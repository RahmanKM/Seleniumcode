package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {

	
				//ImplicitWait:
	//1. global wait
	//2. it will be applied on all the web elements by default
	//3. applied after the driver declaration
	//4. not recommended 
	//5. Doesn't support non web elements ----> title, alert, urls
	
	//no one use it
	
	
	public static void main() {
	
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	//login pager: 10 secs
	//e1 - 5 secs --> 5 secs (ignored)
	//e2 - 0 sec ---> 10 secs (ignored)
	
	//home pager: 5 secs
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//e4
	//e5
	
	
	//login page: 10 secs:
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	}
}
