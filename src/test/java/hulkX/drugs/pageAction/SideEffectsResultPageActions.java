package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import hulk.drugs.pageElements.SideEffectsResultPageLocators;
import hulk.utilities.SetupDrivers;

public class SideEffectsResultPageActions {
	
	SideEffectsResultPageLocators SideEffectsResultPageLocatorsobj;
	
	public SideEffectsResultPageActions(){
		 SideEffectsResultPageLocatorsobj= new  SideEffectsResultPageLocators();
		PageFactory.initElements(SetupDrivers.driver, SideEffectsResultPageLocatorsobj);
	}
	//public void verifySideEffects() throws Exception{
		
		//Assert.assertEquals("Adderall",  SideEffectsResultPageLocatorsobj.SideEffectsForAdderall.getText());
//Thread.sleep(2000);
	//}
	public void verifysideEffects() throws Exception{
		Assert.assertEquals("Adderall", SideEffectsResultPageLocatorsobj.SideEffects.getText());
		Thread.sleep(2000);

	}
}
