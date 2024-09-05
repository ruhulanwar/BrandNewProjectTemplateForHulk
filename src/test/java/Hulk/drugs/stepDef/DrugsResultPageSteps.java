package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsResultPageActions;

public class DrugsResultPageSteps {
	DrugsResultPageActions DrugsResultPageActionsobj= new DrugsResultPageActions();
	
	@Then("^the drug information is provided\\.$")
	public void the_drug_information_is_provided() throws Throwable {
		DrugsResultPageActionsobj.verifydruginfo();
	}
	
	@Then("^User should get all drugs starting with Ab as a result$")
	public void user_should_get_all_drugs_starting_with_Ab_as_a_result() throws Throwable {
	    DrugsResultPageActionsobj.verifyDrugsAb();
	}
	
	@Then("^User should get all Tylenol related information as a result$")
	public void user_should_get_all_Tylenol_related_information_as_a_result() throws Throwable {
	    DrugsResultPageActionsobj.verifyDrugTylenol();
	}
	
	@Then("^user should get all information realted to abdominal pain$")
	public void user_should_get_all_information_realted_to_abdominal_pain() throws Throwable {
	  DrugsResultPageActionsobj.verifyAbdominalPain();
	}

	@Then("^user should get all new drugs related information$")
	public void user_should_get_all_new_drugs_related_information() throws Throwable {
	    DrugsResultPageActionsobj.verifyNewDrugsInfo();
	}
	

	//Treatment Guides
	@Then("^all information about cancer should be displayed$")
	public void all_information_about_cancer_should_be_displayed() throws Throwable {
		DrugsResultPageActionsobj.verifyTreatmentGuidesInfo();
	}
	
	//Health Professionals
	@Then("^all information about insulin should be displayed$")
	public void all_information_about_insulin_should_be_displayed() throws Throwable {
		DrugsResultPageActionsobj.verifyHealthProfessionalsInfo();
	}

}
