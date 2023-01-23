package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenericMethods {

	  static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		By footerCount=By.xpath("//div[contains(@class,'footer-left-section')]//a");
		
		List<String> actElemTextList=getElementsTextList(footerCount);
		System.out.println(actElemTextList);
		
		
		
		if(actElemTextList.contains("Investors")) {System.out.println("PASS");}
		if(actElemTextList.contains("Affiliates")) {System.out.println("PASS");}
		if(actElemTextList.contains("Contact us")) {System.out.println("PASS");}
		}
	public static List<WebElement>getElements(By locator){
	  return	driver.findElements(locator);
	}
		
	
	    
	
	
	
	public static List<String> getElementsTextList(By locator) {
		
	   List<WebElement>eleList=getElements(locator);
		System.out.println(eleList.size());
		List<String> eleTextList=new ArrayList<String>();
	
		for(WebElement e:eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
	return eleTextList;

}
	
	
	}
