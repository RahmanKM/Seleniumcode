package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandlePrac {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		driver= new EdgeDriver();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='social-link']/ul/li)[1]")).click();
	}
	}