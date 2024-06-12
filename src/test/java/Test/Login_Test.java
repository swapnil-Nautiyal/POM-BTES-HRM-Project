package Test;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.LoginPage;
import TestBase.TestBase;

public class Login_Test extends TestBase {
	LoginPage lp;
	public Login_Test() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		lp=new LoginPage(driver);
	}
	@Test(priority=1)
	public void Login_TestCase_Without_Enteringdata() {
		lp.Click_login_button();
		driver.switchTo().alert().accept();
	}
	@Test(priority=2)
	public void Login_TestCase_inavlid_username_invalid_password() {
		
		lp.Cleardata_usernametextbox();
		lp.Enterdata_usernametextbox(prop.getProperty("user2"));
		lp.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		lp.Click_login_button();
		
		
		
		
	}
	@Test(priority=3)
	public void Login_TestCase_valid_username_invalid_password() {
		lp.Cleardata_usernametextbox();
		lp.Enterdata_usernametextbox(prop.getProperty("user1"));
		lp.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		lp.Click_login_button();
		
		
			
		
	}
	@Test(priority=4)
	public void Login_TestCase_invalid_username_valid_password() {
		lp.Cleardata_usernametextbox();
		lp.Enterdata_usernametextbox(prop.getProperty("user2"));
		lp.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		lp.Click_login_button();
		
		
		
	
	}
	@Test(priority=5)
	public void Login_TestCase_valid_username_valid_password() {
		lp.Cleardata_usernametextbox();
		lp.Enterdata_usernametextbox(prop.getProperty("user1"));
		lp.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		lp.Click_login_button();
	}
	//@AfterSuite
	//public void teardown() {
		//closure();
	//}
}
