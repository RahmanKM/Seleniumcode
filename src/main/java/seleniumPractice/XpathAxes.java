package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://www.selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']")).click();
		List<WebElement> details= driver.findElements(By.xpath("//a[text()='Garry.White']/parent::td/following-sibling::td"));

		for (WebElement e: details) {
			String userInfo= e.getText();
			if (userInfo.length()!=0) {
				System.out.println(userInfo);
			}
		}
	}
}