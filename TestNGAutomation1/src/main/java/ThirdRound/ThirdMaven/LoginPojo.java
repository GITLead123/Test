package ThirdRound.ThirdMaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPojo {

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement login;
	
	public LoginPojo() {
		PageFactory.initElements(baseclass.driver, this);
	}

	public void enterUserName(String username1) {
		username.sendKeys(username1);
	}
	
	public void enterPwd(String pwd1) {
		pwd.sendKeys(pwd1);
	}
	
	public void loginclick()
	{
		login.click();
	}
	
}
