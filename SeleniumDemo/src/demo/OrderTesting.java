package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderTesting {
	
	@BeforeSuite
	public void method1() {
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void method2() {
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void method3() {
		System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void method4() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void method5() {
		System.out.println("Test");
	}
	@AfterSuite
	public void method6() {
		System.out.println("AfterSuite");
	}
	@AfterClass
	public void method7() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void method8() {
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void method9() {
		System.out.println("AfterMethod");
	}
	
}
