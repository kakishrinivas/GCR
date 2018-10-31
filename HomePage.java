package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(linkText="Logoff")
	WebElement logoff;
	@FindBy(xpath="//a[text()='Administration']")
	WebElement administrationLink;
	@FindBy(xpath="//a[text()='Online Catalog']")
	WebElement onlineCatalogLink;
	@FindBy(xpath="//a[text()='Support Site']")
	WebElement SupportSiteLink;
	@FindBy(xpath="//a[text()='Catalog']")
	WebElement catalogText;
	@FindBy(xpath="//a[text()='Categories/Products']")
	WebElement categoriesProductsLink;
	@FindBy(xpath="//a[text()='Manufacturers']")
	WebElement ManufacturersLink;
	@FindBy(xpath="//a[text()='Reviews']")
	WebElement reviewsLink;
	@FindBy(xpath="//*[@id='adminAppMenu']/h3[2]/a")
	WebElement customersLink;
	@FindBy(xpath="//*[@id='adminAppMenu']/h3[3]/a")
	WebElement localizationLink;
	@FindBy(xpath="//*[@id='adminAppMenu']/h3[4]/a")
	WebElement reportsLink;

	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	//Action
	public String verifyPageTitle(){
		return driver.getTitle();
	}
	public boolean verifyLogoffLink(){
		return logoff.isDisplayed();
	}
	public boolean verifyReportsLink(){
		return reportsLink.isDisplayed();
	}
	
	public ReportPage verifyClickReportsLink() throws IOException{
		reportsLink.click();
		return new ReportPage();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
