package co.getbarter.qa.steps;

import co.getbarter.qa.steplib.HomepageUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomepageSteps {

    @Steps
    private HomepageUser homepageUser;

    @Given("^I am on the homepage$")
    public void am_on_the_homepage() {
        homepageUser.open_homepage();
        homepageUser.verify_user_is_on_the_homepage();
    }

    @When("^I go to the register page$")
    public void go_to_the_register_page() {
        homepageUser.go_to_register_page();
    }
}
