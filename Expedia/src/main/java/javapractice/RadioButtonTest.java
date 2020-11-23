package javapractice;

import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://test.rubywatir.com/radios.php");//selenium
		//driver.manage().window().maximize();
		Dimension d=new Dimension(1000,1000); //for window resize
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
		radio.click();
		//Thread.sleep(2000);
		boolean r = radio.isSelected();
		System.out.println(r);
		
		Thread.sleep(2000);
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		radiobutton.click();
		//Thread.sleep(2000);
		boolean b = radiobutton.isSelected();
		System.out.println(b);
		
		Thread.sleep(2000);
		WebElement radioc = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		radioc.click();
		//Thread.sleep(2000);
		boolean c = radioc.isSelected();
		System.out.println(c);
		
		Thread.sleep(2000);
		WebElement radiof = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radiof.click();
		//Thread.sleep(2000);
		boolean f = radiof.isSelected();
		System.out.println(f);
		
		Thread.sleep(2000);
		WebElement radioe = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		radioe.click();
		//Thread.sleep(2000);
		boolean e = radioe.isSelected();
		System.out.println(e);
		Thread.sleep(2000);
		WebElement radiog = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radiog.click();
		//Thread.sleep(2000);
		boolean g = radiog.isSelected();
		System.out.println(g);
}
}