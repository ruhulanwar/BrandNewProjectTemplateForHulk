package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;

import hulk.drugs.pageAction.SideEffectsResultPageActions;

public class SideEffectsResultPageSteps {
	
	SideEffectsResultPageActions SideEffectsResultPageActionsobj= new SideEffectsResultPageActions();
	@Then("^the  Adderall Side Effects is provided$")
	public void the_Adderall_Side_Effects_is_provided() throws Throwable {
	SideEffectsResultPageActionsobj.verifysideEffects();
	}
}