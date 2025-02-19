package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class INDES_PAGE extends BaseClass {
	
	@FindBy(xpath="//a[@class=\"login\"]") WebElement signBtn;
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")WebElement logo;
	@FindBy(id="search_query_top") WebElement search_product_box;
@FindBy(name="submit_search") WebElement search_Buton;
	
public 	INDES_PAGE() {
	
PageFactory.initElements(getDriver(),this);

}
public Login_page click_On_Login() {

	ActionDriver.click(getDriver(), signBtn);
	return new Login_page();
	
}
public boolean validateLogo() {
	return ActionDriver.isDisplayed(getDriver(), logo);
	
}
public String   getMytitle(){
	String my_Stoyre_Title1=getDriver().getTitle();
	return my_Stoyre_Title1;
}
public SearchResultPage searchproduct(String productName) {
	ActionDriver.type(search_product_box, productName);
	ActionDriver.click(getDriver(),search_Buton);
	return new SearchResultPage();
}
}