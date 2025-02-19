/**
 * 
 */
package My_store_test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MY_STORE_PAGE_OBJECT.Add_to_cart_PAge;
import MY_STORE_PAGE_OBJECT.HomePage;
import MY_STORE_PAGE_OBJECT.INDES_PAGE;
import MY_STORE_PAGE_OBJECT.Login_page;
import MY_STORE_PAGE_OBJECT.SearchResultPage;
import store.Base.BaseClass;

/**
 * 
 */
public class AddTocartTest extends BaseClass {
	
	INDES_PAGE ip;
	Login_page lp;
	HomePage hp;
	SearchResultPage sr;
	Add_to_cart_PAge ap;
	 @Parameters("browser")
	@BeforeMethod(groups= {"smoke","sanity","regression"})
	public void setUp(String browser) {
		launchApp(browser);
	}
	@AfterMethod
	public void Teardown() {
		getDriver().quit();
	}
	@Test(groups="sanity")
public void addToCartPage() {
		
		 ip=new INDES_PAGE();
	sr=	 ip.searchproduct("tshirts");
ap=	sr.clickOnProduct();
ap.SeelctWhite();
ap.SelectQuantity("1");

ap.ADDTOcart();
boolean result=ap.Validateaddtocart();
Assert.assertTrue(result);
}
}
