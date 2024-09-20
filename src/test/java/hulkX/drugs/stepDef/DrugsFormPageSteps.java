package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsFormPageActions;

public class DrugsFormPageSteps {
	
	DrugsFormPageActions DrugsFormPageActionsobj= new DrugsFormPageActions();
	
	@When("^Selects the app feedback/suggestion from the drop down\\.$")
	public void selects_the_app_feedback_suggestion_from_the_drop_down() throws Throwable {
		DrugsFormPageActionsobj.suggestiondd();
	}

	@When("^Fills out the Name,Email address and Message$")
	public void fills_out_the_Name_Email_address_and_Message() throws Throwable {
		DrugsFormPageActionsobj.fillDetails();
	}

	@When("^Selects the checkbox to accept the policy$")
	public void selects_the_checkbox_to_accept_the_policy() throws Throwable {
		DrugsFormPageActionsobj.checkbx();
	}

	@When("^Clicks on the Submit button$")
	public void clicks_on_the_Submit_button() throws Throwable {
		DrugsFormPageActionsobj.submit();
	}
}
