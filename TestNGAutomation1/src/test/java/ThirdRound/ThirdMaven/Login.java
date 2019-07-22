package ThirdRound.ThirdMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Login extends baseclass{
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		
		
	}
	

  @Test
  public void login() { 
	  
	  LoginPojo loginpojo = new LoginPojo();
	  loginpojo.enterUserName("Malar");
	  loginpojo.enterPwd("malar@123");
	  loginpojo.loginclick();
	  
	  
  }
 
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	//typevalue(username,"Malar");
			takeScreenshot(driver,"loginpage");
  }

  @BeforeClass
  public void beforeClass() {
	  WebDriver driver = getDriver("https://www.facebook.com/");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
