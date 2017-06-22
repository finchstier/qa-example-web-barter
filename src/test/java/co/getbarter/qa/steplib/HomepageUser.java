package co.getbarter.qa.steplib;

import co.getbarter.qa.pages.Homepage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomepageUser extends ScenarioSteps {

    private Homepage homepage;

    @Step
    public void open_homepage() {
        homepage.openHomepage();
    }

    @Step
    public void verify_user_is_on_the_homepage() {
        assertThat(homepage.isUserOnHomepage(), is(true));
    }

    @Step
    public void go_to_register_page() {
        homepage.clickGetStarted();
    }
}
