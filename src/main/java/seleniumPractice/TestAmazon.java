package seleniumPractice;

public class TestAmazon {

	public static void main(String[] args) throws Exception {
		BrowserUtil butil = new BrowserUtil();
		
		butil.launchBrowser("edge");
		butil.launchUrl("https:\\www.amazon.com");
		String checktitle= butil.Title();
		if (checktitle.contains("Amazon.com.")) {
			System.out.println("Test passed, amazon launched");
		}
		else {
			System.out.println("test failed");
		}
		butil.getPageurl();

	}

}
