package co.getbarter.qa.steps;

import co.getbarter.qa.steplib.HomepageUser;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomepageSteps {

    @Steps
    private HomepageUser homepageUser;

    @Given("^I am on the homepage$")
    public void am_on_the_homepage() {
        homepageUser.open_homepage();
        homepageUser.verify_user_is_on_the_homepage();
    }

    @Given("^I am new customer$")
    public void am_new_customer() {
        homepageUser.go_to_register_page();
    }
}
