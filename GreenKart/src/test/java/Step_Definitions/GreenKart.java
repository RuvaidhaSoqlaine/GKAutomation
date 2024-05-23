package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Factory.GreenKartPF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart {

	private WebDriver driver;

	private GreenKartPF Kart;

	
	@Given("Open Browser and Enter the url")
	public void open_browser_and_enter_the_url() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Kart =new GreenKartPF(driver);

		
	}

	@When("User should select the 10th item and click add to cart button")
	public void user_should_select_the_10th_item_and_click_add_to_cart_button() {
	   
		Kart.clickaddcart();
		
		
	}

	@Then("Click on cart button")
	public void click_on_cart_button() {
	    
		Kart.cart();

	}
	
	@Then("validate selected item is present in cart")
	public void validate_selected_item_is_present_in_cart() {
	    
		Kart.SelectItem();
	}

	@Then("validate the price of selected item")
	public void validate_the_price_of_selected_item() {
	    
		
		Kart.Price();
	}
	
	
	@And("user quit the browser")
	public void user_quit_the_browser() {
	  driver.close();
	}

}
