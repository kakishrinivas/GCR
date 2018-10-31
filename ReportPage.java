package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class ReportPage extends TestBase{

	@FindBy(xpath="//*[@id='adminAppMenu']/h3[4]/a")
	WebElement reportsLink;
	@FindBy(xpath="//*[@id='adminAppMenu']/div[4]/ul/li[1]/a")
	WebElement productsViewed;
	
	
	
	public ReportPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public ReportPage verifyClickReportsLink() throws IOException{
		reportsLink.click();
		return new ReportPage();
	}
	
	public ProductViewPage verifyClickProductViewLink() throws IOException{
		productsViewed.click();
		return new ProductViewPage();
	}
}
