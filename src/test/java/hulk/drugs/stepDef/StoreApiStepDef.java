package hulk.drugs.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.StoreRestAssuredActions;

public class StoreApiStepDef {
	
	StoreRestAssuredActions StoreRestAssuredActionsObj = new StoreRestAssuredActions();

	@Given("^Create store$")
	public void create_store() throws Throwable {
		StoreRestAssuredActionsObj.createStore();
	}

	@Then("^Get store$")
	public void get_store() throws Throwable {
		StoreRestAssuredActionsObj.getStore();

	}

	@Then("^Delete store$")
	public void delete_store() throws Throwable {
		StoreRestAssuredActionsObj.deleteStore();
	}

}
