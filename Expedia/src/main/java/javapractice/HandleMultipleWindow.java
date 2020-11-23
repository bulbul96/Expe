package javapractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindow {
public static void main(String[] args) throws InterruptedException {
WebDriver driver;
WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
//we use set propertise mathode for launge browser
driver = new ChromeDriver();
driver.get("http://demo.guru99.com/popup.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
String MainWindow=driver.getWindowHandle();

//to handle aii new opened window
Set<String> s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
while(i1.hasNext())
{
String childwindow=i1.next();
if(!MainWindow.equalsIgnoreCase(childwindow));{
//switching to hild window
driver.switchTo().window(childwindow);
driver.findElement(By.name("emailid")).sendKeys("shohelyanar@gmail.com");
driver.findElement(By.name("happy")).click();
//closing the child window
driver.close();



}

}
//switch to parent window i.e main window
driver.switchTo().window(MainWindow);

}
}

