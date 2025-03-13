package testing;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility.CustomTestListener.class)
public class ListenersDemoCode {
	@Test
	public void test() {
		System.out.println(1/1);
	}

}
