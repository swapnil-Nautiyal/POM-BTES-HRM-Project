package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Add_Page extends TestBase{
	WebDriver driver;
	public Add_Page(WebDriver d)
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

	@FindBy(linkText="Add Employee")
	WebElement Add_Employee;

	@FindBy(css="#rightMenu")
	WebElement iframe;

	@FindBy(css="input[name='txtEmployeeId']")
	WebElement txtEmployeeId_txtbox;

	@FindBy(css="input[name='txtEmpLastName']")
	WebElement Last_name;

	@FindBy(css="input[name='txtEmpFirstName']")
	WebElement First_name;

	@FindBy(css="input[name='txtEmpMiddleName']")
	WebElement Middle_name;

	@FindBy(css="input[name='txtEmpNickName']")
	WebElement EmpNick_name;

	@FindBy(xpath="//input[@id='photofile']")
	WebElement photo_file;
	
	@FindBy(css="input[id='btnEdit']")
	WebElement Save_btn;
	
	@FindBy(css="input[value='Reset']")
	WebElement Reset_btn;
	
	@FindBy(css="input[value='Back']")
	WebElement back_btn;
	
//	@FindBy(css="input[name='Contact Details']")
//	WebElement Contact_details;
	

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

	public void  Pim_dropdwon()
	{
		Actions ac=new Actions (driver);
		ac.moveToElement(Pim_drop).build().perform();
	}

	public void Click_Add_Employee()
	{
		Add_Employee.click();
	}

	public void Switch_to_iframe() {
		driver.switchTo().frame(iframe);
	}

	public void Code_box(String Cod)
	{
		txtEmployeeId_txtbox.clear();
		txtEmployeeId_txtbox.sendKeys(Cod);
	}
	public void Enter_Last_Name(String lastname) {
		Last_name.sendKeys(lastname);
	}

	public void Enter_First_Name(String firstname) {
		First_name.sendKeys(firstname);
	}

	public void Enter_Middle_Name(String Middlename) {
		Middle_name.sendKeys(Middlename);
	}

	public void Enter_EmpNick_Name(String NickName) {
		EmpNick_name.sendKeys(NickName);
	}

	public void photo_file(String photo) {
		photo_file.sendKeys(photo);
		
	}

	public void click_save_btn() {
		Save_btn.click();
	}
	
	public void click_reset_btn() {
		Reset_btn.click();
	}
	

		public void Back_button()
		{
			back_btn.click();
		}
		
//		public void addContact_details(){
//			Contact_details
//		}

	public void login(String uname,String password) {
		username_txtbox.sendKeys(uname);
		password_txtbox.sendKeys(password); 
		login_button.click();
	}



}
