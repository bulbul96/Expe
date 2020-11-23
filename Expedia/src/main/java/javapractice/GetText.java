package javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

public static void main(String[] args) throws InterruptedException {
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
String s = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value");
System.out.println(s);
driver.close();

}

}
