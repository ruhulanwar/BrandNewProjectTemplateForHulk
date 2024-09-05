package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsResultPageActions;

public class DrugsResultPageSteps {
	DrugsResultPageActions DrugsResultPageActionsobj= new DrugsResultPageActions();
	
	@Then("^the drug information is provided\\.$")
	public void the_drug_information_is_provided() throws Throwable {
		DrugsResultPageActionsobj.verifydruginfo();
	   
	}
	
	@Then("^user should get all information realted to abdominal pain$")
	public void user_should_get_all_information_realted_to_abdominal_pain() throws Throwable {
	  DrugsResultPageActionsobj.verifyAbdominalPain();
	}

	@Then("^user should get all new drugs related information$")
	public void user_should_get_all_new_drugs_related_information() throws Throwable {
	    DrugsResultPageActionsobj.verifyNewDrugsInfo();
	}
}
