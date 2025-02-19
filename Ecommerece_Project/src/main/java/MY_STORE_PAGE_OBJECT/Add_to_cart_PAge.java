package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Add_to_cart_PAge extends BaseClass {
	
	
	@FindBy(id="quantity_wanted") WebElement quantity;
	@FindBy(id="color_8") WebElement White_colur;
	@FindBy(xpath="//button[@class=\"exclusive\"]") WebElement AddCart;
@FindBy(xpath="//div[@class=\"layer_cart_product col-xs-12 col-md-6\"]/child::h2") WebElement advali;
@FindBy(xpath="//a[@class=\"btn btn-default button button-medium\"]/child::span") WebElement PCheckout;
	public  Add_to_cart_PAge() {
		PageFactory.initElements(getDriver(),this);
	}
	
		public void SelectQuantity(String q1) {
			ActionDriver.type(quantity, q1);
		}
	public void SeelctWhite() {
		ActionDriver.fluentWait(getDriver(), White_colur, 30);
		ActionDriver.click(getDriver(), White_colur);
	}
	public void ADDTOcart() {
		
		 ActionDriver.click(getDriver(), AddCart);
	}
	public boolean Validateaddtocart() {
		ActionDriver.fluentWait(getDriver(), advali, 30);
		return ActionDriver.isDisplayed(getDriver(), advali);

	}
	public Order_PAge proceedToadtocart() {
		ActionDriver.fluentWait(getDriver(), PCheckout, 30);
		ActionDriver.JSClick(getDriver(), PCheckout);
		return new Order_PAge();
	}
}
