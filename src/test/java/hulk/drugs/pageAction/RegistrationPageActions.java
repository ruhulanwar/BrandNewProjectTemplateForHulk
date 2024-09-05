package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.RegistrationPageLocators;
import hulk.utilities.SetupDrivers;

public class RegistrationPageActions {
RegistrationPageLocators RegistrationPageLocatorsobj;

public RegistrationPageActions(){
RegistrationPageLocatorsobj = new RegistrationPageLocators();
PageFactory.initElements(SetupDrivers.driver, RegistrationPageLocatorsobj);
}

public void EmailAddress() throws Exception{
	RegistrationPageLocatorsobj.Emailtxtbox.sendKeys("automation@gmail.com");
	Thread.sleep(2000);
}

public void ContinueWithEmail() throws Exception{
	RegistrationPageLocatorsobj.ContinuewithEmailbtn.click();
	Thread.sleep(2000);
}


}