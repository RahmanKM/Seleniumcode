package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PesudoElementHandle {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String man_text= js.executeScript
//							("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')")
//								.toString();
//		System.out.println(man_text);
//		
//		if (man_text.contains("*")) {
//			System.out.println("FN is a mandatory field");
//		}
//		else {
//			System.out.println("FN not mandatory");
//		}
		String fn_JScript= "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(fn_JScript);
		
	}
	
	
	
	public static boolean checkElementIsMandatory(String jsScript) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			String man_text= js.executeScript(jsScript).toString();
			System.out.println(man_text);
			
			if (man_text.contains("*")) {
				System.out.println("Ele is a mandatory field");
				return true;
			}
			else {
				System.out.println("FN not mandatory");
				return false;
			}
		}
}
