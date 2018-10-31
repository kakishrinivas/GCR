package com.gcr.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gcr.qa.util.WebEventListener;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	//To initialize the config.propertes file
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream fls=new FileInputStream("E:\\backup\\Training\\GCRShop\\src\\com\\gcr\\qa\\config\\config.properties");
		prop.load(fls);

	}
	
	//To initialize and Invoke browser
	public static void initialize() throws IOException{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver","E:/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver","E:/geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To launch application 
		driver.get(prop.getProperty("url"));
					
	}
	
	
	

}
