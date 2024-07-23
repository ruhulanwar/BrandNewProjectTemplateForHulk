package dipu.hulk.stepDef;
import cucumber.api.java.en.*;
import dipu.utilities.SetupDrivers;

public class TestTheFeature {
	
	@Given("^a$")
	public void a() throws Throwable {
		SetupDrivers.driver.get("https://www.google.com/");
	    System.out.println("A");
	}
	
	@When("^b$")
	public void b() throws Throwable {
	    System.out.println("B");
	}

	@Then("^c$")
	public void c() throws Throwable {
		System.out.println("C");
	}
	
}


//This is a test