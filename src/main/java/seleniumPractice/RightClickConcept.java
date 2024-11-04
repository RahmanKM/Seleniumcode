package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.cssSelector("span.context-menu-one"));
		Actions act= new Actions(driver);
		act.contextClick(rightClickEle).build().perform();
		
//	List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list')]/li"));
		List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list')]/li/span"));
		System.out.println(list.size());
		
		for (WebElement e: list) {
			String name= e.getText();
			if (name.length()!=0) {
			System.out.println(name);
			if (name.equals("Copy")) {
				e.click();
				break;
			}
			}
		}
}
}