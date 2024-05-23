package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page_Factory.GreenKartPF2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart2 {

private WebDriver driver;
	
	private GreenKartPF2 Kart2;
	

     @Given("Open Browser and Enter the website URL")
     public void open_browser_and_enter_the_website_url() {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    driver.manage().window().maximize();
		Kart2 =new GreenKartPF2(driver);

}

	@When("Select multiple product and add to cart")
	public void select_multiple_product_and_add_to_cart() throws InterruptedException {
	    
		
		
		
		Kart2.prod1();
		Thread.sleep(2000);
		Kart2.prod2();
		Thread.sleep(2000);
		Kart2.prod3();
		Thread.sleep(2000);
		Kart2.prod4();
		Thread.sleep(2000);
		

	}
	@Then("Click on cart icon")
	public void click_on_cart_icon() throws InterruptedException {
		Kart2.Cartlogo();
		Thread.sleep(2000);
	}
	
	@Then("verify whether selected item is present in cart")
	public void verify_whether_selected_item_is_present_in_cart() {
	    
		
		Kart2.Compare();
	}
	

	@Then("Click cancel for third item")
	public void click_cancel_for_third_item() {
	    
		Kart2.Cancelitem();
	}
	@Then("Click on proceed to checkout")
	public void click_on_proceed_to_checkout() throws InterruptedException {
	   
		Kart2.checkout();
		Thread.sleep(3000);
	}

	@Then("without promo code click on apply button")
	public void without_promo_code_click_on_apply_button() throws InterruptedException {
	  
		Kart2.Applybtn();
		Thread.sleep(3000);

	}

	@Then("with promo code click on apply button")
	public void with_promo_code_click_on_apply_button() throws InterruptedException {
	    
		Kart2.EnterCode();
		Thread.sleep(2000);
		Kart2.Applybtn();
		Thread.sleep(2000);

	}
	
	@Then("validate whether applied promo code is valid or not")
	public void validate_whether_applied_promo_code_is_valid_or_not() throws InterruptedException {
	    
		Kart2.Valid();
		Thread.sleep(2000);
		
	}
	
}
