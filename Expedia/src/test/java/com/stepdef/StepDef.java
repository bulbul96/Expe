package com.stepdef;

import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base{
	HomePage hp;//instant variable for HomePage for access to the rest

@Given("^user is on the Expedia homepage$")
public void user_is_on_the_Expedia_homepage() throws Throwable {
    getDriver();
    
}

@When("^user clicks on flight$")
public void user_clicks_on_flight() throws Throwable {
   HomePage hp=new HomePage(driver);
   hp.clickflight();
    
}

@When("^User clicks on roundtrip$")
public void user_clicks_on_roundtrip() throws Throwable {
    hp.RoundTrip();
    
}

@When("^User chooses economic class$")
public void user_chooses_economic_class() throws Throwable {
    hp.ecoClass();
    
}

@When("^user enters departure airport$")
public void user_enters_departure_airport() throws Throwable {
    hp.enterDepair();
    
}

@When("^User enters arrival airport$")
public void user_enters_arrival_airport() throws Throwable {
    hp.enterArrive();
    
}

@When("^User chooses departure date and month$")
public void user_chooses_departure_date_and_month() throws Throwable {
    hp.enterdepDate();
    
}

@When("^User chooses returning date and month$")
public void user_chooses_returning_date_and_month() throws Throwable {
    hp.enterdepDate();
    
}


//@When("^User clicks on search button$")
//public void user_clicks_on_search_button() throws Throwable {
//    hp.
    
//}

@When("^user choose returning month-date$")
public void user_choose_returning_month_date() throws Throwable {

}

@When("^user click on scearch buttom$")
public void user_click_on_scearch_buttom() throws Throwable {

}



 
@Then("^User gets some search results$")
public void user_gets_some_search_results() throws Throwable {
    String title=driver.getTitle();//create a variable for title here, write String title=driver.getTitle();
    Assert.assertEquals(title, "JFK to DAC Flights | Expedia");//Test case verification, for verify actual and expected
    //result
}



}
