package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void searchTest() {
		driver.findElement(By.xpath("//div[text()= 'Alle akzeptieren']")).click();
		boolean flag = driver.findElement(By.id("APjFqb")).isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	
	@Test (priority = 1)
	public void pageTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
 