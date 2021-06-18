package Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class loginToProduction {
	
	
	@When("^user validates the captch image$")
	public void user_validates_the_captch_image() throws Throwable {
	   
		System.out.println("@when -- user validates the captch images");
	}

}
