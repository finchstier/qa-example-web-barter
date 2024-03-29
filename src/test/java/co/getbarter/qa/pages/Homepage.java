package co.getbarter.qa.pages;

import co.getbarter.qa.Properties;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Homepage extends PageObject {

    @FindBys({
            @FindBy(css = ".container.Teaser"),
            @FindBy(className = "Button")
    })
    private WebElementFacade getStartedButton;

    @FindBys({
            @FindBy(css = ".Preview .container"),
            @FindBy(className = "Button")
    })
    private WebElementFacade tryItOutButton;

    @FindBys({
            @FindBy(css = ".Newsletter .container"),
            @FindBy(className = "Button")
    })
    private WebElementFacade newsletterSubscribeButton;

    @FindBy(id = "login-link")
    private WebElementFacade loginLink;

    private final String url;
    private static final Logger LOGGER = LoggerFactory.getLogger(Homepage.class);

    public Homepage() {
        super();
        url = Properties.getUrl();
        setDefaultBaseUrl(url);
    }

    public void openHomepage() {
        getDriver().manage().window().maximize();
        openAt(url);
    }

    public void goToRegisterPage() {
        waitFor(getStartedButton).click();
    }

    public void goToLoginPage() {
        waitFor(loginLink).click();
    }

    public boolean isUserOnHomepage() {
        return isElementVisible(By.cssSelector(".container.Teaser"));
    }

    @Override
    public final void setDefaultBaseUrl(String defaultBaseUrl) {
        if (defaultBaseUrl == null) {
            return;
        }
        super.setDefaultBaseUrl(defaultBaseUrl);
    }
}
