package co.getbarter.qa.pages;

import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {

    public String getRegisterPageUrl() {
        return getDriver().getCurrentUrl();
    }
}
