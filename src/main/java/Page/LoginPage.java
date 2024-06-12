package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;
	public LoginPage(WebDriver d)
	{ 	
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='txtUserName']")
	WebElement username_txtbox;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password_txtbox;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement login_button;
	
	@FindBy(xpath="//input[@name='Clear']")
	WebElement clear_button;
	
	
	
	public void Enterdata_usernametextbox(String uname)
	{
		username_txtbox.sendKeys(uname);
	}
	public void Cleardata_usernametextbox()
	{
		username_txtbox.clear();
	}
	
	public void Enterdata_passwordtextbox(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	
	
	
	public boolean Check_username_textbox()
	{
		return username_txtbox.isDisplayed();
		
	}
	
	
	
	public void Click_login_button()
	{
		login_button.click();
	}
	public void Click_clear_button()
	{
		clear_button.click();
	}
	public void login(String uname,String password) {
		username_txtbox.sendKeys(uname);
		password_txtbox.sendKeys(password);
		login_button.click();
	}
}
