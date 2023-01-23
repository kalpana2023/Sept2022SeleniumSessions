package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
	
  WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.name("firstname")).sendKeys("kalpana");
		driver.findElement(By.name("lastname")).sendKeys("valivarthy");
		driver.findElement(By.name(	"email")).sendKeys("valivarthy1234@gmail.com");
		driver.findElement(By.name(	"telephone")).sendKeys("1234567890");
		driver.findElement(By.name(	"password")).sendKeys("valivarthy123");
		driver.findElement(By.name(	"confirm")).sendKeys("valivarthy123");
		
	}
	
	@Test
	
public void registrationTest() {
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='submit']"));
		ele.click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Register Account");
		
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
//https://naveenautomationlabs.com/opencart/index.php?route=account/success