package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsPillIdentifierPageAction;

public class DrugsPillIdentifierPageSteps {
	
	DrugsPillIdentifierPageAction DrugsPillIdentifierPageActionObj = new DrugsPillIdentifierPageAction();
	
	@When("^Click on the \"([^\"]*)\"$")
	public void click_on_the(String arg1) throws Throwable {
		
		DrugsPillIdentifierPageActionObj.ClickAgreeAndContinue();
	}
}
