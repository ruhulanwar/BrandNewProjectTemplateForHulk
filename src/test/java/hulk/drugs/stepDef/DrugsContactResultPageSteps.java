package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsContactResultPageActions;

public class DrugsContactResultPageSteps {
	
	DrugsContactResultPageActions DrugsContactResultPageActionsobj= new DrugsContactResultPageActions();
	
	@Then("^Validates the Message Sent on the Page$")
	public void validates_the_Message_Sent_on_the_Page() throws Throwable {
	 
	   DrugsContactResultPageActionsobj.validateMsg();
	}
}
