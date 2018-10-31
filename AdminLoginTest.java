package com.gcr.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.page.AdminLoginPage;
import com.gcr.qa.page.CatalogPage;

public class AdminLoginTest extends TestBase{
	
	static AdminLoginPage login;
	static CatalogPage catalogPage;
	public AdminLoginTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException{
		initialize();
		login= new AdminLoginPage();
		catalogPage= new CatalogPage();
	}
	@Test(priority=1)
	public void verifyLoginPageTitleTest(){
		String title=login.verifyPageTitle();
		Assert.assertEquals(title, "GCR Shop", "Title name not matched");
	}
	@Test(priority=2)
	public void verifyOnlineCatalogLinkTest(){
		boolean flag=login.verifyOnlineCatalogLink();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void verifyUserNameFieldTest(){
		boolean flag=login.verifyUserNameField();
		Assert.assertTrue(flag);
	}
	@Test(priority=4)
	public void verifyUserNameFieldEnabledTest(){
		boolean flag=login.verifyUserNameFieldEnabled();
		Assert.assertTrue(flag);
	}
	@Test(priority=5)
	public void verifyPasswordFieldTest(){
		boolean flag=login.verifyPasswordField();
		Assert.assertTrue(flag);
	}
	@Test(priority=6)
	public void verifyPasswordFieldEnabledTest(){
		boolean flag=login.verifyPasswordFieldEnabled();
		Assert.assertTrue(flag);
	}
	@Test(priority=7)
	public void verifyLoginBtnTest(){
		boolean flag=login.verifyLoginBtn();
		Assert.assertTrue(flag);
	}
	@Test(priority=8)
	public void verifyLoginBtnEnabledTest(){
		boolean flag=login.verifyLoginBtnEnabled();
		Assert.assertTrue(flag);
	}
	@Test(priority=50)
	public void verifyAdminLogin() throws IOException{
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=9)
	public void verifyClickonCatalogLinkTest() throws IOException{
	login.clickOnlineCatalogLink();
	
	driver.navigate().back();
	}
	@Test(priority=10)
	public void verifyheaderAdminLinkTest(){
		boolean flag=login.verifyheaderAdminLink();
		Assert.assertTrue(flag);
	}
	@Test(priority=11)
	public void verifyheaderSiteLinkTest(){
		boolean flag=login.verifyheaderSiteLink();
		Assert.assertTrue(flag);
	}
	@Test(priority=12)
	public void verifyloginBoxTextTest(){
		boolean flag=login.verifyloginBoxTextDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority=13)
	public void verifyimageLinkTest(){
		boolean flag=login.verifyimageLink();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void getTextloginBoxTest(){
		String loginBox=login.verifyloginBoxText();
		Assert.assertEquals(loginBox, "Administrator Login");;
	}
	@Test(priority=15)
	public void getTextAdminLinkTest(){
		String adminLinkText=login.verifyAdminLinkText();
		Assert.assertEquals(adminLinkText, "Administration");;
	}
	@Test(priority=16)
	public void getTextSiteLinTest(){
		String siteLink=login.verifyheaderSiteLinkText();
		Assert.assertEquals(siteLink, "Support Site");;
	}
	@Test(priority=17)
	public void getTextcatalogLinkTest(){
		String catalog=login.verifycatalogLinkText();
		Assert.assertEquals(catalog, "Online Catalog");;
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
