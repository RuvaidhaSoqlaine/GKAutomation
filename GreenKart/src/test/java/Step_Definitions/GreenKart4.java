package Step_Definitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page_Factory.GreenKartPF4;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart4 {

	 private WebDriver driver;
		
		private GreenKartPF4 Kart4;
		
		@Given("Open browser and enter url")
		public void open_browser_and_enter_url() {
		   
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			Kart4 =new GreenKartPF4(driver);
			
		}

		@When("click on flight booking link")
		public void click_on_flight_booking_link() {
		
			Kart4.flightlink();
		}

		@Then("Enter text on country text and select the country from picklist")
		public void enter_text_on_country_text_and_select_the_country_from_picklist() throws InterruptedException {
		    
			
			Set<String> windows= driver.getWindowHandles();      
			Iterator<String> It= windows.iterator();
			String parentId=It.next();
			String childId=It.next();
			driver.switchTo().window(childId);
			Kart4.autosuggest();
			Thread.sleep(2000);
			Kart4.IndiaSelect();
		}

		@Then("click on fligts title")
		public void click_on_fligts_title() throws InterruptedException {


			Kart4.FlightTle();
			Thread.sleep(2000);
		}

		@Then("check mark on round trip radio button")
		public void check_mark_on_round_trip_radio_button() {
		   
			Kart4.Round();
			
		}

		@Then("under FROM click on departure city and select city")
		public void under_from_click_on_departure_city_and_select_city() throws InterruptedException {
		    
			
			Kart4.departure();
			Thread.sleep(2000);
			
			Kart4.CitySel();
			Thread.sleep(2000);

		}

		@Then("under TO click on arrival city and select city")
		public void under_to_click_on_arrival_city_and_select_city() {
		   
			
			Kart4.Arrival();
			
		}

		@Then("click on departure date picklist and select the date")
		public void click_on_departure_date_picklist_and_select_the_date() throws InterruptedException {
		   
			Kart4.ddate();
			Thread.sleep(3000);

		}

		@Then("click on return date picklist and select the date")
		public void click_on_return_date_picklist_and_select_the_date() throws InterruptedException {
		    
			Kart4.rdate();
			Thread.sleep(2000);
			Kart4.arrdate();
		}

		@Then("click on passengers dropdown button and click adult twice and child once and infant once and click done button")
		public void click_on_passengers_dropdown_button_and_click_adult_twice_and_child_once_and_infant_once_and_click_done_button() throws InterruptedException {
		   
			Kart4.passenger();
		    Thread.sleep(2000);
		    
		    Kart4.Adult();
		    Thread.sleep(2000);
		    
		    Kart4.Child();
		    Thread.sleep(2000);

		    Kart4.Infant();
		    Thread.sleep(2000);
		    
		    Kart4.Done();
		    Thread.sleep(2000);

		}

		@Then("click on dropdown button under currency and select INR")
		public void click_on_dropdown_button_under_currency_and_select_inr() {
		    
			
			Kart4.Currency();
		}

		@Then("click on family and friends radio button")
		public void click_on_family_and_friends_radio_button() throws InterruptedException {
		    
			
			Kart4.CheckBox();
			Thread.sleep(2000);
		}

		@Then("click on search button")
		public void click_on_search_button() throws InterruptedException {
		    
			Kart4.Searchbtn();
			Thread.sleep(2000);
			
		}
		
		@Then("validate the pop up is displayed with text")
		public void validate_the_pop_up_is_displayed_with_text() {
		    

			Kart4.validate();
			
		}

		@And("click on OK button in the pop up")
		public void click_on_ok_button_in_the_pop_up() {
			
			
			driver.switchTo().alert().accept();
		}

	
}
