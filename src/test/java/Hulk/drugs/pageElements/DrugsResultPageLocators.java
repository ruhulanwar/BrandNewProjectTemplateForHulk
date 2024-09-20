package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsResultPageLocators {
	
	 @FindBy (xpath="(//*[text()='Metformin'])[2]")
	 public WebElement DrugName;

	@FindBy (xpath="(//*[text()='Abdominal Pain'])[2]")
	public WebElement AbdominalPainInfo;
	
	@FindBy (xpath=" //*[text()='New Drug Approvals']")
	public WebElement NewDrugsInfo;
	
	@FindBy (xpath="(//*[text()='Cancer'])[2]")
	public WebElement TreatmentGuideName;
	
	@FindBy (xpath="(//*[text()='Insulin'])[2]")
	public WebElement DrugNameHPName;
	
}
