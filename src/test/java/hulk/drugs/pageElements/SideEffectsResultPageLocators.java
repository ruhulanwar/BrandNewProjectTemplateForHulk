package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideEffectsResultPageLocators {
	
	 //@FindBy (xpath="(//*[text()='Adderall'])")
	 //public WebElement SideEffectsForAdderall;

	 @FindBy(xpath= "//*[@id='content']/div[2]/div[3]/div/a/h3/b")
	 public WebElement SideEffects;

}
