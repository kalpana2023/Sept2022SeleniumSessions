

package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	public void aTest() {
		System.out.println("atest");
	}
	@Test
	public void bTest() {
		System.out.println("btest");
	}
	@Test
	public void cTest() {
		System.out.println("ctest");
	}
	@Test(priority=2)
	public void dTest() {
		System.out.println("dtest");
	}
	@Test(priority=2)
	public void eTest() {
		System.out.println("etest");
	}
	
}
