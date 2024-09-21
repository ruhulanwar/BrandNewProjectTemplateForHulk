package hulk.drugs.stepDef;

import cucumber.api.java.en.Then;
import hulk.drugs.pageAction.ConsentPageActions;

public class ConsentPageSteps {
	
ConsentPageActions ConsentPageActionsobj= new ConsentPageActions();
	@Then("^Health Privacy Consent and go back button should be displayed$")
	public void health_Privacy_Consent_and_go_back_button_should_be_displayed() throws Throwable {
	   ConsentPageActionsobj.HealthPrivacyConsent();
}
}