package hulk.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsFormPageLocators {
	@FindBy (xpath="//select[@name='topic']")
	public WebElement SubjectDD;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement FullName;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//textarea[@name='message']")
	public WebElement Message;
	
	@FindBy (xpath="////input[@type= 'checkbox']")
	public WebElement chckbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement Submit;
}
