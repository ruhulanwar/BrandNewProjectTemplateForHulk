package hulk.drugs.pageAction;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsContactPageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsContactPageActions {
DrugsContactPageLocators DrugsContactPageLocatorsObj;

public DrugsContactPageActions(){
	DrugsContactPageLocatorsObj= new DrugsContactPageLocators();
	PageFactory.initElements(SetupDrivers.driver, DrugsContactPageLocatorsObj);
}
public void javaScriptExecutor(){
	JavascriptExecutor js = (JavascriptExecutor)hulk.utilities.SetupDrivers.driver;
	
js.executeScript("arguments[0].scrollIntoView();", DrugsContactPageLocatorsObj.ContactForm);
}
	public void ClickContactForm() throws Exception{
		
		DrugsContactPageLocatorsObj.ContactForm.click();
		
		Thread.sleep(8000);
		
	}
		
	}

//checking