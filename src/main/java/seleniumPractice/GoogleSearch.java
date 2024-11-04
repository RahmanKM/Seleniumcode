package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.id("L2AGLb")).click();
			By searchKey= By.name("q");
			By suggestions= By.xpath("//ul[@class='G43f7e']/li");	
			doGoogleSearch(searchKey,"selenium", suggestions, "selenium python");
			
		}	
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
			
		}	
			public static void doGoogleSearch(By Searchlocator,String searchWord, By suggLocator, String value) throws InterruptedException {
				getElement(Searchlocator).sendKeys(searchWord);
				Thread.sleep(3000);
				List<WebElement> suggList= getElements(suggLocator);
				System.out.println(suggList.size());
				for (WebElement e: suggList) {
					String sugName= e.getText();
					System.out.println(sugName);
					if (sugName.equals(value)) {
						e.click();				
						break;
					}

				}
			}
			
	

}
