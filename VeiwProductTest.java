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
import com.gcr.qa.page.VeiwProduct;

public class VeiwProductTest extends TestBase{
	static AdminLoginPage login;
	static HomePage home;
	static ReportPage report;
	static ProductViewPage productViewPage;
	static VeiwProduct veiwProduct;
	public VeiwProductTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException{
		initialize();
		login= new AdminLoginPage();
		home= new HomePage();
		report=new ReportPage();
		productViewPage =new ProductViewPage();
		veiwProduct =new VeiwProduct();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		report.verifyClickReportsLink();
		productViewPage.verifyClickProductViewLink();
		
	}
		
	@Test(priority=1)
	public void veiwProductTest() throws IOException{
		String pageHeddinh=veiwProduct.verifypageHeading();
		Assert.assertEquals(pageHeddinh, "Best Viewed Products");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
