package hulk.drugs.pageAction;

import org.testng.Assert;

import hulk.drugs.pageElements.DrugsContactResultPageLocators;

public class DrugsContactResultPageActions {

	DrugsContactResultPageLocators DrugsContactResultPageLocatorsobj;
	
	public DrugsContactResultPageActions(){
		DrugsContactResultPageLocatorsobj= new DrugsContactResultPageLocators();
	}
	
	public void validateMsg(){
		
		Assert.assertTrue( DrugsContactResultPageLocatorsobj.Message.isDisplayed());
	}
	

}
