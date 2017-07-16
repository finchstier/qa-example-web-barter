package co.getbarter.qa.helper;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.company.CompanyProperties;
import io.codearte.jfairy.producer.person.Person;
import org.apache.commons.lang3.StringUtils;

import static io.codearte.jfairy.producer.person.PersonProperties.withCompany;

public class User {

    private Person person;

    public User() {
        Fairy fairy = Fairy.create();
        Company company = fairy.company();
        person = fairy.person(withCompany(company));
    }

    public String getFirstName() {
        return person.getFirstName();
    }

    public String getLastName() {
        return person.getLastName();
    }

    public String getEmailAddress() {
        return person.getCompanyEmail();
    }

    public String getPassword() {
        return person.getPassword();
    }

    public String getPhoneNumber() {
        return StringUtils.removePattern(person.getTelephoneNumber(), "-");
    }
}
