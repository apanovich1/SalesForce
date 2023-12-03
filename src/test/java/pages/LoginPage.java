package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import tests.BaseTest;

public class LoginPage extends BasePage{
    WebDriver driver = new ChromeDriver();
    private final By USERNAME_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {

        super(driver);
    }
    public void open() {

        driver.get(BASE_URL);
    }
    public void login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

        driver.findElement(By.id("username")).sendKeys("drak@tms.sandbox");
        driver.findElement(By.id("password")).sendKeys("Password01!!");
    }
}
