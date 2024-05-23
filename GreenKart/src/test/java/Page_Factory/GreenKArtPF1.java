package Page_Factory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenKArtPF1 {

	
private WebDriver driver;
	
	
	public GreenKArtPF1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
	
	
	@FindBy(xpath="//a[@class=\"increment\"]")
	private WebElement plus;
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement cartbtn;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement Cart;
	
	@FindBy(xpath="//h4[@class='product-name']")
	private WebElement Item;
	
	@FindBy(xpath="//p[@class='product-name']")
	private WebElement Cartitem;
	
	@FindBy(xpath="//p[@class=\"quantity\"]")
	private WebElement quantity;
	
	@FindBy(xpath="//p[@class=\"product-price\"]")
	private WebElement price;
	
	@FindBy(xpath="//p[@class=\"amount\"]")
	private WebElement cprice;
	
	public void clicksearch() throws InterruptedException {
		search.sendKeys("Cucumber");
		Thread.sleep(3000);
	}
	
	public void clickplus() {
		
		plus.click();
	
	
	}
	
	public void Cartbutton() {
		cartbtn.click();
	}
	
	public void CartLogo() {
		Cart.click();
		
	}
	
	
	
	public void Item() {
		
//        String Item1= Item.getText();
//		
//		String Item2= Cartitem.getText();
		
		Assert.assertEquals(Item.getText(),Cartitem.getText());
		
		System.out.println("The item to be select: "+Item.getText());
		
		System.out.println("The selected item is: "+Cartitem.getText());
	
		
	
	}
	
	
	public void Price() {
		String Quantity=quantity.getText();
		System.out.println(Quantity);
		
		char itemno = Quantity.charAt(0);

		int q=Integer.parseInt(String.valueOf(itemno));
		
		String Price=price.getText();
		int p=Integer.parseInt(Price);
		
		int actualprice = q*p;
		System.out.println("Expected price: "+actualprice);
		
		String Cprice = cprice.getText();
		int cartprice=Integer.parseInt(Cprice);
		System.out.println("Actual Price :" +cartprice);
		Assert.assertEquals(actualprice,cartprice);
	}
	
}
