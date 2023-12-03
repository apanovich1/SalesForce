package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    final String BASE_URL = "https://tms41-dev-ed.my.salesforce.com/";
    WebDriverWait wait;

    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    void write(String label, String text) {
        driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-input//input", label)))
                .sendKeys(text);
    }
}