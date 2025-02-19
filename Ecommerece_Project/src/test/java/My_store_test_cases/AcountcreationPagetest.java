package My_store_test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MY_STORE_PAGE_OBJECT.Acount_creation_page;
import MY_STORE_PAGE_OBJECT.HomePage;
import MY_STORE_PAGE_OBJECT.INDES_PAGE;
import MY_STORE_PAGE_OBJECT.Login_page;
import store.Base.BaseClass;

public class AcountcreationPagetest extends BaseClass {
	INDES_PAGE ip;
	Login_page lp;
	HomePage hp;
	Acount_creation_page accountcreationpage;
	 @Parameters("browser")  
	@BeforeMethod(groups= {"smoke","sanity","regression"})
	public void setUp(String browser) {
		launchApp(browser);
	}
	@AfterMethod(groups= {"smoke","sanity","regression"})
	public void Teardown() {
		getDriver().quit();
	}
	
	@Test(groups="smoke")
	public void verifyCreateAcontPage() {
		 ip=new INDES_PAGE();
		 lp= ip.click_On_Login() ;
		 accountcreationpage = lp.create_new_accountMethod("amoldhole3367@gmail.com");
		
	boolean result=	 accountcreationpage.valdiate_create_Account();
	Assert.assertTrue(result);
		
	}
}
