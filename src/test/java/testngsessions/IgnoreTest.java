package testngsessions;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(description="Searching a product test")
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void logoTest() {
		System.out.println("Logo Test");
	}
	
	@Test(enabled=false, description="making a payment", priority=3)
	public void paymentTest() {
		System.out.println("Payment Test");
	}

}
