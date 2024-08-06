package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsHomePageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsHomePageActions {
DrugsHomePageLocators DrugsHomePageLocatorsobj;

public DrugsHomePageActions(){
	DrugsHomePageLocatorsobj = new DrugsHomePageLocators();
	PageFactory.initElements(SetupDrivers.driver,DrugsHomePageLocatorsobj);
}
	
public void ClickDrugMedication() throws Exception{
	DrugsHomePageLocatorsobj.DrugsandMedication.click();
	Thread.sleep(2000);
	
	
		
	}

public void ClickContactUs() throws Exception{
	DrugsHomePageLocatorsobj.ContactUs.click();
	Thread.sleep(5000);
}


}
