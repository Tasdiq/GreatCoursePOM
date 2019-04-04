package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Home extends Lib{

	public void search(WebDriver driver) {
		WebElement Search = findElement(driver, ".//*[@id='search']");
		Search.sendKeys("math\n");
	}
	
	
}
