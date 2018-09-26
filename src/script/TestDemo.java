package script;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TestDemo extends BaseTest {

	@Test
	public void testA() {
		Reporter.log("testA",true);
	}
	@Test
	public void testB() {
		Reporter.log("testB",true);
	}
	
}
