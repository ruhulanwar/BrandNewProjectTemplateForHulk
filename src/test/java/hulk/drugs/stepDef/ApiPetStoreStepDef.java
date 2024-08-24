package hulk.drugs.stepDef;

import cucumber.api.java.en.Given;
import hulk.api.restassured.PetstoreRestAssuredActions;

public class ApiPetStoreStepDef {
	PetstoreRestAssuredActions PetstoreRestAssuredActionsObj = new PetstoreRestAssuredActions();
@Given("^Create pet$")
public void create_pet() throws Throwable {
	PetstoreRestAssuredActionsObj.createPet();
}

@Given("^Get pet$")
public void get_pet() throws Throwable {
	PetstoreRestAssuredActionsObj.getPet();
}

}
