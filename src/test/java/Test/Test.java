package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Checkout;
import Pages.Home;
import Pages.Product;
import Pages.Results;

public class Test {

	static WebDriver driver = new ChromeDriver();

	@Before
	public void before() {
		System.out.println("This is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TQ\\Desktop\\PITT\\sel\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.thegreatcourses.com/");

	}
	
	@After
	
	public void after() {
		driver.manage().deleteAllCookies();
	}
	
	@org.junit.Test
	public void testing() throws InterruptedException {
		System.out.println("This is the beginning of test");
		
		Home hm = new Home();
		hm.search(driver);
		
		Results rs = new Results();
		rs.pickbook(driver);
		
		Product pt = new Product();
		pt.dvd(driver);
		pt.addcart(driver);
		pt.checkout(driver);
		
		Checkout ck = new Checkout();
		ck.checkoutMethod(driver);
		ck.billing(driver);
		ck.shipmethod(driver);
	}

}
