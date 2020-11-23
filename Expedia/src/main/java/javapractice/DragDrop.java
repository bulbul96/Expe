package javapractice;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://jqueryui.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
Actions a=new Actions(driver);
WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
Thread.sleep(2000);
driver.switchTo().parentFrame();
driver.findElement(By.linkText("Selectable")).click();
TakeScreenShot.ScreenS(driver,"test");
}

}
