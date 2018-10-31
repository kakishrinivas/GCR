package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class ProductViewPage extends TestBase{

	@FindBy(xpath="//*[@id='adminAppMenu']/div[4]/ul/li[1]/a")
	WebElement productsViewed;
	
	
	
	public ProductViewPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
		public VeiwProduct verifyClickProductViewLink() throws IOException{
		productsViewed.click();
		return new VeiwProduct();
	}

}
