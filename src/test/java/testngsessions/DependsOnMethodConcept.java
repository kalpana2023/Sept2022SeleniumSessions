package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void searchTest(){
		System.out.println();
		int a=9/3;
		
	}
	@Test(dependsOnMethods = "searchTest")
	public void addToCartTest(){
		System.out.println("add to cart test");
		int a=9/0;
		
	}
@Test(dependsOnMethods = "addToCartTest")
	public void paymentTest(){
	System.out.println("Payment test");
		
    }
	

}
