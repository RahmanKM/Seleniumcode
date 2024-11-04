package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test
	public void searchTest() {
		driver.findElement(By.xpath("//div[text()= 'Alle akzeptieren']")).click();
		boolean flag = driver.findElement(By.id("APjFqb")).isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	
	@Test (priority = 1)
	public void pageTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	
	
}
 