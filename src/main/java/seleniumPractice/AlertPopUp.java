 package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopUp {

	
	//1.alert()
	//2.confirm()
	//3.prompt ()

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert= driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		
		Thread.sleep(4000);
		
		//accept the alert:
		alert.accept();
		
		
		//dismiss the alert:
//		alert.dismiss();
		
		
	}

}
