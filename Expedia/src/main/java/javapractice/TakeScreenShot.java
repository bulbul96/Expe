package javapractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

public static void ScreenS(WebDriver driver,String ss) throws IOException {
//static mathod for reusibelety
//if mathod and variable is static then we dont need to creat a object of that class
// we just need to call the class.//if mathod is static then va
TakesScreenshot tkss= (TakesScreenshot)driver;
//takesscreenshoot=silinium interface//getScreenmshot is amathod
//first i have to down cast webdriver variable to takeScreenshot
File fl=tkss.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(fl, new File(ss+".png"));
//.png =extention of taking picture
}  //FileUtils=java io


}//at first i have to create a class(like TakeScreenShort class) under the
//src/main/java Package .Then I have to create a file under the main project
//like (test.png file) and then I will go to the specific class which element
//i need to take picture ,I have to write code under the locator like
//TakeScreenShort.ScreenS(driver,"test");
//picture will be saved test.png file 
