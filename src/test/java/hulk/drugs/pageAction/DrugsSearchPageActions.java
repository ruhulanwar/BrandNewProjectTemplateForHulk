package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
		Thread.sleep(2000);
	}
	
	public void clickAlphabetA() throws Exception{
		DrugsSearchPageLocatorsobj.alphabetA.click();
		Thread.sleep(2000);
	}
	
	public void clickLetterAb() throws Exception{
		DrugsSearchPageLocatorsobj.letterAb.click();
		Thread.sleep(2000);
	}
	
	public void advancedText() throws Exception{
		DrugsSearchPageLocatorsobj.srchTxtBx.sendKeys("Tylenol");
		Thread.sleep(2000);
	}
	
	public void selectPhrase() throws Exception{
		Select dropDown = new Select(DrugsSearchPageLocatorsobj.advnDD);
		dropDown.selectByVisibleText("Exact phrase");
		Thread.sleep(2000);
	}
	
	public void clickClearSelection() throws Exception{
		DrugsSearchPageLocatorsobj.clearSelec.click();
		Thread.sleep(2000);
	}
	
	public void clickAdvancedSearchButton() throws Exception{
		DrugsSearchPageLocatorsobj.advnSrchBtn.click();
		Thread.sleep(2000);
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