package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.DrugsPillIdentifierSearchResultPageAction;



public class DrugsPillIdentifierSearchResultPage {
	
	DrugsPillIdentifierSearchResultPageAction DrugsPillIdentifierSearchResultPageActionObj = new DrugsPillIdentifierSearchResultPageAction();
	
	@Then("^All items related to aspirin should display$")
	public void all_items_related_to_aspirin_should_display() throws Throwable {
		DrugsPillIdentifierSearchResultPageActionObj.VerifyResultForAspirin();
	}
}
