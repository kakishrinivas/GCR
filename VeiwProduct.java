package com.gcr.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class VeiwProduct extends TestBase{

	@FindBy(xpath="//td[text()='Best Viewed Products']")
	WebElement pageHeading;
	
	
	
	public VeiwProduct() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifypageHeading(){
		return pageHeading.getText();
	}
	
	
	

}
