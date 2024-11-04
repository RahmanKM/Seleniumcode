package seleniumPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementSectionLinks {
		static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By list= By.className("list-group-item");
	
//		getElementsTextList(list);
		
		ElementUtil eUtil = new ElementUtil(driver);
		ArrayList <String>fList = eUtil.getElementsTextList(list);
		System.out.println(fList);
	}
	
	
//		public static List<WebElement> getElements(By locator) {
//			return driver.findElements(locator);
//		}
//		public static ArrayList<String> getElementsTextList (By list) {
//			List <WebElement> eleList =  getElements(list);
//			
//			ArrayList<String> eleTextList= new ArrayList<String>();
//			
//			for (WebElement e : eleList) {
//				String text= e.getText();
//				if (text.length() != 0) {
//				eleTextList.add(text);
//				}
//				
//			}
//			System.out.println(eleTextList);
//			return eleTextList;
		}


