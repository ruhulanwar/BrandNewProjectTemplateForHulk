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
	
	//Samiul
	public void verifyDrugsAb() throws Exception{
		Assert.assertEquals("Abacavir", DrugsResultPageLocatorsobj.drugsAb.getText());
		Thread.sleep(2000);
	}
	
	//Samiul
	public void verifyDrugTylenol() throws Exception{
		Assert.assertEquals("Tylenol", DrugsResultPageLocatorsobj.drugTylenol.getText());
		Thread.sleep(2000);
	}
	
	public void verifyAbdominalPain() throws Exception{
		Assert.assertEquals("Abdominal Pain", DrugsResultPageLocatorsobj.AbdominalPainInfo.getText());
	}
	
	public void verifyNewDrugsInfo(){
		Assert.assertEquals("New Drug Approvals", DrugsResultPageLocatorsobj.NewDrugsInfo.getText());
	}
	
	public void verifyTreatmentGuidesInfo() throws Exception{
		Assert.assertEquals("Cancer", DrugsResultPageLocatorsobj.TreatmentGuideName.getText());
		Thread.sleep(2000);
	}
	
	public void verifyHealthProfessionalsInfo() throws Exception{
		Assert.assertEquals("Insulin", DrugsResultPageLocatorsobj.DrugNameHPName.getText());
		Thread.sleep(2000);
	}
	
	
}
		

