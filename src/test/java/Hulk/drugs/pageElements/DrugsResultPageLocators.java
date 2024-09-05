package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsResultPageLocators {
	
 @FindBy (xpath="(//*[text()='Metformin'])[2]")
 public WebElement DrugName;
 //Drugs with Ab
 @FindBy (xpath="//a[@href='/mtm/abacavir.html']")
 public WebElement drugsAb;
//Tylenol Drug Result
 @FindBy (xpath="//b[contains(text(),'Tylenol')][1]")
 public WebElement drugTylenol;
	
}
