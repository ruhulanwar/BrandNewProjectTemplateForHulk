package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {

	
	@FindBy(xpath="(//a[@class= 'ddc-carousel-item'])[1]")
	public WebElement DrugsandMedication;
	
	@FindBy(xpath=" //a[text()='Contact us']")
	public WebElement ContactUs;
	
	
	@FindBy(xpath="//span[contains(text(),'Effects')]")
	public WebElement SideEffects;
	
	
	@FindBy (xpath="(//a[text()='New Drugs'])[2]")
	public WebElement NewDrugs;
	
	@FindBy (xpath="//*[text()='Browse Conditions']")
	public WebElement BrowseConditions;
	
	@FindBy (xpath="//a[@aria-label='Browse conditions and diseases by letter: a']")
	public WebElement AlphabetA;
	
	@FindBy (xpath= "//*[text()='Register']")
	public WebElement Register;
	
	
	//Click button next Carausel
	@FindBy(xpath="(//button[@data-direction='next'])")
	public WebElement ClickCarauselNextBtn;
	
	//Click on Treatment Guides
	@FindBy(xpath="(//a[@href='/medical_conditions.html'])[1]")
	public WebElement TreatmentGuides;
	
	//HealthProfessionals
    @FindBy(xpath="(//a[@href='/professionals.html'])[4]")
	public WebElement HealthProfessionals;


	//DrugsAtoZ
	@FindBy(xpath="//a[contains(text(), 'Drugs A-Z')]")
	public WebElement drugsAtoZ;
	//Advanced Search
	@FindBy(xpath="//a[contains(text(),'Advanced Search')]")
	public WebElement advnSearch;


	@FindBy(xpath="//input[@id='livesearch-main']")
	public WebElement Searchtxtbx;
	
	@FindBy(xpath="//button[@type='submit']//*[name()='svg']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//nav[@class='ddc-header-nav-home']//a[normalize-space()='Pill Identifier']")
	public WebElement btnPillIndefier;


}