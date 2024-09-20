package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.RegistrationPageActions;

public class RegistrationPageSteps {
	
	RegistrationPageActions RegistrationPageActionsobj= new RegistrationPageActions();
	@When("^Enters the email address on the textbox$")
	public void enters_the_email_address_on_the_textbox() throws Throwable {
		RegistrationPageActionsobj.EmailAddress();
	   
	}

	@When("^Clicks on Continue with email button$")
	public void clicks_on_Continue_with_email_button() throws Throwable {
		RegistrationPageActionsobj.ContinueWithEmail();
	}

	

	}

