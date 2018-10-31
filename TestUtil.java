package com.gcr.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.reporters.Files;

import com.gcr.qa.base.TestBase;

public class TestUtil extends TestBase{


public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

public static void takeScreenShotAtEndOfTest(){
	File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
	
	//FileUtils.copyfile(scrFile,new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
}
}
