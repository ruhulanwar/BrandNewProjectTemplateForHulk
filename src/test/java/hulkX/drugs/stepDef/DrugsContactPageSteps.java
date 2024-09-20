package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsContactPageActions;

public class DrugsContactPageSteps {

	DrugsContactPageActions DrugsContactPageActionsobj= new DrugsContactPageActions();
	
	@When("^Clicks on the Contact form button$")
	public void clicks_on_the_Contact_form_button() throws Throwable {
		DrugsContactPageActionsobj.ClickContactForm();
	}
		
		
	}
		
	   
	
	
