package Page_Factory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GreenKartPF4 {

	
	private WebDriver driver;

	public GreenKartPF4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Flight Booking']")
	private WebElement flight;
	
	@FindBy(xpath="//input[@id='autosuggest']")
	private WebElement autosug;
	
	@FindBy(xpath="//a[text()='India']")
	private WebElement SelIndia;
	
	@FindBy(xpath="(//span[text()='Flights'])[1]")
	private WebElement flighttitle;
	
	
	@FindBy(xpath="(//input[@value='RoundTrip'])[1]")
	private WebElement round;
	
	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXTaction")
	private WebElement depart;
	
	@FindBy(xpath="//a[@value='BLR']")
	private WebElement city;
	
	@FindBy(xpath="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")
	private WebElement arrive;
	
	@FindBy(css=".ui-state-default.ui-state-highlight")
	private WebElement date;
	
	@FindBy(id="ctl00_mainContent_view_date2")
	private WebElement returndate;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[6]")
	private WebElement ardate;
	
	@FindBy(id="divpaxinfo")
	private WebElement pass;
	
	@FindBy(id="hrefIncAdt")
	private WebElement adult;
	
	@FindBy(id="hrefIncChd")
	private WebElement child;
	
	@FindBy(id="hrefIncInf")
	private WebElement infant;
	
	@FindBy(id="btnclosepaxoption")
	private WebElement done;
	
	@FindBy(id="ctl00_mainContent_DropDownListCurrency")
	private WebElement currency;
	
	@FindBy(css="input[id*='friendsandfamily']")
	private WebElement check;
	
	@FindBy(id="ctl00_mainContent_btn_FindFlights")
	private WebElement search;
	
	public void flightlink() {
		flight.click();
		
	}
	
	public void autosuggest() {
		autosug.sendKeys("India");

		
	}
	
	public void IndiaSelect(){
		SelIndia.click();
	}
	
	public void FlightTle() {
		flighttitle.click();
	}
	
	public void Round() {
		round.click();
	}
	
	public void departure() {
		depart.click();
	}
	
	public void CitySel() {
		city.click();
	}
	
	public void Arrival() {
		arrive.click();
	}
	
	public void ddate() {
		date.click();
	}
	
	public void rdate() {
		returndate.click();
	}
	
	public void arrdate() {
		ardate.click();
	}
	

	public void passenger() {
		pass.click();
		
	}
	
	public void Adult() {
		
		for(int i=1;i<2;i++) {
			adult.click();
		}
	}
	
	public void Child() {
		child.click();
		
	}
	
	public void Infant() {
		infant.click();
		
	}
	
	public void Done() {
		done.click();
		
	}
	
	public void Currency() {
		
		Select dropdown= new Select(currency);
		dropdown.selectByValue("INR");
		
	}
	
	public void CheckBox() {
		check.click();
		
	}
	
	public void Searchbtn() {
		search.click();
		
	}
	
	public void validate() {
		
		String pop=driver.switchTo().alert().getText();
		
		String popup="Family and Friends discount is applicable for a minimum of 4 passenger (excluding infant) on a single booking. Terms and conditions apply.";

		Assert.assertEquals(pop,popup);
				
		System.out.println("The popup message is: "+pop);

	}
	
}
