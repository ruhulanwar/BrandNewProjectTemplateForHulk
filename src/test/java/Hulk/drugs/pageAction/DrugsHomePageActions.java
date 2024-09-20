package hulk.drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import hulk.drugs.pageElements.DrugsHomePageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsHomePageActions {
DrugsHomePageLocators DrugsHomePageLocatorsobj;

public DrugsHomePageActions(){
	DrugsHomePageLocatorsobj = new DrugsHomePageLocators();
	PageFactory.initElements(SetupDrivers.driver,DrugsHomePageLocatorsobj);
}
	
public void ClickDrugMedication() throws Exception{
	DrugsHomePageLocatorsobj.DrugsandMedication.click();
	Thread.sleep(2000);
	
	}

public void ClickContactUs() throws Exception{
	DrugsHomePageLocatorsobj.ContactUs.click();
	Thread.sleep(5000);
}

<<<<<<< Updated upstream
public void ClickSideEffects() throws Exception{
	DrugsHomePageLocatorsobj.SideEffects.click();
	Thread.sleep(2000);

=======
DrugsHomePageLocators DrugsHomePageLocatorsObj;

public void searchVitamin(){
	DrugsHomePageLocatorsobj.Searchtxtbx.sendKeys("Vitamin");
	DrugsHomePageLocatorsobj.btnSearch.click();
	
}

public void ClickPillIndetifier(){
	DrugsHomePageLocatorsobj.btnPillIndefier.click();
}
>>>>>>> Stashed changes

}

public void ClickNewDrugs() throws Exception{
	DrugsHomePageLocatorsobj.NewDrugs.click();
	Thread.sleep(2000);
}

public void  ClickBrowseConditions() throws Exception{
DrugsHomePageLocatorsobj.BrowseConditions.click();
Thread.sleep(2000);
}

public void ClickAlphabet() throws Exception{
DrugsHomePageLocatorsobj.AlphabetA.click();
Thread.sleep(2000);
}

public void ClickRegister() throws Exception{
	DrugsHomePageLocatorsobj.Register.click();
	Thread.sleep(2000);
}


}