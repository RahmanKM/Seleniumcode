package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * 
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is: "+browser);
		
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
		return driver;
		
	}
	
	public void launchUrl(String url) throws Exception {
		if (url == null ) {
			System.out.println("url is null");
			throw new Exception ("URLNULLEXCEPTION");
		}
		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception ("URLBLANKEXCEPTION"); 
		}
		if ((url.indexOf("http") !=0) || (url.indexOf("https") !=0)) {
			System.out.println("http(s) missing");
			throw new Exception ("HTTP(s)MISSINGEXCEPTION");
		}
	
		driver.get(url);	
		
	}
	
	public String Title() {
 String title =	driver.getTitle();
 System.out.println(title);
 	if (title != null) {
	 return title;
 	}
 	else {
 		System.out.println("getting null tilte");
 		return null;
 	}
 	
 	
 
	}
	public String getPageurl() {
		String pUrl =	driver.getCurrentUrl();
		System.out.println(pUrl);
		if (pUrl != null) {
			return pUrl;
		}
		else {
			System.out.println("getting null  page Url");
			return null;
		}
		
		
	}
}
