package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zatpa\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com");
		String url= driver.getCurrentUrl();		
		System.out.println(url);

	}

}
