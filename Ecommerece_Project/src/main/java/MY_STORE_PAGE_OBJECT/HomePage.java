/**
 * 
 */
package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Add my first address']") WebElement Add_my_first_adress;
	@FindBy(xpath="//span[text()='Order history and details']") WebElement Order_histry_and_details;
	@FindBy(xpath="//span[text()='My credit slips']") WebElement my_credit_slip;
	@FindBy(xpath="//span[text()='My addresses']") WebElement my_adress;
	@FindBy(xpath="//span[text()='My personal information']")WebElement My_personal_information;

	public  HomePage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	
	public boolean  Validate_my_adress() {
	return ActionDriver.isDisplayed(getDriver(), my_adress);
	
	}
	public String getcurrenturl() {
		
	String Homepageurl=getDriver().getCurrentUrl();
	return  Homepageurl;
}
}