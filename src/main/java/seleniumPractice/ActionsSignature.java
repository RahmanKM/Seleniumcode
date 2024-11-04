package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		
		driver.findElement(By.xpath("//p[@class= 'fc-button-label' and text()='Consent']")).click();
		WebElement canvas= driver.findElement(By.id("signature-pad"));
		
		
		Actions act= new Actions(driver);
		
		Action sign= act.click(canvas)
					.moveToElement(canvas, 3, 3)
					.clickAndHold(canvas)
					.moveByOffset(200, -50)
//					.moveByOffset(150, 50)
//					.moveByOffset(50, -50)
//					.moveByOffset(50, 50)
//					.moveByOffset(50, -50)
//		.moveByOffset(50, -50)
//		.moveByOffset(-50, 50)
//		.moveByOffset(-50, -50)
//		.moveByOffset(3, 3)
					.release(canvas)
					.build();
		
		sign.perform();
		
		
}
}