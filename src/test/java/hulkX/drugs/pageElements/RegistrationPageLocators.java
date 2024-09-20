package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageLocators {
@FindBy (xpath= "//input[@type='email']")
public WebElement Emailtxtbox;

@FindBy (xpath="//button[text()='Continue with email']")
public WebElement ContinuewithEmailbtn;
}
