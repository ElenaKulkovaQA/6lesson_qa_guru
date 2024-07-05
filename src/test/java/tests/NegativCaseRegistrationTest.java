package tests;

import org.junit.jupiter.api.Test;
import pages.components.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NegativCaseRegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void checkValidstionTest() {
        registrationPage.openPage();
        registrationPage.closeBanner()

                .submit();

        $("#firstName").shouldNotHave(text("abc"));
        $("#lastName").shouldNotHave(text("abc"));
        $("#genterWrapper").shouldNotHave(text("abc"));
        $("#userNumber").shouldNotHave(text("abc"));

    }
}