package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Factory.GreenKArtPF1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart1 {

	private WebDriver driver;
	
	private GreenKArtPF1 Kart1;
	
	@Given("Open Browser and Enter url of the website")
	public void open_browser_and_enter_url_of_the_website() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Kart1 =new GreenKArtPF1(driver);
		
	}
	@When("Click on search bar and enter product to be searched and click on search button")
	public void click_on_search_bar_and_enter_product_to_be_searched_and_click_on_search_button() throws InterruptedException {
	    
		
		
		Kart1.clicksearch();
	    Thread.sleep(3000);

	}

	@When("Click on increment")
	public void click_on_increment() {
	    
	    
	    for(int i=1;i<3;i++) {
	    	Kart1.clickplus();
	    }
	}


	@Then("click on add to cart button")
	public void click_on_add_to_cart_button() {
	
		
		Kart1.Cartbutton();
	}

	@And("click on cart icon")
	public void click_on_cart_icon() throws InterruptedException {

		
		Kart1.CartLogo();
		
		Thread.sleep(3000);
	}
	
	@Then("validate the selected items is present in the cart")
	public void validate_the_selected_items_is_present_in_the_cart() throws InterruptedException {
	    
		Kart1.Item();
		Thread.sleep(3000);
		
	}

	@Then("validate the price of selected item is calculated accordingly")
	public void validate_the_price_of_selected_item_is_calculated_accordingly() {
	    
		
		Kart1.Price();
	}

}
