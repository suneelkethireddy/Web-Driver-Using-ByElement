package testcase;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
 * @Author:Suneel Reddy
 * Passing both locator
 * and value for that locator
 */

public class TextBoxHelper {

	static ChromeDriver driver=null;

	@BeforeSuite
	public void startWebDriver(){
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		TextBoxHelper.typeInTextBox("email", "suneel.rockstar@gmail.com");
	}
	
	@Test
	public static void typeInTextBox(String locator,String value){

		if(driver.findElements(By.id(locator)).size()==1){
			driver.findElement(By.id(locator)).sendKeys(value);
		}else if(driver.findElements(By.className(locator)).size()==1){
			driver.findElement(By.className(locator)).sendKeys(value);
		}else if(driver.findElements(By.name(locator)).size()==1){
			driver.findElement(By.name(locator)).sendKeys(value);
		}else if(driver.findElements(By.xpath(locator)).size()==1){
			driver.findElement(By.xpath(value));
		}else if(driver.findElements(By.cssSelector(locator)).size()==1){
			driver.findElement(By.cssSelector(value));
	}else
		throw new NoSuchElementException("No such Element :"+locator);

}

}
