package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationDataTest extends BaseTest{
	
	
	@DataProvider
	public  Object[][] getRegistrationData(){
		return new Object[][] 
			{
				{"kalpana","valivarthy","valivarthy12@gmail.com","1234567890","valivarthy123"},
				{"kalpan","valivarth","valivarthy1@gmail.com","1234567891","valivarthy12"},
				{"kalpa","valivar","valivarthy@gmail.com","1234567892","valivarthy1"},
				{"kalp","valiva","valivarth@gmail.com","1234567893","valivarthy"},
				{"kal","val","valiva@gmail.com","1234567899","vali"},
			
	
	     };
	}
	
	@Test(dataProvider ="getRegistrationData")
	public void registrationDataTest(String fName,String lName,String id,String tel,String pswd ) {
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(fName);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lName);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name(	"email")).sendKeys(id);
		driver.findElement(By.name("telephone")).clear();
		driver.findElement(By.name(	"telephone")).sendKeys(tel);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name(	"password")).sendKeys(pswd);
		driver.findElement(By.name("confirm")).clear();
		driver.findElement(By.name(	"confirm")).sendKeys(pswd);
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='submit']"));
		ele.click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Register Account");
	}

}
