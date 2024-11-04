package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestWithDataDriven {

	
	//data driven approach
	//testNG dataprovider
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@DataProvider
	public Object[][] getNegativeLoginData() {
		return new Object[][] {
			
				{"Pari@gmail.com", "pari1234"},
				{"Pari@gmailcom", "pari12"},
				{"Pari@gmail.com", ""},
				{"3287982!@#@&@", "pari1234"},
				
			};
	}
	
	
	@Test(dataProvider = "getNegativeLoginData")
	public void loginNegativeTest(String username, String password) {
//		doLogin("", "");
		Assert.assertEquals(doLogin(username, password), true);
		
	}
	
	public boolean doLogin(String username, String password) {		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();
//		String errMesg= driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//	
//		System.out.println(errMesg);
//		if (errMesg.contains("No match for E-Mail Address and/or Password")) {
//			return true;
//			}
//		else if(errMesg.contains("Your account has exceeded allowed number of login attempts. Please try again in 1 hour.")) {
//				return true;
//		}
//	
//		else {
//			return false;
//		}
		
		
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
