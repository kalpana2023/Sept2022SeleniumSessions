package mytests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenCartLinksTest extends BaseTest{
	
	@Test
	
	public void openCartLinksTest() {
		
		driver.findElement(By.linkText("Register")).click();
	}
	
	

}
