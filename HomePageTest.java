package com.gcr.qa.testcases;

import java.io.IOException;






import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.page.AdminLoginPage;
import com.gcr.qa.page.HomePage;
import com.gcr.qa.page.ProductViewPage;
import com.gcr.qa.page.ReportPage;

public class HomePageTest extends TestBase{
	
	
	
	static AdminLoginPage login;
	static HomePage home;
	static ReportPage report;
	static ProductViewPage productViewPage;
	public HomePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException{
		initialize();
		login= new AdminLoginPage();
		home= new HomePage();
		report=new ReportPage();
		productViewPage =new ProductViewPage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void homePageTitleTest(){
		String title=home.verifyPageTitle();
		Assert.assertEquals(title, "GCR Shop");
	}
	@Test
	public void logoffLinkTest(){
		boolean flag=home.verifyLogoffLink();
		Assert.assertTrue(flag);
	}
	@Test
	public void reportLinkTest(){
		boolean flag=home.verifyReportsLink();
		Assert.assertTrue(flag);
	}
	@Test
	public void clickonReportLinkTest() throws IOException{
		home.verifyClickReportsLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
