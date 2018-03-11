package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.automation_practice.HomePage;

public class LoginSteps {

    HomePage homePage;

    public LoginSteps(HomePage homePage) {
        this.homePage = homePage;
    }



    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        homePage.load();
    }

    @When("^the user enters user credentials$")
    public void the_user_enters_user_credentials() {
    }

    @Then("^the user should not be able to log in$")
    public void the_user_should_not_be_able_to_log_in() {
    }
}
