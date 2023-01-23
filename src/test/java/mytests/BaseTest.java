package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url,String browserName) {
		System.out.println("launcing browser:"+browserName);
//		if(browserName.equalsIgnoreCase(browserName)) {
//			driver=new ChromeDriver();
//		}else if(browserName.equalsIgnoreCase("firefox")) {
//			driver=new FirefoxDriver();
//		}else if(browserName.equalsIgnoreCase("safari")) {
//			driver=new SafariDriver();
//		}
//		else {
//			System.out.println("please pass the correct browser...."+browserName);
//		}
		
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			
			driver=new FirefoxDriver();
		case "safari":
			driver=new SafariDriver();

		default:
			System.out.println("please pass the right browser:"+browserName);
			break;
		}
			

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);
		
	}


	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
