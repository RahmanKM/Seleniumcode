package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getAttribute {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fName= By.name("firstname");
		driver.findElement(fName).sendKeys("Parizat");
		String pHolder= driver.findElement(fName).getAttribute("value");
		System.out.println(pHolder);
	}

}
