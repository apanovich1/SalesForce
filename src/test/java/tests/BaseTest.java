package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.AccountPage;
import pages.ContactPage;
import pages.LoginPage;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;

    LoginPage loginPage;

    AccountPage accountPage;

    ContactPage contactPage;


    @Parameters({"browser"})
    @BeforeMethod(description = "Browser set up")
    public void setUp(@Optional("chrome") String browser) {
        System.out.println(System.getProperty("hi"));
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("headless");
            this.driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver);

        accountPage = new AccountPage(driver);

        contactPage = new ContactPage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Browser out")
    public void tearDown() {

        this.driver.quit();
    }
}