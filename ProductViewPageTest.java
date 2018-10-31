package com.gcr.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.page.AdminLoginPage;
import com.gcr.qa.page.HomePage;
import com.gcr.qa.page.ProductViewPage;
import com.gcr.qa.page.ReportPage;

public class ProductViewPageTest extends TestBase{
	static AdminLoginPage login;
	static HomePage home;
	static ReportPage report;
	static ProductViewPage productViewPage;
	
	public ProductViewPageTest() throws IOException {
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
		report.verifyClickReportsLink();
		
	}
		
	@Test(priority=1)
	public void clickProductViewLink() throws IOException{
		productViewPage.verifyClickProductViewLink();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}


