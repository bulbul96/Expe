package javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBgetText {

public static void main(String[] args) {
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys("abc");
String s = driver.findElement(By.id("email")).getAttribute("value");
System.out.println(s);
driver.close();


}

}
