package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void thirdDemo() {
		System.out.println("Day2 First");
	}
	
	@Test
	public void fourthDemo() {
		System.out.println("Day2 Second");
	}
	
	@BeforeTest
	public void prerequiste() {
		System.out.println("I will execute first");
	}
}
