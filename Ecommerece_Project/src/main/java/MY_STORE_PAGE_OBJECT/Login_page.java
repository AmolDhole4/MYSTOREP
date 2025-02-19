package MY_STORE_PAGE_OBJECT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.ActionDriver;
import store.Base.BaseClass;

public class Login_page extends BaseClass {
	
	
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="passwd") WebElement password;
    @FindBy(id="SubmitLogin") WebElement lohin;
    @FindBy(id="email_create") WebElement Search;
    @FindBy(id="SubmitCreate") WebElement CreateAccount;
public Login_page() {
	PageFactory.initElements(getDriver(), this);
}

public HomePage login(String Username,String Password) {
	ActionDriver.type(username, Username);
	ActionDriver.type(password, Password);
	ActionDriver.click(getDriver(), lohin);
	return new HomePage();  
	
}
public Adress_page login1(String Username,String Password) {
	ActionDriver.type(username, Username);
	ActionDriver.type(password, Password);
	ActionDriver.click(getDriver(), lohin);
	return new Adress_page();  
}
public Acount_creation_page create_new_accountMethod(String newEmail) {
	ActionDriver.type(Search, newEmail);
	ActionDriver.click(getDriver(), CreateAccount);
	return new Acount_creation_page();
}

}
