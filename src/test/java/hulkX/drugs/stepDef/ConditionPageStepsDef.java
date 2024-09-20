package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.ConditionPageActions;

public class ConditionPageStepsDef {
ConditionPageActions ConditionPageActionsobj= new ConditionPageActions();
	@When("^Clicks on Abdominal Pain under Common heading$")
	public void clicks_on_Abdominal_Pain_under_Common_heading() throws Throwable {
	    ConditionPageActionsobj.ClickAbdominalPain();
}
}
