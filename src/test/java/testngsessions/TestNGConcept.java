package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcept {
	
	/**
	 * 	BS
	 *	BT
	 * 	BC
	 * 	
	 * 		BM
	 * 		Test
	 * 		AM	
	 * 	
	 * 	AC
	 *  AT
	 * 	AS			
	 * 
	 */
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("Bs -- connectWithDB");
	}
	
	@BeforeTest()
	public void createTestUser() {
		System.out.println("BT -- createTestUser ");
	}
	
	@BeforeClass()
	public void launchBrowser() {
		System.out.println("BC -- launchBroswer");
	}
	
	@BeforeMethod()
	public void login() {
		System.out.println("BC -- login to App");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search test");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("Add to cart test");
	}

	@Test()
	public void paymentTest() {
		System.out.println("payment test");
	}
	  
	@AfterMethod
		public void logout() {
		System.out.println("AM -- Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}
	
	@AfterSuite()
	public void disconnectWithDB() {
		System.out.println("AS-- disconnectwithDB");
	}
}
