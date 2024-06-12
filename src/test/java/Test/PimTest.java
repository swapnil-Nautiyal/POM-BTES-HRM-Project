package Test;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.PimPage;
import TestBase.TestBase;

public class PimTest extends TestBase {
	PimPage Plp;
	public PimTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		Plp=new PimPage(driver);
	}
	@Test(priority=1)
	public void Login_TestCase_Without_Enteringdata() {
		Plp.Click_login_button();
		driver.switchTo().alert().accept();
	}
	@Test(priority=2)
	public void Login_TestCase_valid_username_valid_password() {
		Plp.Enterdata_usernametextbox(prop.getProperty("user1"));
		Plp.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		Plp.Click_login_button();
	}
	@Test(priority=3)
	public void Perform_Pim() 
	{
		Plp.Pim_dropdwon();
		Plp.Employee_List_link();

	}
	@Test(priority=4)
	public void Switch_to_iframe_Acess_Search_By() 
	{


		Plp.Switch_to_iframe();
		Plp.Acess_Search_By();
	}	

	@Test(priority=5)
	public void enterId_search_text_box() 
	{
		Plp.click_in_the_searchfor(prop.getProperty("Searchfor"));
		Plp.search_box_onclick();
		Plp.search_button_click_Reset();
	}

	@Test(priority=6)
	public void enterd_checkbox() 
	{
		Plp.Chechk_Box();
		//		Plp.Add_to_Page_perform();
		Plp.Delete_perform();

	}	



	//	@AfterSuite
	//	public void teardown() {
	//	closure();
	//	}

}
