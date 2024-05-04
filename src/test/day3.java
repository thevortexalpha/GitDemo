package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Beginning of class 3");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("End of class 3");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void WebLogincarLoan(String urlName, String key) {
		System.out.println("Web Login car");
		System.out.println("URL is "+urlName);
		System.out.println("API Key is "+key);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan() {
		System.out.println("Mobile Login car");
	}
	
	@Test(enabled = false)
	public void MobilesignincarLoan() {
		System.out.println("Mobile signin car");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String userName, String password) {
		System.out.println("Mobile singout car");
		System.out.println("Current username is "+userName);
		System.out.println("Current password is "+password);
		System.out.println("Current password is "+password);
	}
	
	@Test(dependsOnMethods = {"WebLogincarLoan", "MobilesignoutcarLoan"})
	public void APIcarLoan() {
		System.out.println("API Login car");
	}
	
	@DataProvider
	public Object[][] getData() {
		 Object[][] data = new Object[3][2];
		 
		 data[0][0] = "firstName";
		 data[0][1] = "firstPassword";
		 
		 data[1][0] = "secondName";
		 data[1][1] = "secondPassword";
		 
		 data[2][0] = "thirdName";
		 data[2][1] = "thirdPassword";
		 
		 return data;
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I'm number one");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I Will execute before every methods in 3rd class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I Will execute after every methods in 3rd class");
	}
}
