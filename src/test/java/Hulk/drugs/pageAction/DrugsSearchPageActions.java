package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsSearchPageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsSearchPageActions {

	DrugsSearchPageLocators DrugsSearchPageLocatorsobj;
	
	public DrugsSearchPageActions(){
		DrugsSearchPageLocatorsobj= new DrugsSearchPageLocators();
		PageFactory.initElements(SetupDrivers.driver, DrugsSearchPageLocatorsobj);
	}
	
	public void DrugName() throws Exception{
		DrugsSearchPageLocatorsobj.Searchtxtbx.sendKeys("Metformin");
		Thread.sleep(2000);
	}
	
	public void ClickSearchBtn() throws Exception{
		
		
		DrugsSearchPageLocatorsobj.SearchBtn.click();
		Thread.sleep(2000);
		
	}
}
