package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= new EdgeDriver();
		
		String username= "admin";
		String password= "admin";
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
}
	
}