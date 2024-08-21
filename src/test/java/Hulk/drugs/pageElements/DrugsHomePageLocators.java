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
}