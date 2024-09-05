package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hulk.drugs.pageElements.ConsentPageLocators;
import hulk.utilities.SetupDrivers;

public class ConsentPageActions {
ConsentPageLocators ConsentPageLocatorsobj;

public ConsentPageActions(){
	ConsentPageLocatorsobj= new ConsentPageLocators();
	PageFactory.initElements(SetupDrivers.driver, ConsentPageLocatorsobj);
}

public void HealthPrivacyConsent(){
	Assert.assertEquals("Go Back",ConsentPageLocatorsobj.GoBackbtn.getText());
}
}
