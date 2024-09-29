package stepDefinations;

import GenericUtils.ReuseableMethods;
import POMClasses.AdminPageOrangeHRM;
import POMClasses.LoginPageOrangeHRM;
import ProjectManagers.TextContextObject;
import io.cucumber.java.en.*;

public class AddNewAdminUser {

	TextContextObject textcontextobject;
	LoginPageOrangeHRM loginpage;
	ReuseableMethods reuseable;
	AdminPageOrangeHRM adminpage;
	
	public AddNewAdminUser(TextContextObject textcontextobject) 
	{
		this.textcontextobject = textcontextobject;
	}
	
	
	
	@When("Move to {string} and Create A new admin with {string}, {string}, {string}, {string}")
	public void move_to_admin_panel_and_create_a_new_admin(String panelName,String role, String epname, String username, String password) throws Exception 
	{

		loginpage = textcontextobject.objmanager.getObjectLoginPageOrangeHRM();
		loginpage.Search_Panel_From_ListOfPanel(panelName);
		adminpage = textcontextobject.objmanager.getObjectAdminPageOrangeHRM();
		adminpage.click_AddButton();
		adminpage.select_UserRole(role);
		adminpage.select_AdminStatus();
		adminpage.select_EmployeeName(epname);
		adminpage.fill_UserName_Password(username, password);
		adminpage.save_NewAdmin();

	}

	@When("Logout from Current User")
	public void logout_from_current_user() {


		
	}

	@Then("Login through new user details {string} and {string}")
	public void login_through_new_user_details(String username, String password) {


	}

	
}
