package javapractice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElementList {

public static void main(String[] args) {
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.expedia.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
List<WebElement> L=driver.findElements(By.xpath("//section[contains(@class,'header-region no-stripe')]"));
for(int i=0;i<L.size();i++) {
String s=L.get(i).getText();//get and gettext mathod we get from List javainterfece
System.out.println(s);
}//text or name of that WebElement functions ,we use or loop
System.out.println(L.size());//number of functions in WebElement
}

}
