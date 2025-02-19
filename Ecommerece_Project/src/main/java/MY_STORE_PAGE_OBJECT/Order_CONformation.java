package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Order_CONformation extends BaseClass {

	
	@FindBy(xpath="//p[@class=\"alert alert-success\"]") WebElement orderconfm;
	

	public Order_CONformation() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public String  orsderConfirm(){
	String ConfirmMassge=	orderconfm.getText();
		return ConfirmMassge;
	}
	
}
