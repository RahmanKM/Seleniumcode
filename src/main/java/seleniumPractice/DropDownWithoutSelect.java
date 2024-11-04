package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}

}
