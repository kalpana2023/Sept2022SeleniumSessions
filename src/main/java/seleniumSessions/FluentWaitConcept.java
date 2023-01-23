package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	 static WebDriver driver; 
	public static void main(String[] args) {
	
	//	WebDriverWait-->FluentWait-->Wait
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		By forgotPswd=By.linkText("Forgot Password?");
		
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				               .withTimeout(Duration.ofSeconds(10))
//				               .pollingEvery(Duration.ofSeconds(2))
//				               .ignoring(ElementNotInteractableException.class)
//				               .ignoring(NoSuchElementException.class)
//				               .ignoring(StaleElementReferenceException.class)
//				               .withMessage("Element not found on page");
//
//		
//		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPswd));
//		ele.click();
		
		waitForElementToBeVisibleWithFluentWait(forgotPswd, 10, 2).click();

	}
	
	public static WebElement waitForElementToBeVisibleWithFluentWait(By locator,int timeout,int intervalTime) {
		
		

		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				               .withTimeout(Duration.ofSeconds(timeout))
				               .pollingEvery(Duration.ofSeconds(intervalTime))
				               .ignoring(ElementNotInteractableException.class)
				               .ignoring(NoSuchElementException.class)
				               .ignoring(StaleElementReferenceException.class)
				               .withMessage("Element not found on page");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	
	public WebElement waitforElementToBeVisible(By locator,int timeout,int intervalTime ) {
		WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofSeconds(intervalTime));
		wait.ignoring(NoSuchElementException.class)
		.ignoring(ElementNotInteractableException.class)
		.withMessage("Element not found on page");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}
}
