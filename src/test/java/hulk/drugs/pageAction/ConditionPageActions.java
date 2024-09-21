package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.ConditionPageLocators;
import hulk.utilities.SetupDrivers;

public class ConditionPageActions {
	ConditionPageLocators ConditionPageLocatorsobj;
	
	public ConditionPageActions(){
		ConditionPageLocatorsobj= new ConditionPageLocators();
		PageFactory.initElements(SetupDrivers.driver, ConditionPageLocatorsobj);
	}
	public void ClickAbdominalPain() throws Exception{
		ConditionPageLocatorsobj.AbdominalPain.click();
		Thread.sleep(2000);
	}

}
