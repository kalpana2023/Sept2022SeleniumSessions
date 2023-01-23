package seleniumSessions;


//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bigBasketExample {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.bigbasket.com/");
		
		WebElement shopByCat=driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopByCat).build().perform();
		
     	//List<WebElement>menuItems=  driver.findElements(By.xpath());
		
		
		//for(WebElement e:menuItems) {
			//String text=e.getText();
			//System.out.println(text);
		//}
		
		
		
		
		
		 
	}

}
