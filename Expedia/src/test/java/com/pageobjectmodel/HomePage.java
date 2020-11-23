package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//local variable
WebDriver driver;
	public HomePage(WebDriver driver) {
	//contstructor method same class name'HomePage'
		this.driver= driver;//this keyword is used for the driver
		PageFactory.initElements(driver, this);//
		
	}
@FindBy(xpath="(//a[@class='uitk-tab-anchor'])[2]")//find the xpath for the element
WebElement flight;//just declare a name for the element
public void clickflight() {
	flight.click();
	
}
//@FindBy(xpath="//span[contains(text(),'One-way')]")
//WebElement roundtrip;
//public void clickroundtrip() {
//	roundtrip.click();
//}

@FindBy(xpath="//span[contains(text(),'Roundtrip')]")
WebElement RoundTrip;

public void RoundTrip() {
RoundTrip.click();

}
//@FindBy(xpath=("(//a[@class='uitk-list-item'])[2]"))
//WebElement economy;
//public void selecteconomy() {
//	economy.isSelected();
//}

/*public void ecoClass() {
String s = "Economy";
WebElement Eco =driver.findElement(By.xpath("//a[@id='preferred-class-input-trigger']"));
Eco.click();
Eco.getText().contentEquals(s);
}
*/


@FindBy(xpath = "//a[@id='preferred-class-input-trigger']")
WebElement Editclass;
@FindBy(xpath = "(//a[@class='uitk-list-item'])[2]")
WebElement Editeco;

public void ecoClass() {
Editclass.click();
Editeco.click();


}

/*
@FindBy(xpath="//input[@id='location-field-destination']")
WebElement Departure;
public void Departure() {
	Departure.getLocation();
}*/

@FindBy(xpath = "(//button[@class='uitk-faux-input'])[1]")
WebElement depAir;
@FindBy(xpath = "(//div[@class='is-subText truncate'])[1]")
WebElement airde;

public void enterDepair() {
depAir.sendKeys("jfk");
airde.click();

}

/*
@FindBy(xpath="//input[@id='location-field-leg1-destination']")
WebElement Arrival;
public void Arrival() {
	Arrival.getLocation();
}
@FindBy(xpath="//button[@id='d1-btn']")
WebElement DepartureDate;
public void DepartureDate() {
	
	DepartureDate.click();
	
	boolean d=DepartureDate.isSelected();
	
}
*/

@FindBy(xpath = "(//button[@class='uitk-faux-input'])[2]")
WebElement arriveAir;
@FindBy(xpath = "//strong[contains(text(),'Dhaka (DAC - Shahjalal Int')]")
WebElement airArrive;

public void enterArrive() {
arriveAir.sendKeys("dh");
airArrive.click();
}

/*
@FindBy(xpath="//button[@id='d2-btn']")
WebElement ReturnDate;
public void ReturnDate() {
	ReturnDate.isSelected();
}
@FindBy(xpath="(//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'])[1]")
WebElement Search;
public void Search() {
	Search.click();
}
}
*/
public void enterdepDate() throws InterruptedException {
driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
while (true) {

String month = "November 2020";

String mon = driver.findElement(By.xpath(
"//div[@class='uitk-flex uitk-flex-justify-content-space-between uitk-new-date-picker-menu-pagination-container']"))
.getText();
if (mon.equals(month)) {
break;
} else {
driver.findElement(By.xpath(
"(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'])[2]"))
.click();
Thread.sleep(1000);
} // end if
driver.findElement(By.xpath("(//button[@class='uitk-new-date-picker-day'])[8]")).click();
}// end of while
}// end method
}