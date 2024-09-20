package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsPillIdentifierPageLocaters;
import hulk.utilities.SetupDrivers;

public class DrugsPillIdentifierPageAction {
	
	DrugsPillIdentifierPageLocaters DrugsPillIdentifierPageLocatersObj;

	public DrugsPillIdentifierPageAction (){
		
		DrugsPillIdentifierPageLocatersObj = new DrugsPillIdentifierPageLocaters();
		PageFactory.initElements(SetupDrivers.driver, DrugsPillIdentifierPageLocatersObj);
	}	
		
	public void ClickAgreeAndContinue(){
		DrugsPillIdentifierPageLocatersObj.btnagreencontinue.click();
	}
			

}

