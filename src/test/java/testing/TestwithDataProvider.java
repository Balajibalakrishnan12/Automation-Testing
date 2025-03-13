package testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;
import utility.DriverManager;
import utility.ExcelUtility;
import utility.ScreenShotUtility;

public class TestwithDataProvider {
	List<String> productnames = new ArrayList<String>();

//	@DataProvider(name = "logindata") // syntax for dataprovider
//	public Object[][] dataProvider() { // by default dataprovider will two dimension array
//		return new Object[][] { { "standard_user", "secret_sauce","Sauce Labs Backpack" },{ "problem_user", "secret_sauce","Sauce Labs Bike Light" }};// setup for
//																											// data																											// provider
//	}
//
//	@Test(priority = 1, dataProvider = "logindata", groups = "logingroup")
//	public void test(String username, String password,String productname) {
//		LoginPage login = new LoginPage();
//		login.loginTextBox(username, password);
//		ProductPage product = new ProductPage();
//		product.dropDownByIndex(2);
//		productnames.add(productname);
//		product.productSelection(productnames);
//		
//	}
	@BeforeMethod
	public void setup() throws IOException {
		DriverManager.url("https://www.saucedemo.com/v1/");
		System.out.println("browser launched");

	}

//	@AfterMethod
//	public void teardown() {//
//		
//		System.out.println("browser close");
//	}
	
	@BeforeSuite
	public void launchBrowser(){
		DriverManager.getDriver("chrome");
	}
	@AfterSuite
	public void closeBrowser() {
		DriverManager.close();

	}
//	@BeforeMethod
//	public void screenShot() throws IOException {
//		ScreenShotUtility.takeScreenshot();
//	}
	@DataProvider(name="excelData")
	public Object[][] excelData() throws IOException {
		return ExcelUtility.excelRead();
	}
	@Test(priority = 1, dataProvider = "excelData")
	public void testWithExcelData(String username, String password,String productname) throws IOException {
		LoginPage login = new LoginPage();
		//ScreenShotUtility.takeScreenshot();
		login.loginTextBox(username, password);
		ProductPage product = new ProductPage();
		product.dropDownByIndex(2);
		productnames.add(productname);
		product.productSelection(productnames);
		//ScreenShotUtility.takeScreenshot();

		
	}
	

	
}
