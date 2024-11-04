package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrame {

		
		static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			driver= new EdgeDriver();
			driver.get("https://www.londonfreelance.org/courses/frames/index.html");
			
//			driver.switchTo().frame(2);
//			driver.switchTo().frame("main");
			driver.switchTo().frame(driver.findElement(By.name("main")));
			
			String header= driver.findElement(By.xpath("/html/body/h2")).getText();
			System.out.println(header);
			driver.switchTo().defaultContent(); // back to main page from Frame
			
	}

}
