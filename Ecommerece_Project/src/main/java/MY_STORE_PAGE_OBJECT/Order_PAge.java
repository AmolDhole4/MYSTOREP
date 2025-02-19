package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Order_PAge extends BaseClass{

	
	@FindBy(xpath="//ul[@id=\"product_price_2_8_0\"]") WebElement unitPrise;
	@FindBy(xpath="(//span[text()='$61'])[2]") WebElement TotalPrise;
	@FindBy(xpath="//a[@class=\"button btn btn-default standard-checkout button-medium\"]/child::span") WebElement procedTocheckOut;
	
	
	
	public Order_PAge() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public Double getUnitzprise() {
	String unitprise1=	unitPrise.getText();
String 	unit=unitprise1.replaceAll("[a-z,A-Z,0-9,$]","");
Double FinalUnitPrise=Double.parseDouble(unit);
return FinalUnitPrise/100;
	}
	public Double getTotalzprise() {
		String totalprise1=	TotalPrise.getText();
	String 	Total=totalprise1.replaceAll("[a-z,A-Z,0-9,$]","");
	Double FinalTotalPrise=Double.parseDouble(Total);
	return FinalTotalPrise/100;
	}
	public Login_page  prcoedtocheckout() {
		ActionDriver.click(getDriver(), procedTocheckOut);
		return new Login_page();
	}
	}
