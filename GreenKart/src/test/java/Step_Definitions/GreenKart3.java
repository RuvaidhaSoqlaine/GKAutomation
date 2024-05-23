package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page_Factory.GreenKartPF3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart3 {

    private WebDriver driver;
	
	private GreenKartPF3 Kart3;
	
	@Given("Open Browser and enter url")
	public void open_browser_and_enter_url() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Kart3 =new GreenKartPF3(driver);
		
	}

	@When("Select multiple products and add to the cart")
	public void select_multiple_products_and_add_to_the_cart() throws InterruptedException {
	    
		
		Kart3.prod1();
		Thread.sleep(2000);
		Kart3.prod2();
		Thread.sleep(2000);
		Kart3.prod3();
		Thread.sleep(2000);
		Kart3.prod4();
		Thread.sleep(2000);
		Kart3.prod5();
		Thread.sleep(2000);
		Kart3.prod6();
		Thread.sleep(2000);
		Kart3.prod7();
		Thread.sleep(2000);
	}

	@Then("click on cart logo")
	public void click_on_cart_logo() throws InterruptedException {
	    
		Kart3.Cartlogo();
		Thread.sleep(3000);
	}
	
	@Then("verify selected items are present in cart")
	public void verify_selected_items_are_present_in_cart() {
	    
		
		Kart3.Compare();
	}

	@Then("click cancel for third and sixth item")
	public void click_cancel_for_third_and_sixth_item() throws InterruptedException {
	   
		Kart3.Cancelitem6();
		Thread.sleep(2000);
		Kart3.Cancelitem3();
		Thread.sleep(2000);
	}

	@Then("click on proceed to checkout button")
	public void click_on_proceed_to_checkout_button() throws InterruptedException {
		Kart3.checkout();
		Thread.sleep(3000);
	}

	@Then("click on place oreder button")
	public void click_on_place_oreder_button() {
	    
		Kart3.placeorder();
	}

	@Then("click on select country list and select as India")
	public void click_on_select_country_list_and_select_as_india() throws InterruptedException {
	    
		Kart3.selectlist();
		Thread.sleep(2000);
		//Kart3.selection();
		
	}

	@Then("check mark on Agree to the terms and conditions checkbox")
	public void check_mark_on_agree_to_the_terms_and_conditions_checkbox() throws InterruptedException {

		Kart3.CheckBox();
		Thread.sleep(2000);
	
	}

	@Then("click on proceed to checkout")
	public void click_on_proceed_to_checkout() throws InterruptedException {
	  
		
		Kart3.Proceed();
		
		Thread.sleep(1000);
	}
	
	@And("validate whether user is displayed with Thank you message")
	public void validate_whether_user_is_displayed_with_thank_you_message() {
	   
		Kart3.validate();
		
	}
}
