package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Order_summery extends BaseClass {

	
	@FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]") WebElement conforder;
	
	
	public Order_summery() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public Order_CONformation orderSummery() {
		ActionDriver.click(getDriver(), conforder);
		return new Order_CONformation();
	}

}
