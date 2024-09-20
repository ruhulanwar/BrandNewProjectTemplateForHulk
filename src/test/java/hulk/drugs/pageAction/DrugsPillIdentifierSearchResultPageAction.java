package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsPillIdentifierSearchResultPageLocaters;
import hulk.utilities.SetupDrivers;
import junit.framework.Assert;

public class DrugsPillIdentifierSearchResultPageAction {

	DrugsPillIdentifierSearchResultPageLocaters DrugsPillIdentifierSearchResultPageLocatersObj;
	public DrugsPillIdentifierSearchResultPageAction (){
		
		DrugsPillIdentifierSearchResultPageLocatersObj = new DrugsPillIdentifierSearchResultPageLocaters();
		PageFactory.initElements(SetupDrivers.driver, DrugsPillIdentifierSearchResultPageLocatersObj );
		
		}
	
	public void VerifyResultForAspirin(){
		
		Assert.assertTrue(DrugsPillIdentifierSearchResultPageLocatersObj.txtaspirin.isDisplayed());
	}
	}

