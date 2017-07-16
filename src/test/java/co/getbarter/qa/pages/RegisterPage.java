package co.getbarter.qa.pages;

import co.getbarter.qa.helper.User;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends PageObject {

    @FindBy(css = "former[_id=register]")
    private WebElementFacade registerFieldset;

    @FindBy(css = "#former-1--register--given_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#former-1--register--family_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#former-1--register--email")
    private WebElementFacade emailField;

    @FindBy(css = "#former-1--register--password")
    private WebElementFacade passwordField;

    @FindBy(css = "#former-1--register--phone_number")
    private WebElementFacade phoneNumberField;

    @FindBy(css = ".waves-effect.btn.primary span")
    private WebElementFacade createAccountButton;

    private User user;
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterPage.class);

    public RegisterPage() {
        user = new User();
    }

    public String getRegisterPageUrl() {
        registerFieldset.waitForCondition().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".waves-effect.btn.primary")));
        return getDriver().getCurrentUrl();
    }

    public void registerUser() {
        typeInto(firstNameField, user.getFirstName());
        typeInto(lastNameField, user.getLastName());
        typeInto(emailField, user.getEmailAddress());
        typeInto(passwordField, user.getPassword() + "$7");
        typeInto(phoneNumberField, user.getPhoneNumber());
        clickCreateAccountButton();
    }

    public void clickCreateAccountButton() {
        clickOn(createAccountButton);
    }
}
