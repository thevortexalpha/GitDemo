package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlName) {
		System.out.println("Web Login home");
		System.out.println("URL is "+urlName);
		System.out.println("URL is "+urlName);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login home");
		System.out.println("Mobile Login home");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("API Login home");
		System.out.println("API Login home");
	}
}
