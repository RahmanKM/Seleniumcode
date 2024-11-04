package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableTraverse {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		//table[@id="customers"]/tbody/tr[2]/td[1]
//		//table[@id="customers"]/tbody/tr[3]/td[1]
//
//		
//		//table[@id="customers"]/tbody/tr[7]/td[1]
		
//		String beforeXpath= "//table[@id='customers']/tbody/tr[";
//		String afterXpath= "]/td[1]";
//		
//		for (int i=2; i<=getRowCount()+1; i++) {
//			String actXpath = beforeXpath+i+afterXpath;
//			//System.out.println(actXpath);
//			String text= driver.findElement(By.xpath(actXpath)).getText();
//			System.out.println(text);}

//		getColData(2);
		getRowdata(5,3);
		
		
		
}
	public static void getColData(int colNum) {
		String beforeXpath= "//table[@id='customers']/tbody/tr[";
		String afterXpath= "]/td["+colNum+"]";
		
		for (int i=2; i<=getRowCount()+1; i++) {
			String actXpath = beforeXpath+i+afterXpath;
			//System.out.println(actXpath);
			String text= driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
	}
	}
	
	public static void getRowdata(int rowNum, int colNum) {
//			//*[@id="customers"]/tbody/tr[2]/td[2]
//			//*[@id="customers"]/tbody/tr[2]/td[1]
		
		for (int j=1; j<=colNum; j++) {
		String Xpath= "//table[@id='customers']/tbody/tr["+rowNum+"]/td["+j+"]";
		String colData= driver.findElement(By.xpath(Xpath)).getText();
		System.out.println(colData);
		}	
	}
	
	public static int getColCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
	public static int getRowCount() {
		int rows= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		return rows-1;
	}
}