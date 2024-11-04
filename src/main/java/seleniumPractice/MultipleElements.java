package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleElements {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new EdgeDriver();
		driver.get("https://www.zalando.com");
		
//		List<WebElement> links= driver.findElements(By.tagName("a"));
////		int actSize= links.size();
//		System.out.println(links.size());
//		
////		for (int i=0; i<links.size(); i++) {
////			String text= links.get(i).getText();
////			if (text.length() != 0) {
////				System.out.println(text);
////			}
//			
//		for (WebElement e : links) {
//			
//			String txt= e.getText();
//			if (txt.length() != 0) {
//			System.out.println(txt);
//			}
//		String ref= e.getAttribute("href");	
//		System.out.println(ref);
//		}
		
		
//		List<WebElement> totalimg= driver.findElements(By.tagName("img"));
//		System.out.println("number of total images: "+ totalimg.size());
//		
	
//	for (WebElement e : totalimg) {
//		String srcVal= e.getAttribute("src");
//		String altVal= e.getAttribute("alt");
//		
//		System.out.println(srcVal +" : "+altVal);
//	}
	
		By img=By.tagName("img");
		By links=By.tagName("a");
		
//		System.out.println("Total links: "+ getElements(links).size());
//		System.out.println("totl images: "+ doGetElementsCount(img));
	
	
	
		getElementsTextList(img);
		
		
		
			
}

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}	
	
	public static int doGetElementsCount(By locator) {
		return driver.findElements(locator).size();
	
	}
	
	
	public static ArrayList<String> getElementsTextList (By locator) {
		List <WebElement> eleList =  getElements(locator);
		ArrayList<String> eleTextList= new ArrayList<String>();
		
		for (WebElement e : eleList) {
			String text= e.getText();
			if (text.length() != 0) {
			eleTextList.add(text);
			}
		}
		return eleTextList;
	}

}
