package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import TestUtils.ExcelReader;

public class LoginTest extends BaseTest {

	@Test(priority = 0)
	public void invalidLoginTest_InvalidUserNameInvalidPassword() {

		// *************PAGE INSTANTIATIONS*************
		HomePage homePage = new HomePage(driver);
		String username = ExcelReader.getCellData("LoginDetails", "User_email", 2);
		String password = ExcelReader.getCellData("LoginDetails", "Login_Password", 2);

		// *************PAGE METHODS********************
		homePage.goToLoginPage().loginToN11(username,password)
				.verifyLoginPassword(("Message"))
				.verifyLoginPassword(("Message"));
	}
}
