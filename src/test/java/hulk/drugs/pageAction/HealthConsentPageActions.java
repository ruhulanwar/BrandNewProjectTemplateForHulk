package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.HealthConsentPageLocators;
import hulk.utilities.SetupDrivers;

public class HealthConsentPageActions {
HealthConsentPageLocators HealthConsentPageLocatorsobj;

public HealthConsentPageActions(){
	HealthConsentPageLocatorsobj= new HealthConsentPageLocators();
	PageFactory.initElements(SetupDrivers.driver,HealthConsentPageLocatorsobj);
}

public void DonotConsent(){
	HealthConsentPageLocatorsobj.Donotconsentbtn.click();
}
}
