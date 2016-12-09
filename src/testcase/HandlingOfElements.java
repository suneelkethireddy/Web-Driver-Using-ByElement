package testcase;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


/*Suneel Reddy
 * Handling the Web Element
 * Sendkeys to each field
 */

public class HandlingOfElements {

	ChromeDriver driver=null;

	@BeforeSuite
	public void startingWebDriver(){
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void findElement(){
		try{
			/*WebElement ele=driver.findElement(By.id("email"));
			ele.sendKeys("suneelkumar.kethireddy@gmail.com");
			WebElement ele1=driver.findElement(By.id("pass"));
			ele1.sendKeys("kethireddy");*/
			driver.findElement(By.id("email")).sendKeys("suneel.rockstar@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("kethireddy");	
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
	}

}
