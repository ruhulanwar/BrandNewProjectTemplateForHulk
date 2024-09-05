package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hulk.drugs.pageElements.DrugsResultPageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsResultPageActions {
	DrugsResultPageLocators DrugsResultPageLocatorsobj;
	
	public DrugsResultPageActions(){
		DrugsResultPageLocatorsobj= new DrugsResultPageLocators();
		PageFactory.initElements(SetupDrivers.driver, DrugsResultPageLocatorsobj);
	}
	public void verifydruginfo() throws Exception{
		
		Assert.assertEquals("Metformin", DrugsResultPageLocatorsobj.DrugName.getText());
Thread.sleep(2000);
	}
	
	public void verifyAbdominalPain() throws Exception{
		Assert.assertEquals("Abdominal Pain", DrugsResultPageLocatorsobj.AbdominalPainInfo.getText());
	}
	
	public void verifyNewDrugsInfo(){
	Assert.assertEquals("New Drug Approvals", DrugsResultPageLocatorsobj.NewDrugsInfo.getText());
}
}
		

	
