package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestLoginLogout extends BaseTest{

	@Test(priority=1,groups= {"Login","smoke"})
	public void TestB() {
		LoginPage loginPage = new LoginPage(driver);
		String un = Utility.getXLData(INPUT_PATH, 1, 0);
		loginPage.setUserName(un);
		Reporter.log(un,true);
		String pw = Utility.getXLData(INPUT_PATH, 1, 1);
		Reporter.log(pw,true);
		loginPage.setPassWord(pw);
		
		loginPage.clickLogin();
		HomePage homePage = new HomePage(driver);
		homePage.clickLogout();
	}
}
