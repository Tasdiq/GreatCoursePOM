package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static WebElement findElement(WebDriver driver, String xpath) {
		WebElement e = driver.findElement(By.xpath(xpath));
		
		return e;
	}
	
	public static void sleep(WebDriver driver, int sec) throws InterruptedException {
		Thread.sleep(sec*1000);
	}
	
	public static String readproperties(WebDriver driver, String key) throws IOException {
		InputStream fs = new FileInputStream("/GreatCourse/src/test/java/Util/locator.properties");
		Properties pro = new Properties();
		pro.load(fs);
		
		String value = pro.getProperty(key);
		
		return value;
		
	}
}
