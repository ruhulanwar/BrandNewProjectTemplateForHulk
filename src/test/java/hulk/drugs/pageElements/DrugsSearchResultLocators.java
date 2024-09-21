package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSearchResultLocators {
	
	@FindBy(xpath="//span[@class='ddc-breadcrumb-item']")
	public WebElement txtresult;

}