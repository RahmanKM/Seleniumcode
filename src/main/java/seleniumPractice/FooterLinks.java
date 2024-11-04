package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FooterLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By footers= By.xpath("//footer//a");
//		List<WebElement> footerList= driver.findElements(By.xpath("//footer//a"));
//		System.out.println(footerList.size());
//		
//		for (WebElement e: footerList) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		getFooterLinksList(footers);
	}
	
	public static ArrayList<String> getFooterLinksList(By locator) {
		List<WebElement> footerList= driver.findElements(locator);
		System.out.println(footerList.size());
		ArrayList <String> eleTextList= new ArrayList<String>();
		for (WebElement e: footerList) {
			String text= e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

}
