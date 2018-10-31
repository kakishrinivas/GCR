package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class AdminLoginPage extends TestBase{
	
	
	//Create Page Factory-OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="tdb1")
	WebElement loginBtn;
	
	@FindBy(linkText="Online Catalog")
	WebElement catalogLink;
	
	@FindBy(xpath="//a[text()='Online Catalog']")
	WebElement clickcatalogLink;
	@FindBy(xpath="//strong[text()='Administrator Login']")
	WebElement loginBoxText;
	@FindBy(xpath="//a[text()='Administration']")
	WebElement headerAdminLink;
	@FindBy(xpath="//a[text()='Support Site']")
	WebElement headerSiteLink;
	@FindBy(xpath="/html/body/table[1]/tbody/tr[1]/td/a/img")
	WebElement image;
	
		
	public AdminLoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle(){
		return driver.getTitle();
	}
	public boolean verifyUserNameField(){
		return username.isDisplayed();
	}
	public boolean verifyUserNameFieldEnabled(){
		return username.isEnabled();
	}
	public boolean verifyPasswordField(){
		return password.isDisplayed();
	}
	public boolean verifyPasswordFieldEnabled(){
		return password.isEnabled();
	}
	public boolean verifyLoginBtn(){
		return loginBtn.isDisplayed();
	}
	public boolean verifyLoginBtnEnabled(){
		return loginBtn.isEnabled();
	}
	 public boolean verifyimageLink(){
		return image.isDisplayed();
	 }
	 public boolean verifyheaderAdminLink(){
			return headerAdminLink.isDisplayed();
	 }
	 public boolean verifyOnlineCatalogLink(){
			return catalogLink.isDisplayed();
	 }
	 public boolean verifyheaderSiteLink(){
			return headerSiteLink.isDisplayed();
	 }
	 public boolean verifyloginBoxTextDisplayed(){
		return loginBoxText.isDisplayed();
	 }
		
	public HomePage login(String un,String pwd) throws IOException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
	}
	public String verifyAdminLinkText(){
		return headerAdminLink.getText();
	}
	public String verifycatalogLinkText(){
		return catalogLink.getText();
	}
	public String verifyheaderSiteLinkText(){
		return headerSiteLink.getText();
	}
	public String verifyloginBoxText(){
		return loginBoxText.getText();
	}
	public CatalogPage clickOnlineCatalogLink() throws IOException{
		catalogLink.click();
		return new CatalogPage();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
