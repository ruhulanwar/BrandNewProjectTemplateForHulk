package hulk.drugs.pageAction;

import org.openqa.selenium.JavascriptExecutor;

import hulk.drugs.pageElements.DrugsContactPageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsContactPageActions {
DrugsContactPageLocators DrugsContactPageLocatorsobj;

public DrugsContactPageActions(){
	DrugsContactPageLocatorsobj= new DrugsContactPageLocators();
}


	
	public void ClickContactForm() throws Exception{
		DrugsContactPageLocatorsobj.ContactForm.isEnabled();
		DrugsContactPageLocatorsobj.ContactForm.click();
		Thread.sleep(5000);
		
	}
}
