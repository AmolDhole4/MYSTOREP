package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class PaymentPage extends BaseClass {
@FindBy(xpath="//a[@class=\"bankwire\"]") WebElement Paybybankwire ;
@FindBy(xpath="//a[@class=\"cheque\"]") WebElement  payBycheckwise;

public PaymentPage() {
	PageFactory.initElements(getDriver(), this);
	
}

public Order_summery bankwise() {
	ActionDriver.click(getDriver(), Paybybankwire);
	return new Order_summery();
}



}  
