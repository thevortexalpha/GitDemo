package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void prerequiste() {
		System.out.println("I will execute last");
		System.out.println("I will execute last");
	}

	@Test
	public void demo() {
		System.out.println("Day1 First");
		Assert.assertTrue(false);
	}

	@Test
	public void secondDemo() {
		System.out.println("Day1 Second");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I'm the last number one");
		System.out.println("I'm the last number one");
	}
}
