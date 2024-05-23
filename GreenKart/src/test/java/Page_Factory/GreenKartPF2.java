package Page_Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class GreenKartPF2 {
	private WebDriver driver;

	public GreenKartPF2(WebDriver driver) {
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
	
	
	@FindBys(@FindBy(css="p.product-name"))
	private List<WebElement> cItems;
	
	
	
	@FindBy(xpath="(//a[@class='product-remove'])[3]")
	private WebElement cancel;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement Cart;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	private WebElement CheckOut;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	private WebElement Apply;
	
	@FindBy(css="input.promocode")
	private WebElement EnterPromo;
	
	
	@FindBy(css="span.promoInfo")
	private WebElement AfterEnter;
	
	
	
	
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
	
	public void Cartlogo() {
		Cart.click();
	}
	
	
	
	public void Compare() {
		
		String[] itemNeeded={"Brocolli - 1 Kg","Cucumber - 1 Kg","Beetroot - 1 Kg","Carrot - 1 Kg"};		

		List itemNeededList=Arrays.asList(itemNeeded);
		System.out.println("The Items to be select: "+itemNeededList);
		
		
		String[] uff= new String[4] ;
		
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
	

			
	
	public  void Cancelitem() {
		cancel.click();
	}
	
	public void checkout() {
		CheckOut.click();
	}
	
	public void Applybtn() {
		Apply.click();
	}
	
	public void EnterCode() {
		
        String code="rahulshettyacade";

		EnterPromo.sendKeys(code);
	}
	
	public void Valid() throws InterruptedException {
		
        String code="rahulshettyacade";


		
		if(code=="rahulshettyacademy") {

			System.out.println("The given promo code is valid");
		}
		else if(code!="rahulshettyacademy") {
			System.out.println("The given promo code is invalid");
		}
		Apply.click();
		Thread.sleep(5000);
		System.out.println(AfterEnter.getText());

	}
	
}
