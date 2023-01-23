package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExclipitWaitConcept {

	public static void main(String[] args) {

		
		//Exclipit wait
		
		//can be applied for a specific element
		//its not a global wait
		
		//WedDriverWait()->extends->FluentWait()-->implements->Wait()

		
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://naveenautomationlabs.com/opencart/");
			
			
			By macbook=By.linkText("MacBook");
			
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			WebElement mac_ele=wait.until(ExpectedConditions.presenceOfElementLocated(macbook));
			
			mac_ele.click();
			
			
		
	}

}
