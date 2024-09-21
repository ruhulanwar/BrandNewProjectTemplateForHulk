package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsPillIdentifierResultPageAction;

public class DrugsPillIdentifierResultPage {

	DrugsPillIdentifierResultPageAction DrugsPillIdentifierResultPageActionObj = new DrugsPillIdentifierResultPageAction();
	
	@When("^Search for the \"([^\"]*)\" Drug$")
	public void search_for_the_Drug(String arg1) throws Throwable {
		
		DrugsPillIdentifierResultPageActionObj.searchAspirin();
		
}
}
