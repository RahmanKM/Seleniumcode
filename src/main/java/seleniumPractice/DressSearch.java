package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DressSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
//		driver.get("http://www.automationpractice.pl/index.php");
//		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
//		Thread.sleep(3000);
//	
	driver.get("https://petdiseasealerts.org/forecast-map/#/");
	Thread.sleep(5000);
	String mapxpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']";
	List<WebElement>List =driver.findElements(By.xpath(mapxpath));
	System.out.println(List.size());

for (WebElement e: List) {
	String names= e.getAttribute("id");
	System.out.println(names);
}

}
	}


