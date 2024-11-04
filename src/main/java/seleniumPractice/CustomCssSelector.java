package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomCssSelector {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	//CSS selector:
	
//		ID: #id
//		htmltag#id
	
//		CLASS: .class
//		htmltag.class
// 		By email= By.cssSelector("#username")
	
	
// 		Other attributes:
//		htmltag[attribute='value']
//		input[value='Login']
// 		input[value='Login'][type='submit']  ->multiple tag

	
//		Contains:
//		input[id*=email]
//		input[placeholder*= 'E-mail']  -----> * used like "contains" function of Xpath
		
// 		input[placeholder^= E-Mail] ----> ^ used like "starts with" function
//		input[placeholder$= E-Mail] ----> $ used like "ends with" function
		
//		Parent to child:
//		form#hs-login div ----> (space and then child tag) (direct + indirect all child)
//		form#hs-login > div  ----> (direct child)
	
		
//		child to parent: NA
//		Following sibling:
//		label[for='input-email']+input -----> (use + and then sibling tag)
}
}
