package TestPages;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends LoginPage {

	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider="LoginData")
	
	public void LoginTest1(String UserName, String PassWord) {
		
		LoginTest(UserName, PassWord);
	}
}
