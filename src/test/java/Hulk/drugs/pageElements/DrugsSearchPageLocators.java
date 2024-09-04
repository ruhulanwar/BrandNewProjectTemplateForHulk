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
	@FindBy (xpath = "//input[@ placeholder='Enter a drug name']")
	public WebElement SearchSideEffectstxtbx;
	 @FindBy(xpath="(//button[@type='submit'])[2]")
	 public WebElement SideEffectsSearch;
}
