package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsSearchResultLocators;
import hulk.utilities.SetupDrivers;
import junit.framework.Assert;

public class DrugsSearchResultActions {

	DrugsSearchResultLocators DrugsSearchResultLocatorsObj;
	
	public DrugsSearchResultActions (){
		
		DrugsSearchResultLocatorsObj = new DrugsSearchResultLocators();
	PageFactory.initElements(SetupDrivers.driver, DrugsSearchResultLocatorsObj);
	}
	
	public void verifyVitaminItems(){
		Assert.assertTrue(DrugsSearchResultLocatorsObj.txtresult.isDisplayed());
	}
}
