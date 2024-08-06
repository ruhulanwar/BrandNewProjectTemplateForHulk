package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {

@FindBy(xpath="(//a[@class= 'ddc-carousel-item'])[1]")
public WebElement DrugsandMedication;

@FindBy(xpath=" //a[text()='Contact us']")
public WebElement ContactUs;
}