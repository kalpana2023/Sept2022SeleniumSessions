package seleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseWindowWithAllWindows {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(4000);
		
		String parentWindowId=driver.getWindowHandle();
		
		WebElement linkEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement faceEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitEle=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtEle=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		linkEle.click();
		faceEle.click();
		twitEle.click();
		youtEle.click();
				
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		
		while(it.hasNext()) {
			String windowId=it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());

	}

}
