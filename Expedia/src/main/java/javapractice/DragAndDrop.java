package javapractice;

import java.awt.Dimension;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
    	//Dimension a=new Dimension(800, 600);//object is created for Dimension class, passing variable into Dimension class
		driver.manage().window().getSize();//how do you control your window size?
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("iframe[@class='demo-frame']")));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
		TakeScreenShot.ScreenS(driver,"test");
		a.dragAndDrop(from, to).build().perform();
	}

}
