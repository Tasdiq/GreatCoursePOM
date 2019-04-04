package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Results extends Lib{

	public void pickbook(WebDriver driver) {
		
		WebElement ztoi = findElement(driver, "html/body/div[5]/div/div[3]/div/div[3]/div/div/div[2]/div/ul/li[3]/div/a");
		ztoi.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
