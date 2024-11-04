package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SVGElement {
//			//*[local-name()='svg']
//			//button[@type='submit']//*[local-name()='svg']
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(5000);
		String map_xpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']";
		List<WebElement> states=driver.findElements(By.xpath(map_xpath));
		System.out.println(states.size());

	for (WebElement e: states) {
		String names= e.getAttribute("id");
		System.out.println(names);
	}

	}
}
