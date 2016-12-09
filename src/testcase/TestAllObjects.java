package testcase;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAllObjects {
	
	ChromeDriver driver=null;
	@BeforeSuite
	public void startWebDriver(){
		
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void testAll(){
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(WebElement ele:link){
			System.out.println("Link : "+ele.getText());
			System.out.println("href : "+ele.getAttribute("href"));
		}
		List<WebElement> cla=driver.findElements(By.cssSelector(".txt"));
		for(WebElement ele :cla){
			System.err.println("id : "+ele.getAttribute("id"));
			System.err.println("Name : "+ele.getAttribute("name"));
			System.err.println("title :"+ele.getAttribute("title"));
		}
	}

}
