package script;

import org.testng.Assert;
import org.testng.Reporter; 
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;

public class TestDemo extends BaseTest {

	@Test
	public void testA() {
		String data = Utility.getXLData(INPUT_PATH, 0, 0);
		Reporter.log("Data : "+data,true);
		
		int r = Utility.getXLRowCount(INPUT_PATH);
		Reporter.log("Row : "+r,true);
//		String p = Utility.getPhoto(driver, PHOTO_PATH);
//		Reporter.log("Photo : "+p,true);
	}
	
	
}
