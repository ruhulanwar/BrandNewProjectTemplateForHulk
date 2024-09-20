package hulk.drugs.pageAction;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import hulk.drugs.pageElements.DrugsFormPageLocators;
import hulk.utilities.SetupDrivers;

public class DrugsFormPageActions {
	DrugsFormPageLocators DrugsFormPageLocatorsObj;
		
	public DrugsFormPageActions(){
		DrugsFormPageLocatorsObj= new DrugsFormPageLocators();
		PageFactory.initElements(SetupDrivers.driver, DrugsFormPageLocatorsObj);
	}
	
public void suggestiondd() throws Exception{
		
		Select dropDown= new Select(DrugsFormPageLocatorsObj.SubjectDD);
		
		dropDown.selectByValue("app");			
		Thread.sleep(3000);
	}
	
	public void fillDetails() throws Exception{
		DrugsFormPageLocatorsObj.FullName.sendKeys("Esme Gurung");
		Thread.sleep(3000);
		DrugsFormPageLocatorsObj.email.sendKeys("esme345@gmail.com");
		Thread.sleep(3000);
		DrugsFormPageLocatorsObj.Message.sendKeys("Hi there just testing my automation project");
		Thread.sleep(3000);
		
	}
	
	public void javaScriptExecutor() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		//js.executeScript("DrugsFormPageLocatorsObj.chckbox.click();");
		js.executeScript("DrugsFormPageLocatorsObj.chckbox.checked=true;");
		Thread.sleep(3000);
	}
	public void checkbx() throws Exception{

	
		DrugsFormPageLocatorsObj.chckbox.click();
		Thread.sleep(3000);
	}
	
	public void submit() throws Exception{
		DrugsFormPageLocatorsObj.Submit.click();
		Thread.sleep(3000);
		
	}
}
