package My_store_test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MY_STORE_PAGE_OBJECT.HomePage;
import MY_STORE_PAGE_OBJECT.INDES_PAGE;
import MY_STORE_PAGE_OBJECT.Login_page;
import store.Base.BaseClass;

public class HomePagetest extends BaseClass {

	
	
		INDES_PAGE ip;
		Login_page lp;
		HomePage hp;
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
		public void Validate_my_adress() {
		 ip=new INDES_PAGE();
		 
		
	}
}
