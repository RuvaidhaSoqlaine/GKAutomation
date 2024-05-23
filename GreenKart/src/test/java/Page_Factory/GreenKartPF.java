package Page_Factory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenKartPF {

	private WebDriver driver;
	
	
	public GreenKartPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div[10]/div[3]/button")
	private WebElement addCart;
	
	@FindBy(xpath="//header/div[1]/div[3]/a[4]/img[1]")
	private WebElement cart;
	
	@FindBy(xpath="(//h4[@class='product-name'])[10]")
	private WebElement Itemsel;
	
	@FindBy(xpath="//p[@class='product-name']")
	private WebElement selecteditem;
	
	@FindBy(xpath="//p[@class=\"product-price\"]")
	private WebElement iprice;
	
	@FindBy(xpath="//p[@class=\"amount\"]")
	private WebElement cprice;

	public void clickaddcart() {
		addCart.click();
	}
	
	public void cart() {
		cart.click();
	}
	
	public void SelectItem() {
		
		String Item1= Itemsel.getText();
		
		String Item2= selecteditem.getText();
		
		Assert.assertEquals(Item1,Item2);
		
		System.out.println("The item to be select: "+Item1);
		
		System.out.println("The selected item is: "+Item2);


	}
	
	
	public void  Price() {
		
        String price1= iprice.getText();
		
		String price2= cprice.getText();
		
		Assert.assertEquals(price1,price2);
		
		System.out.println("The price of an item to be select: "+price1);
		
		System.out.println("The price of the selected item is: "+price2);
		
	}
}
	
