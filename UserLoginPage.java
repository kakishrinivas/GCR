package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class UserLoginPage extends TestBase {
	

	@FindBy(linkText="login")
	WebElement login;
	
	@FindBy(className="E-Mail Address")
	WebElement email;
	
	@FindBy(className="Password:")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement signinBtn;
	
	public UserLoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public void verifyClickOnLoginBtn(){
		login.click();
	}
	 public SignIn uLogin(String mail,String pwd) throws IOException{
		 email.sendKeys(mail);
		 password.sendKeys(pwd);
		 signinBtn.click();
		 return new SignIn();
	 }
	
	
	
	
	
	
	
}
