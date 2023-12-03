package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        //https://tms41-dev-ed.my.salesforce.com/
        //drak@tms.sandbox
        //Password01!!
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oneUserProfileCardTrigger")));
        //driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        //driver.findElement(By.cssSelector("[title=New]")).click();

        loginPage.open();
        loginPage.login("drak@tms.sandbox","Password01!!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        accountPage.open();
        accountPage.createAccount(
                "ann " + System.currentTimeMillis(),
                "12346789",
                "Hot",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ",",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );

    }
}
/*Написать тесты на создание Account и Contact.
 Код из класса при этом правильно разместить в Page Object. */