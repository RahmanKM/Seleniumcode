package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	@Test
	public void searchTest() {
		boolean flag = driver.findElement(By.cssSelector("input.form-control.input-lg")).isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	
	@Test (priority = 1)
	public void pageTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}

	
	
	
}

