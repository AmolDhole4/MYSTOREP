package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Shipning_PAge extends BaseClass {

	@FindBy(id="cgv") WebElement chek;
	@FindBy(xpath="//button[@class=\"button btn btn-default standard-checkout button-medium\"]/child::span") WebElement prcot;

	public  Shipning_PAge() {
		PageFactory.initElements(getDriver(),this);
	}
	
	public void clickoncheckout() {
		ActionDriver.click(getDriver(), chek);
		
	}
	public PaymentPage procedtochekout() {
		ActionDriver.click(getDriver(), prcot);
		return new PaymentPage();
	}
	
}
