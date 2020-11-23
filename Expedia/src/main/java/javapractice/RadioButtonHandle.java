package javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandle {

public static void main(String[] args) {
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");//selenium
//driver.manage().window().maximize();
Dimension d=new Dimension(1000,1000) ;//for window resize
driver.manage().window().setSize(d);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement male = driver.findElement(By.xpath("//input[@id='u_0_7']"));
male.click();
boolean m = male.isSelected();
System.out.println(m);

boolean a = male.isEnabled();
System.out.println(a);

boolean b = male.isDisplayed();
System.out.println(b);

// redio isEnabled()
// isDisplayed() for any element
// isSelected () for checkbox

WebElement sign = driver.findElement(By.xpath("//button[@id='u_0_13']"));
sign.click();

sign.getCssValue("color");
System.out.println(sign.getCssValue("color"));
sign.getSize();



}

}
