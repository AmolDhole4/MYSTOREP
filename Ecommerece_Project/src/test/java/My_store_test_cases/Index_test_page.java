package My_store_test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import MY_STORE_PAGE_OBJECT.INDES_PAGE;
import store.Base.BaseClass;

public class Index_test_page extends  BaseClass{
	INDES_PAGE ip;
	
	 @Parameters("browser")
	@BeforeMethod()
	public void setUp(String browser) {
		launchApp(browser);
	}
	@AfterMethod
	public void Teardown() {
		getDriver().quit();
	}
	
	
	@Test(groups="smoke")
	public void VerifyLogo() {
		 ip=new INDES_PAGE();
	boolean result= ip.validateLogo();
	
	Assert.assertTrue(result);
	}

	@Test(groups="smoke")
	public void verifyTitle() {
	String resultTitle=	ip.getMytitle();
	Assert.assertEquals(resultTitle,"My Shop");
	}

}
