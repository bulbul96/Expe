package javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

public static void main(String[] args) {
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.expedia.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Actions ac = new Actions(driver);
WebElement a = driver.findElement(By.xpath("(//a[@class='uitk-tab-anchor'])[2]"));
ac.moveToElement(a).contextClick().perform();


}

}