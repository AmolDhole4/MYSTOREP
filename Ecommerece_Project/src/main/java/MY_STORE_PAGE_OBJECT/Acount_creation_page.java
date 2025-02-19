package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Acount_creation_page extends BaseClass {
	
	
	
	@FindBy(xpath="//h1[text()='Create an account']") WebElement CreateAccount;
	
	////button[@id="SubmitCreate"]/child::span
	public  Acount_creation_page() {
		PageFactory.initElements(getDriver(),this);
	}

	public boolean valdiate_create_Account() {
	return 	ActionDriver.isDisplayed(getDriver(), CreateAccount);
	}
	
}
