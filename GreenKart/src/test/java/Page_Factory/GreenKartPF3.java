package Page_Factory;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GreenKartPF3 {

	
	private WebDriver driver;

	public GreenKartPF3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]")
	private WebElement product1;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[2]")
	private WebElement product2;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[3]")
	private WebElement product3;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[4]")
	private WebElement product4;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[5]")
	private WebElement product5;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[7]")
	private WebElement product6;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[8]")
	private WebElement product7;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement Cart;
	
	
	@FindBy(xpath="(//p[@class=\"product-name\"])[6]")
	private WebElement item6;
	
	@FindBy(xpath="(//a[@class='product-remove'])[3]")
	private WebElement cancel3;
	
	@FindBy(xpath="(//a[@class='product-remove'])[6]")
	private WebElement cancel6;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	private WebElement CheckOut;
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement Order;
	
	@FindBy(xpath="//div/select")
	private WebElement select;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement check;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//div[@class='wrapperTwo']")
	private WebElement Message;
	
	@FindBys(@FindBy(css="p.product-name"))
	private List<WebElement> cItems;
	
	public void prod1() {
		product1.click();
	}
	
	public void prod2() {
		product2.click();
	}
	
	public void prod3() {
		product3.click();
	}
	
	public void prod4() {
		product4.click();
	}
	

	public void prod5() {
		product5.click();
	}
	

	public void prod6() {
		product6.click();
	}
	

	public void prod7() {
		product7.click();
	}
	
	public void Cartlogo() {
		Cart.click();
		
	}
	
	
	public void Compare() {
		
		String[] itemNeeded={"Brocolli - 1 Kg","Cucumber - 1 Kg","Beetroot - 1 Kg","Carrot - 1 Kg","Tomato - 1 Kg"};		

		List itemNeededList=Arrays.asList(itemNeeded);
		System.out.println("The Items to be select: "+itemNeededList);
		
		System.out.println("The sixth element is: "+item6.getText());
		
		String[] uff= new String[5] ;
		
		int x=0;
		for(int i=0;i<uff.length;i++) {
			
			String cartItems=cItems.get(i).getText();			
			uff[x] = cartItems;
			x++;
			
		}
		List actuallist=Arrays.asList(uff);
		
        System.out.println(actuallist);
  
	
	
	
	
		
	Assert.assertEquals(itemNeededList,actuallist);
	}
	
	public  void Cancelitem3() {
		cancel3.click();
	}
	
	public  void Cancelitem6() {
		cancel6.click();
	}
	
	public void checkout() {
		CheckOut.click();
	}
	
	public void placeorder() {
		Order.click();
	}
	
	public void selectlist() {
		//select.click();
		Select dd=new Select(select);
		dd.selectByValue("India");
	}
	
	public void CheckBox() {
		check.click();
	}
	
	public void Proceed() {
		proceed.click();
	}
	
	public void validate() {
				
//		String mes=Message.getText();
//		
//		String message="Thank you, your order has been placed successfully"
//				+ "You'll be redirected to Home page shortly!!";
//		Assert.assertEquals(mes,message);
//				
//		System.out.println("The popup message is: "+mes);
		
		System.out.println("The popup message is: "+Message.getText());

	}
	
	
}
