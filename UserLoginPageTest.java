package com.gcr.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.page.SignIn;
import com.gcr.qa.page.UserLoginPage;

public class UserLoginPageTest extends TestBase {
	public static UserLoginPage userLoginPage;
	public static SignIn signIn;
	public UserLoginPageTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setup() throws IOException{
		initialize();
		signIn =new SignIn();
		userLoginPage = new UserLoginPage();
	}
	
	@Test
	public void clickonlogin() throws IOException{
		userLoginPage.verifyClickOnLoginBtn();
	}
	@Test
	public void userLogin() throws IOException{
		userLoginPage.uLogin(prop.getProperty("email"), prop.getProperty("upassword"));
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
