package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsPillIdentifierResultPageLocaters {

	@FindBy(xpath="//input[@id='livesearch-imprint-drug']")
	public WebElement txtPillSearch;
	
	@FindBy(xpath="//form[@class='form-search form-search-imprint-drug noprint ddc-clearfix']//button[@type='submit']//*[name()='svg']")
	public WebElement btnPillSearch;
}
