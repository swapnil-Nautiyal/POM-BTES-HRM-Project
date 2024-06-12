package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class PimPage extends TestBase{
	WebDriver driver;
	public PimPage(WebDriver d)
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

	@FindBy(linkText="PIM")
	WebElement Pim_drop;

	@FindBy(linkText="Employee List")
	WebElement Employee_List;

	@FindBy(css="iframe[name=rightMenu]")
	WebElement iframe;

	@FindBy(id="loc_code")
	WebElement Selectdropdown;

	@FindBy(id="loc_name")
	WebElement Search_for;

	@FindBy(css="input[value=Search]")
	WebElement Search_button;

	@FindBy(css="input[value=Reset]")
	WebElement Reset_button;

	@FindBy(xpath="//input[@name='chkLocID[]']")
	WebElement Check_Cleck_box;

	//	@FindBy(css="input[value=Add]")
	//	WebElement Add_button;

	@FindBy(css="input[value=Delete]")
	WebElement Delete_button;

	public void Enterdata_usernametextbox(String uname)
	{
		username_txtbox.sendKeys(uname);
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
	public void  Pim_dropdwon()
	{
		Actions ac=new Actions (driver);
		ac.moveToElement(Pim_drop).build().perform();
	}
	public void Employee_List_link() 
	{
		Employee_List.click();
	}

	public void Switch_to_iframe() 
	{
		driver.switchTo().frame(iframe);

	}

	public void  Acess_Search_By() 
	{
		Select ac=new Select (Selectdropdown);
		ac.selectByVisibleText("Emp. ID");

	} 
	public void click_in_the_searchfor(String Id) 
	{
		Search_for.sendKeys(Id);
	}

	public void search_box_onclick() {
		Search_button.click();
	}

	public void search_button_click_Reset() {
		Reset_button.click();
	}
	//	public void Add_to_Page_perform() {
	//		Add_button.click();
	//
	//	}

	public void Chechk_Box() {
		Check_Cleck_box.click();
	}

	public void Delete_perform() {
		Delete_button.click();

	}








	public void login(String uname,String password) {
		username_txtbox.sendKeys(uname);
		password_txtbox.sendKeys(password);
		login_button.click();

	}

}
