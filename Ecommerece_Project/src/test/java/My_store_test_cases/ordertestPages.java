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
import MY_STORE_PAGE_OBJECT.Order_PAge;
import MY_STORE_PAGE_OBJECT.SearchResultPage;
import store.Base.BaseClass;

/**
 * 
 */
public class ordertestPages extends BaseClass {
	INDES_PAGE ip;
	Login_page lp;
	HomePage hp;
	SearchResultPage sr;
	Add_to_cart_PAge ap;
	Order_PAge op;
	
	
	
	 @Parameters("browser")
	@BeforeMethod(groups= {"smoke","sanity","regression"})
	public void setUp(String browser) {
		launchApp(browser);
	}
	@AfterMethod
	public void Teardown() {
		getDriver().quit();
	}
	@Test(groups="regression")
	
		public void verifyTotalPrise() {
		 ip=new INDES_PAGE();
			sr=	 ip.searchproduct("tshirts");
		ap=	sr.clickOnProduct();
		ap.SeelctWhite();
		ap.SelectQuantity("1");

		ap.ADDTOcart();
		op=	ap.proceedToadtocart();
//Double result=op.getUnitzprise();
	
	//	Double result1=op.getTotalzprise();
		
//	Double TotalexpectedPrise=(result*2)+2;
	//	Assert.assertEquals(result1, TotalexpectedPrise);
		}
	}

