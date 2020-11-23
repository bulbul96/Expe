package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public WebDriver getDriver() {
		//System.setProperty("WebDriver.Chrome.driver","./Browser/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
}
