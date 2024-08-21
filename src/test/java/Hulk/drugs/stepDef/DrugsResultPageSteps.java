package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsResultPageActions;

public class DrugsResultPageSteps {
	DrugsResultPageActions DrugsResultPageActionsobj= new DrugsResultPageActions();
	
	@Then("^the drug information is provided\\.$")
	public void the_drug_information_is_provided() throws Throwable {
		DrugsResultPageActionsobj.verifydruginfo();
	   
	}
	

}
