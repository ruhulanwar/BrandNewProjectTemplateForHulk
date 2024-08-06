package hulk.drugs.pageAction;

import org.openqa.selenium.support.ui.Select;

import hulk.drugs.pageElements.DrugsFormPageLocators;

public class DrugsFormPageActions {
	DrugsFormPageLocators DrugsFormPageLocatorsobj;
		
	public DrugsFormPageActions(){
		DrugsFormPageLocatorsobj= new DrugsFormPageLocators();
	}
	
public void suggestiondd() throws Exception{
		
		Select dropDown= new Select(DrugsFormPageLocatorsobj.SubjectDD);
		
		dropDown.selectByValue("app");			
		Thread.sleep(3000);
	}
	
	public void fillDetails() throws Exception{
		DrugsFormPageLocatorsobj.FullName.sendKeys("Esme Gurung");
		Thread.sleep(3000);
		DrugsFormPageLocatorsobj.email.sendKeys("esme345@gmail.com");
		Thread.sleep(3000);
		DrugsFormPageLocatorsobj.Message.sendKeys("Hi there just testing my automation project");
		Thread.sleep(3000);
		
	}
	
	public void checkbx() throws Exception{
		DrugsFormPageLocatorsobj.chckbox.click();
		Thread.sleep(3000);
	}
	
	public void submit() throws Exception{
		DrugsFormPageLocatorsobj.Submit.click();
		Thread.sleep(3000);
		
	}
}
