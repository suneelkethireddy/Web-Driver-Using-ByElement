package testcase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
/*
 * @author:Suneel Reddy
 * Selection from a
 * DropDown and commands
 * used with selction
 */
public class SelectionFromDropDown {
	static ChromeDriver driver=null;
	@BeforeSuite
	public void startWebDriver(){
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get("http://www1.macys.com/");
	}
	@Test
	public void testDropDown(){
		
		Select ser=new Select(driver.findElement(By.id("flexLabel_1")));
		ser.selectByIndex(0);
		ser.selectByValue("Boots");
		ser.selectByVisibleText(null);
	}
	

}
