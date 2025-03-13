package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pages.LoginPage;
import utility.DriverManager;

public class TestingUser {

	@BeforeClass
	public void setup() {
		DriverManager.getDriver("chrome");
		DriverManager.url("https://www.saucedemo.com/v1/");
	}
	
	@AfterClass
	public void teardown() {//
		DriverManager.close();
	}
	@Test
	@Parameters({"uname","pwd"})
	public void loginaccount(String username,String password) {		
		//will have only have steps to implements
		//login with username and password 
		LoginPage login = new LoginPage();
		login.loginTextBox(username,password);
		
	}
}
