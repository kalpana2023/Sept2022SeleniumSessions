package seleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	
	
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement retryingElement(By locator,int timeout) {
		
		WebElement element=null;
		int attempts = 0;
		
		while(attempts<timeout) {
			try {
				element =getElement(locator);
				System.out.println("Element is found in attempt:"+attempts);
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println("element is not found in attempt:"+attempts+"for"+locator);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			attempts++;
		}
		
		
		if(element==null) {
			System.out.println("element is not found....tried for :"+timeout+"secs"+"with the interval of 1 sec");
		}
		return element;
	}

	public static void main(String[] args) {
	  
		
		driver =new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		By firstName=By.name("first_name");
		
		
	}

}
