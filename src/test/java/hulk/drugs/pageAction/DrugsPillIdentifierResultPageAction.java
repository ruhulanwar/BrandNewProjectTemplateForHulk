package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsPillIdentifierResultPageLocaters;
import hulk.utilities.SetupDrivers;

public class DrugsPillIdentifierResultPageAction {
	
	DrugsPillIdentifierResultPageLocaters DrugsPillIdentifierResultPageLocatersObj;
	
	public DrugsPillIdentifierResultPageAction (){
		
		 DrugsPillIdentifierResultPageLocatersObj =new	DrugsPillIdentifierResultPageLocaters();
		 PageFactory.initElements(SetupDrivers.driver, DrugsPillIdentifierResultPageLocatersObj);
			
	}
			
			public void searchAspirin (){
				DrugsPillIdentifierResultPageLocatersObj.txtPillSearch.sendKeys("Aspirin");
				DrugsPillIdentifierResultPageLocatersObj.btnPillSearch.click();
				
			}
	}
