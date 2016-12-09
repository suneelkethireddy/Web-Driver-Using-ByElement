package testcase;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartWebDriver {

	 /*@author=suneel reddy
	 * Locating of web Elements
	 * and different ways of locating 
	 * web Elements
	 */
	
	static WebDriver driver=null;
	public static void main(String args[]){


		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		try{
			driver.findElement(By.id("email"));
			driver.findElement(By.className("inputtext"));
			//driver.findElement(By.linkText("Forgotten account?"));;
			driver.findElement(By.name("email"));
			List<WebElement>list1=driver.findElements(By.tagName("input"));
			System.out.println("Size :"+list1.size());
			List<WebElement> list=driver.findElements(By.xpath("//input[@type='text']"));
			System.out.println("Size :"+list.size());
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
	}
}
