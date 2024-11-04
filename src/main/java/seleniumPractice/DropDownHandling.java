package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		String countryname= country.getText();
//		System.out.println(countryname.replaceFirst("Country", "Countries:"));
//		Select sel = new Select(country);
//		sel.selectByIndex(17);
//		sel.selectByVisibleText("Germany");
//		sel.selectByValue("France");
		
//		country.sendKeys("Italy");
		By country= By.id("Form_getForm_Country");
//		doSelectDropDownByIndex(country, 17);
//		doSelectDropDownByVisibleText(country, "Germany");
//		doSelectDropDownByValue(country,"India");
		
//		Select sel= new Select(country);
//		List <WebElement> CountryOptions= sel.getOptions();
//		System.out.println("Total countries: "+ (CountryOptions.size()-1));
//		for (WebElement e: CountryOptions) {
//				String text= e.getText();
//				System.out.println(text);
//		}
		getDropDownOptionsList(country);	
	}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

		public static void doSelectDropDownByIndex(By locator, int index) {
			Select sel= new Select (getElement(locator));
			sel.selectByIndex(index);
		}
		public static void doSelectDropDownByVisibleText(By locator, String text) {
			Select sel= new Select (getElement(locator));
			sel.selectByVisibleText(text);
		}
		public static void doSelectDropDownByValue(By locator, String value) {
			Select sel= new Select (getElement(locator));
			sel.selectByValue(value);
		}

		public static List<WebElement> getDropDownOptions(By locator) {	
			Select sel= new Select(getElement(locator));
			 return sel.getOptions();						
		}
		
		public static int getDropDownOptionsCount(By locator) {
			return (getDropDownOptions(locator).size());
		}
		
		public static void getDropDownOptionsList(By locator) {
			List <WebElement> CountryOptions= getDropDownOptions(locator);
			for (WebElement e: CountryOptions) {
				String text= e.getText();
				System.out.println(text);
			}
		}
}
