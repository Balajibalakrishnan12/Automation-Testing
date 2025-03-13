package testing;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.bidi.module.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Addtocart;
import pages.FinalStatus;
import pages.LoginPage;
import pages.Payment;
import pages.ProductPage;
import utility.DriverManager;

public class TestCases {
	List<String> productnames = new ArrayList<String>();
	
	@BeforeMethod(groups="logingroup")
	public void setup() {
		DriverManager.getDriver("chrome");
		DriverManager.url("https://www.saucedemo.com/v1/");
		System.out.println("browser launched");
		
	}

	@AfterSuite
	public void teardown() {//
	DriverManager.close();
		System.out.println("browser close");
	}
	
	@Test(priority = 1,groups="logingroup")
	@Parameters({ "username", "password" })
	public void loginpage(String username, String password) {
		// will have only have steps to implements
		// login with username and password
		
		LoginPage login = new LoginPage();
		login.loginTextBox(username, password);
		System.out.println(username);
		System.out.println(password);
	}

	// click&select dropdown
	// @Test(dependsOnMethods="loginpage",alwaysRun = true )//always run - used to
	// run the code if code fails also
//	@Test(priority = 2)
//	public void productpage() {
//		System.out.println("user is in product page");
//		ProductPage product = new ProductPage();
//		product.dropDownByIndex(2);
////		 product.menuBar();
////		 product.clickLogoutButton();
//		productnames.add("Sauce Labs Backpack");
//		productnames.add("Sauce Labs Bike Light");
//		product.productSelection(productnames);
//		// product.menuBar();
//		// product.clickLogoutButton();
//
//}
//
	
//	
//		@Test(priority=3)
//		public void productaddtocart() throws InterruptedException {
//			Addtocart cart = new Addtocart();
//			//cart.itemcartButton();
//			//cart.addtocartButton();
//			cart.container();
//			cart.checkingItemisAvailable(productnames);
//			List<String> item = new ArrayList<String>();
//			item.add("Sauce Labs Backpack");
//			item.add("Sauce Labs Bike Light");
//			
//			cart.checkout();
//			
//		}
//		@Test(priority=4)
//		public void processingpayment() {
//			Payment amount = new Payment();
//			amount.paymentofproducts("Balaji", "Balakrishnan", 605004);
//			
//		}
//		
//		@Test(priority = 5)
//		public void overallcalculation() {
//			FinalStatus overall=new FinalStatus();
//			overall.calculation();
//			overall.finish();
//		}
		

}
