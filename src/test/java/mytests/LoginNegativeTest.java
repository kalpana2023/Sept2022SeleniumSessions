package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] loginNegativeData(){
		return new Object[][] {
			
			{"asasa@gmail.com", "asa123"},
			{"naveenanimation20@gmail.com", "asaas123"},
			{"naveenanimation20@gmail.com", "    "},
			{"naveenanimation22121210@gmail.com", "Selenium@12345"},
			{"kalpana@gmail.com", "aa123"},
			
	
		};
	}
		
	@Test(dataProvider ="loginNegativeData")
	
	public void loginNegativeTest(String userName,String pswd) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String errorMsg=
				driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		Assert.assertTrue(errorMsg.contains("No match for E-Mail Address and/or Password"));
		
	}
	
	
	
	

}
