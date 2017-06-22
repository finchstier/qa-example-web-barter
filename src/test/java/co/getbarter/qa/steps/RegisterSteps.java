package co.getbarter.qa.steps;

import co.getbarter.qa.steplib.RegisterUser;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterSteps {

    @Steps
    private RegisterUser registerUser;

    @When("^I register for an account$")
    public void register_for_an_account() {}
}
