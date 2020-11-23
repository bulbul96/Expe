package javapractice;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://nppes.cms.hhs.gov/#/");
		Dimension a=new Dimension(800, 600);//object is created for Dimension class, passing variable into Dimension class
		driver.manage().window().getSize();//how do you control your window size?
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("DECLINE")).click();
		driver.findElement(By.xpath("//button[contains(text(),'DECLINE')]")).click();
		//driver.findElement(By.xpath("")
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
	}

}
