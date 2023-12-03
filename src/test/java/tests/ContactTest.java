package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactTest extends BaseTest {

    @Test
    public void createContact() {

        loginPage.open();
        loginPage.login("drak@tms.sandbox","Password01!!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        contactPage.openContact();
        contactPage.createAccount(
                "ann " + System.currentTimeMillis(),
                "12346789",
                "Hot",
                "",
                "",
                "",
                "",
                ""
        );

    }
}
