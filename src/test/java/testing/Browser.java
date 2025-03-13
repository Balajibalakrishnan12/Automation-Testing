package testing;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.DriverManager;


public class Browser extends DriverManager {
	@Test
	@Parameters("option")
	public static void internetBrowser(@Optional("chrome") String option) {
		
		switch(option) {
		case "chrome":
			DriverManager.getDriver(option);
			System.out.println(1/0);
			break;
		case "IE":
			System.out.println("IE");
			break;
		default:
				System.out.println("invalid option");
			
		}
	}
	


}
