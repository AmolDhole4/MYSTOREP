package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Adress_page extends BaseClass {

	
	
	@FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]/child::span") WebElement PCOUT;
	public  Adress_page() {
		PageFactory.initElements(getDriver(),this);
	}
	
public Shipning_PAge ProcedTocheckOut() {
	
	ActionDriver.click(getDriver(), PCOUT);
	return new Shipning_PAge();
}
}
