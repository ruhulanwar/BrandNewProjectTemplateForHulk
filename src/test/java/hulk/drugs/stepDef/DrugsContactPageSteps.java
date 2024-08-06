package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsContactPageActions;

public class DrugsContactPageSteps {

	DrugsContactPageActions DrugsContactPageActionsobj= new DrugsContactPageActions();
	
	@When("^Clicks on the contact form$")
	public void clicks_on_the_contact_form() throws Throwable {
		DrugsContactPageActionsobj.ClickContactForm();
	   
	}
	
}
