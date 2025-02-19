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

public class SearchResultPage extends BaseClass {
	
	
	@FindBy(xpath="(//img[@class=\"replace-2x img-responsive\"])[1]") WebElement SearchResultPage ;

	
	

	public  SearchResultPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	public boolean validateSearchResultPage() {
		return ActionDriver.isDisplayed(getDriver(), SearchResultPage);
	}
	
	public Add_to_cart_PAge clickOnProduct() {
		ActionDriver.click(getDriver(), SearchResultPage);
		return new Add_to_cart_PAge();
		
	}
}
