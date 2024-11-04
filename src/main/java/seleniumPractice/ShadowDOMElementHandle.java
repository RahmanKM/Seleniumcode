package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDOMElementHandle {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new EdgeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("pact");
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tea=
						(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");

		tea.sendKeys("masala tea");
	}
}