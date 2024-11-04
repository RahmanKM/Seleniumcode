package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExcConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// browser--->JS
		// CD--->RWD--->WD
		//RWD--->JSE--->executeScript()
		
		
		driver= new EdgeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
//	 
//		
//		genMessage("Parizat");
//		String text= getInnerText();
//		System.out.println(text);
		
		WebElement pricing= driver.findElement(By.linkText("Pricing"));
		clickElementByJS(pricing); 
}
	
	public static void clickElementByJS(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	public static String getInnerText() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	
	public static void genMessage(String msg) {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	js.executeScript("alert('"+msg+"')");
	}
}