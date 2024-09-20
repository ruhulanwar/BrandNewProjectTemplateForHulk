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
		Thread.sleep(5000);
	}
	
	public void sideEffectsDrug() throws Exception{
		DrugsSearchPageLocatorsobj.SearchSideEffectstxtbx.sendKeys("Adderall");
		Thread.sleep(3000);
	
	}
	public void SideESearch() throws Exception{
		DrugsSearchPageLocatorsobj.SideEffectsSearch.click();
	
		Thread.sleep(3000);
	}
	
	
	public void ClickSearchBtn() throws Exception{
		
		
		DrugsSearchPageLocatorsobj.SearchBtn.click();
		Thread.sleep(5000);
		
	}
	
	
	//Treatment Guides
	public void EnterTreatmentGuides() throws Exception{
		DrugsSearchPageLocatorsobj.SearchTreatmentGuidesTxtbx.sendKeys("Cancer");
		Thread.sleep(5000);
	}
	
	// Health Professionals
	public void EnterDrugNameHP() throws Exception{
		DrugsSearchPageLocatorsobj.Searchtxtbx.sendKeys("Insulin");
		Thread.sleep(5000);
	}
	
	
	
	
}