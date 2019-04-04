package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Util.Lib;

public class Checkout extends Lib {

	public void checkoutMethod(WebDriver driver) {

		WebElement email = findElement(driver, ".//*[@id='login-email']");
		email.sendKeys("tchowdhury1@gulls.salisbury.edu");

		WebElement newcust = findElement(driver, ".//*[@id='onepage-login-form']/fieldset/ul/li[3]/div/div[1]/label");
		newcust.click();

		// If customer has an account
		/*
		 * WebElement oldcust = findElement(driver,
		 * ".//*[@id='onepage-login-form']/fieldset/ul/li[3]/div/div[2]/div/label");
		 * oldcust.click();
		 * 
		 * WebElement password = findElement(driver, ".//*[@id='login-password']");
		 * password.sendKeys("samplepassword");
		 */

		WebElement cont = findElement(driver, ".//*[@id='checkout-sigin']");
		cont.click();
	}

	public void billing(WebDriver driver) throws InterruptedException {

		WebElement fname = findElement(driver, ".//*[@id='billing:firstname']");
		fname.sendKeys("Jesse");

		WebElement lname = findElement(driver, ".//*[@id='billing:lastname']");
		lname.sendKeys("Lingard");

		WebElement address = findElement(driver, ".//*[@id='billing:street1']");
		address.sendKeys("99 Sir Matt Busby Way");

		WebElement city = findElement(driver, ".//*[@id='billing:city']");
		city.sendKeys("Manchester");

		WebElement country = findElement(driver, ".//*[@id='billing:country_id']");
		country.click();

		Select pickcntry = new Select(findElement(driver, ".//*[@id='billing:country_id']"));
		pickcntry.selectByVisibleText("United Kingdom");

		WebElement State = findElement(driver, ".//*[@id='billing:region']");
		State.sendKeys("Stretford");

		WebElement zipcode = findElement(driver, ".//*[@id='billing:postcode']");
		zipcode.sendKeys("M16 0SZ");

		WebElement pass1 = findElement(driver, ".//*[@id='billing:customer_password']");
		pass1.sendKeys("oceanblue123");

		/*
		 * Actions ac = new Actions(driver); ac.sendKeys(Keys.TAB).build().perform();
		 */

		WebElement pass2 = findElement(driver, ".//*[@id='billing:confirm_password']");
		pass2.sendKeys("oceanblue123");

		WebElement cont = findElement(driver, ".//*[@id='billing-buttons-container']/button");
		cont.click();

	}

	public void shipmethod(WebDriver driver) {
		WebElement cont2 = findElement(driver, ".//*[@id='shipping-method-buttons-container']/button");
		cont2.click();
		
		
	}
}
