package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsSearchResultActions;

public class DrugsSearchResultSteps {
	DrugsSearchResultActions DrugsSearchResultActionsObj = new DrugsSearchResultActions();

	@Then("^Item list should have only vitamin related products$")
	public void item_list_should_have_only_vitamin_related_products() throws Throwable {
	    
		DrugsSearchResultActionsObj.verifyVitaminItems();
}
}
