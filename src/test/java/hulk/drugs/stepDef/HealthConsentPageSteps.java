package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.HealthConsentPageActions;

public class HealthConsentPageSteps {
	HealthConsentPageActions HealthConsentPageActionsobj= new HealthConsentPageActions();
	@When("^Clicks on I Do not consent button$")
	public void clicks_on_I_Do_not_consent_button() throws Throwable {
       HealthConsentPageActionsobj.DonotConsent();
}
}
