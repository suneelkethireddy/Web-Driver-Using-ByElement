package testcase;

import java.io.File;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LinkHelper {

	static ChromeDriver driver=null;
	@BeforeSuite
	public void startWebDriver(){
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		LinkHelper.clickLink("Create a Page");
	}
	@Test
	public static void clickLink(String linkText){
		if(driver.findElements(By.linkText(linkText)).size()==1){
			driver.findElement(By.linkText(linkText)).click();
		}else if(driver.findElements(By.partialLinkText(linkText)).size()==1){
			driver.findElement(By.partialLinkText(linkText)).click();
		}else 
			throw new NoSuchElementException("Link Text Not Found:"+linkText);
	}
}
