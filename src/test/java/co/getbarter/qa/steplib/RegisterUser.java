package co.getbarter.qa.steplib;

import co.getbarter.qa.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RegisterUser extends ScenarioSteps {

    private RegisterPage registerPage;

    @Step
    public void verify_register_page_is_displayed() {
        assertThat(registerPage.getRegisterPageUrl(), containsString("register"));
    }

    @Step
    public void register_user() {
        registerPage.registerUser();
        waitABit(5000);
    }
}
