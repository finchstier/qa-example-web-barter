package co.getbarter.qa.pages;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterPage.class);

    public RegisterPage() {

    }

    public String getRegisterPageUrl() {
        registerFieldset.waitForCondition().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".waves-effect.btn.primary")));
        return getDriver().getCurrentUrl();
    }
}
