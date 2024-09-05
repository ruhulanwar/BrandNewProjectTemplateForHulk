package hulk.drugs.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsHomePageActions;

public class DrugsHomePageSteps {
	DrugsHomePageActions DrugsHomePageActionsobj= new DrugsHomePageActions();
	
	@Given("^The user is on drugs\\.com Homepage\\.$")
	public void the_user_is_on_drugs_com_Homepage() throws Throwable {
	  
	}
	@When("^the user clicks on Drugs & Medication$")
	public void the_user_clicks_on_Drugs_Medication() throws Throwable {
	  DrugsHomePageActionsobj.ClickDrugMedication();
	}
	
	
	@When("^The user clicks on the Contact Us button$")
	public void the_user_clicks_on_the_Contact_Us_button() throws Throwable {
	   		   DrugsHomePageActionsobj.ClickContactUs();
	}
	
	@When("^Click on Drugs A-Z$")
	public void click_on_Drugs_A_Z() throws Throwable {
		DrugsHomePageActionsobj.clickDrugsAtoZ();
	}
	
	@When("^Click on Advanced Search$")
	public void click_on_Advanced_Search() throws Throwable {
	    DrugsHomePageActionsobj.clickAdvancedSearch();
	}
}
