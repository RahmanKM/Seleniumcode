package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele= driver.findElement(By.linkText("Cranbrook, Canada"));
		
		
		//right of ele:
//		String rightInd= driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(rightInd);
		
		
		//Left of ele:
//		String LeftInd= driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(LeftInd);
		
		WebElement ele2= driver.findElement(By.linkText("Laval, Canada"));
//		String right2= driver.findElement(with(By.tagName("p")).toRightOf(ele2)).getText();
//		System.out.println(right2);
		
		//below:
//		String below= driver.findElement(with(By.tagName("p")).below(ele2)).getText();
//		System.out.println(below);
		
		//above:
//		String above= driver.findElement(with(By.tagName("p")).above(ele2)).getText();
//		System.out.println(above);
		
		//near:
		String near= driver.findElement(with(By.tagName("p")).near(ele2)).getText();
		System.out.println(near);
}
}