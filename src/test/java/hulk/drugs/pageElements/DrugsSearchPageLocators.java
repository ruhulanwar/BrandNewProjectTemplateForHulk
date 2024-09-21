package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSearchPageLocators {
//Search box
	@FindBy (xpath="//input[@placeholder='Enter a drug name']")
	public WebElement Searchtxtbx;
	//Search button
	@FindBy(xpath= "//button[@class='ddc-btn']")
	public WebElement SearchBtn;

	//Alphabet A Samiul
	@FindBy(xpath= "//a[@aria-label='Browse drugs and medications by letter: A']")
	public WebElement alphabetA;
	//Letter Ab Samiul
	@FindBy(xpath= "//a[@aria-label='Browse drugs starting with: Ab']")
	public WebElement letterAb;
	//Search Textbox Samiul
	@FindBy(xpath= "//input[@placeholder='Enter a search term']")
	public WebElement srchTxtBx;
	//Advanced Drop down Samiul
	@FindBy(xpath= "//select[@id='phrase']")
	public WebElement advnDD;
	//Clear Selection Samiul
	@FindBy(xpath= "//a[contains(text(),'Clear all selections')]")
	public WebElement clearSelec;
	//Advanced Search Button Samiul
	@FindBy(xpath= "//button[contains(text(),'Search')]")
	public WebElement advnSrchBtn;

	@FindBy (xpath = "//input[@ placeholder='Enter a drug name']")
	public WebElement SearchSideEffectstxtbx;
	 @FindBy(xpath="(//button[@type='submit'])[2]")
	 public WebElement SideEffectsSearch;

	 
	//ELI: Treatment Guides 
	@FindBy (xpath="//input[@placeholder='Enter a condition, e.g. acne']")
	public WebElement SearchTreatmentGuidesTxtbx;
	
	//@FindBy (xpath="//input[@placeholder='Enter a drug name']")
	//public WebElement SearchDrugNameTxtbx;
	
}
