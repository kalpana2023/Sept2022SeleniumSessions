package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		WebElement e1=driver.findElement(By.linkText("MacBook"));
		
		
		System.out.println(e1.getAttribute("href"));
		
		
		
		
	}

}
