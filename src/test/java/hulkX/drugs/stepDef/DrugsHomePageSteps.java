package hulk.drugs.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsHomePageActions;

public class DrugsHomePageSteps {
	DrugsHomePageActions DrugsHomePageActionsobj= new DrugsHomePageActions();
	
	@When("^the user clicks on Drugs & Medication$")
	public void the_user_clicks_on_Drugs_Medication() throws Throwable {
	  DrugsHomePageActionsobj.ClickDrugMedication();
	}
	
	@Given("^The user is on drugs\\.com Homepage\\.$")
	public void the_user_is_on_drugs_com_Homepage() throws Throwable {
	  
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

	@When("^the user clicks on Side Effects$")
	public void the_user_clicks_on_Side_Effects() throws Throwable {
		 DrugsHomePageActionsobj.ClickSideEffects();  
	}
	
	@When("^the user clicks on new drugs$")
	public void the_user_clicks_on_new_drugs() throws Throwable {
		 DrugsHomePageActionsobj.ClickNewDrugs();  
	}
	


	@When("^User clicks on Browse Conditions on the homepage$")
	public void user_clicks_on_Browse_Conditions_on_the_homepage() throws Throwable {
	 DrugsHomePageActionsobj.ClickBrowseConditions();
	}

	@When("^User clicks on Alphabet A below the condition$")
	public void user_clicks_on_Alphabet_A_below_the_condition() throws Throwable {
	 DrugsHomePageActionsobj.ClickAlphabet();
	}
	@When("^The user clicks on the Register on the top of the page$")
	public void the_user_clicks_on_the_Register_on_the_top_of_the_page() throws Throwable {
	 DrugsHomePageActionsobj.ClickRegister();
	}
	

	//ELI
	@When("^clicks on treatment guides link$")
	public void clicks_on_treatment_guides_link() throws Throwable {
		DrugsHomePageActionsobj.ClickTreatmentGuides();
	}
	
	@When("^clicks on Health Professionals link$")
	public void clicks_on_Health_Professionals_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DrugsHomePageActionsobj.ClickHealthProfessionals();
	}
	

	@Given("^browse to drugs\\.com$")
	public void browse_to_drugs_com() throws Throwable {
	    
	}

	@When("^Search for vitamin$")
	public void search_for_vitamin() throws Throwable {
		
		DrugsHomePageActionsobj.searchVitamin();
	}
	
	@When("^Click on the Pill Identifier$")
	public void click_on_the_Pill_Identifier() throws Throwable {
		DrugsHomePageActionsobj.ClickPillIndetifier();
	}

}