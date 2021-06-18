package Steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {

	@Before
	public void setup() {

		System.out.println("launch browser");
	}

	@After
	public void setclose() {
		System.out.println("close browser");
	}

	@Before("@prod") // tags hooks
	public void setupprod() {

		System.out.println("launch browser -- production");
	}

	@After("@prod") // tags hooks
	public void setcloseprod() {
		System.out.println("close browser --- production");
	}

	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {

		System.out.println("@Given--Open the browser");
	}

	@When("^user navigates url$")
	public void user_navigates_url() throws Throwable {

		System.out.println("@when--user navigates url");
	}

	@When("^user clicks MyAccount$")
	public void user_clicks_MyAccount() throws Throwable {

		System.out.println("@when-- user clicks myaccount button");
	}

	@When("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String username) throws Throwable {

		System.out.println("@when-- user entered " + username + " username");
	}

	@When("^user entered \"([^\"]*)\" password$")
	public void user_entered_valid_password(String password) throws Throwable {

		System.out.println("@when-- user entered " + password + " password");
	}

	/*
	 * @When("^user select the age category$") // single list data coading like Age,
	 * below 18, above 18 public void user_select_the_age_category(List<String>
	 * list) throws Throwable {
	 * 
	 * System.out.println("@When --- user select the age category : "+list.get(1));
	 * }
	 */

	@When("^user select the age category$") // multiple list code
	public void user_select_the_age_category(DataTable table) throws Throwable {

		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		System.out.println("@When --- user select the age category : " + data.get(1).get("Age")
				+ "--- selected location as : " + data.get(1).get("Location"));
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {

		System.out.println("@when-- user clicks login button");
	}

	/*
	 * @When("^user validates the captch image$") public void
	 * user_validates_the_captch_image() throws Throwable {
	 * 
	 * System.out.println("@when -- user validates the captch images"); }
	 */

	@Then("^user \"([^\"]*)\" successfully logged in$")
	public void user_shouldbe_successfully_logged_in(String validtelogin) throws Throwable {

		System.out.println("@Then-- user " + validtelogin + " succesfully logedin");
	}

}
