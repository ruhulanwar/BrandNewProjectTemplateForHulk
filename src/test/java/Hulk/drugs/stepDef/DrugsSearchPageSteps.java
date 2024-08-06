package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsSearchPageActions;

public class DrugsSearchPageSteps {
	DrugsSearchPageActions DrugsSearchPageActionsobj= new DrugsSearchPageActions();
	
	@When("^enters the drug name$")
	public void enters_the_drug_name() throws Throwable {
		 DrugsSearchPageActionsobj.DrugName();
	}

	@When("^clicks on the search button$")
	public void clicks_on_the_search_button() throws Throwable {
		 DrugsSearchPageActionsobj.ClickSearchBtn();
	}
}
