package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Product extends Lib {

	public void dvd(WebDriver driver) {
		WebElement format = findElement(driver, ".//*[@id='media-format-radio']/div/label" );
		format.click();
	}
	
	public void addcart(WebDriver driver) {
		WebElement add = findElement(driver, ".//*[@id='add-to-cart-btn']");
		add.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
	}
	
	public void checkout(WebDriver driver) {
		//driver.switchTo().alert().dismiss();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		
		WebElement check = findElement(driver, "//button[@title='Proceed To Checkout']");
		
		check.click();
	}
	
	
	
}
