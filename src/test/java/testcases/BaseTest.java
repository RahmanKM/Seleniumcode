package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumPractice.BrowserUtil;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setup(String url, String browser) {
//		driver =new EdgeDriver();
		BrowserUtil br= new BrowserUtil();
		driver= br.launchBrowser(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
