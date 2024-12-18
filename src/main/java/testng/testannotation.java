package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testannotation {
	@AfterMethod
	public void TC4() {
Reporter.log("TC4");
System.out.println("4");
}
	@Test
	public void TC3() {
		Reporter.log("TC3");
		System.out.println("3");

	}
	@BeforeClass
	public void TC1() {
		Reporter.log("TC1");
		System.out.println("1");

}
	@BeforeMethod
	public void TC2() {
		Reporter.log("TC2");
		System.out.println("2");
		

}
	@AfterClass
	public void TC5() {
		Reporter.log("TC5");
		System.out.println("5");
		

}
}
