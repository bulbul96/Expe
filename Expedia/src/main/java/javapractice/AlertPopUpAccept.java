package javapractice;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpAccept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://nppes.cms.hhs.gov/#/");
		Dimension a=new Dimension(800, 600);
		driver.manage().window().getSize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'ACCEPT')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		

	}

}
