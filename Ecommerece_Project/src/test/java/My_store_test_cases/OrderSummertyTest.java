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
import MY_STORE_PAGE_OBJECT.Adress_page;
import MY_STORE_PAGE_OBJECT.HomePage;
import MY_STORE_PAGE_OBJECT.INDES_PAGE;
import MY_STORE_PAGE_OBJECT.Login_page;
import MY_STORE_PAGE_OBJECT.Order_CONformation;
import MY_STORE_PAGE_OBJECT.Order_PAge;
import MY_STORE_PAGE_OBJECT.Order_summery;
import MY_STORE_PAGE_OBJECT.PaymentPage;
import MY_STORE_PAGE_OBJECT.SearchResultPage;
import MY_STORE_PAGE_OBJECT.Shipning_PAge;
import store.Base.BaseClass;

/**
 * 
 */
public class OrderSummertyTest extends BaseClass{

	
	INDES_PAGE ip;
	Login_page lp;
	HomePage hp;
	SearchResultPage sr;
	Add_to_cart_PAge ap;
	Order_PAge op;
	Order_summery os;
	Adress_page apa;
	Shipning_PAge sp;
	PaymentPage pp;
	Order_CONformation oc;
	
	
	
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
	public void verifyOrder() {
		 ip=new INDES_PAGE();
			sr=	 ip.searchproduct("tshirts");
		ap=	sr.clickOnProduct();
		ap.SeelctWhite();
		ap.SelectQuantity("1");

		ap.ADDTOcart();
		op=	ap.proceedToadtocart();
		lp=	op.prcoedtocheckout();
		apa=	lp. login1(prop.getProperty("username"), prop.getProperty("password"));
	 	  
		sp=apa.ProcedTocheckOut();
		sp.clickoncheckout();
		pp=sp.procedtochekout();
		
		os=pp.bankwise();
		oc=os.orderSummery();
	String	ActualMassage=oc.orsderConfirm();
	String ExpectedMassage="Your order on My Shop is complete.";
	Assert.assertEquals(ActualMassage, ExpectedMassage);
	

	}
}
