package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromiumdriver().setup();

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	}

	@When("hits enter")
	public void hits_enter() {
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {

	}
}
