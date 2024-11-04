package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//type= "File"
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\zatpa\\Desktop\\New folder\\images.jpg");
		
		Actions act= new Actions(driver);
		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).build().perform();
}
}