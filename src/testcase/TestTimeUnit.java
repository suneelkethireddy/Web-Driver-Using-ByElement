package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.Test;

public class TestTimeUnit extends StartWebDriver{
	//WebDriver driver=null;
	
	@Test
	public void testTime(){
		LinkHelper.clickLink("Home");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//ButtonHelper.clickButton("Suneel");
		driver.findElement(By.className("_2s25"));
	}
}
