package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties properties;
	private AppiumServiceBuilder builder;
	private AppiumDriverLocalService service;

	
	public TestBase() {
		
		properties = new Properties();
		try {
			FileInputStream fis= new FileInputStream("S:\\Personal\\MyWorkspace\\Cucumber_POM\\src\\main\\java\\com\\qa\\config\\config.properties");
			properties.load(fis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

	
	public static void intialization() {
		
		String browser = properties.getProperty("browser");
		
		if(browser.equals("chrome")) {
			
		    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();	
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(properties.getProperty("url"));
			
			
			
		}
		
	}
	
	


}
