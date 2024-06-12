package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.Add_Page;
import TestBase.TestBase;

public class Add_Test extends TestBase {
	Add_Page Add;
	public Add_Test() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		Add=new Add_Page(driver);
	}
	@Test(priority=1)
	public void Login_TestCase_Without_Enteringdata() {
		Add.Click_login_button();
		driver.switchTo().alert().accept();
	}
	@Test(priority=2)
	public void Login_TestCase_valid_username_valid_password() {
		Add.Enterdata_usernametextbox(prop.getProperty("user1"));
		Add.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		Add.Click_login_button();
	}
	
	@Test(priority=3)
	public void Perform_Pim() 
	{
		Add.Pim_dropdwon();
		Add.Click_Add_Employee();

	}
	
	@Test(priority=4)
	public void Add_Emp() 
	{
		Add.Switch_to_iframe();
		Add.Code_box("0153");
		Add.Code_box(prop.getProperty("TextId"));
		Add.Enter_Last_Name(prop.getProperty("LastName"));
		Add.Enter_First_Name(prop.getProperty("FirstName"));
		Add.Enter_Middle_Name(prop.getProperty("MiddleName"));
		Add.Enter_EmpNick_Name(prop.getProperty("NickName"));
		Add.photo_file(prop.getProperty("photofile"));
	}
	
	@Test (priority=5)
	public void SaveButton() {
		Add.click_save_btn();
		Add.click_reset_btn();
		Add.Back_button();
	}
//	
//	@Test (priority=6)
//	public void Contactdetails() {
//		Add.add_Contact_details();
//	}
	
//	@AfterSuite
//	public void teardown() {
//	closure();
//	}
//

}
