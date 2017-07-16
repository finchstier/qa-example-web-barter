package co.getbarter.qa.steps;

import co.getbarter.qa.steplib.HomepageUser;
import co.getbarter.qa.steplib.RegisterUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterSteps {

    @Steps
    private RegisterUser registerUser;

    @Steps
    private HomepageUser homepageUser;

    @When("^I register for an account$")
    public void register_for_an_account() {
        registerUser.register_user();
    }


    @Then("^I should be on the register page$")
    public void should_be_on_the_register_page() {
        registerUser.verify_register_page_is_displayed();
    }


    @Given("^I am on the register page$")
    public void want_to_register() {
        homepageUser.am_on_the_homepage();
        homepageUser.go_to_register_page();
    }
}
