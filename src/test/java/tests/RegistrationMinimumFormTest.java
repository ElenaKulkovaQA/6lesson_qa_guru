package tests;

import org.junit.jupiter.api.Test;
import pages.components.CheckResultComponent;
import pages.components.RegistrationPage;

public class RegistrationMinimumFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    CheckResultComponent results = new CheckResultComponent();

    @Test
    void minimumRegistrationPagesTest(){

        registrationPage.openPage();
        registrationPage.closeBanner()

                .setFirstName("Elena")
                .setLastName("Ku")
                .setUserNumber("8999111663")
                .setGender("Female")
                .setDateOfBirth("30", "December", "1986")
                .submit();

        results
                .checkResult("Student Name", "Elena Ku")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "8999111663")
                .checkResult("Date of Birth", "30 December,1986");
}
}
