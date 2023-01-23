package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	//global precondition-BeforeSuite,BeforeTest,BeforeMethod
	//pre condition
	//test steps
	//validations:act vs exp result-->Assertions---Assert
	//post step--AfterSuite,AfterTest
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--connectWithDB");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT---createUser");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC----LaunchBrowser");
	}
	@BeforeMethod
	public void login() {
       System.out.println("BM---login in to app");
	}

	@Test
	public void homePageTest() {
		System.out.println("homepageTest");
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	@Test
	public void cartTest() {
		System.out.println("cartTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM---logout");
	}
   @AfterClass
public void closeBrowser() {
	   System.out.println("AC---close Browser");
   }
   @AfterTest
   public void deleteUser() {
	   System.out.println("AT---deleteUser");
   }
   @AfterSuite
   public void disconnectWithDB() {
	   System.out.println("AS----disconnectWithDB");
   }
}
