package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wrappers.Input;
import wrappers.MultiSelect;
import wrappers.PickList;
import wrappers.TextArea;

public class ContactPage extends BasePage {
    WebDriver driver = new ChromeDriver();

    public ContactPage(WebDriver driver) {

        super(driver);
    }

    public void openContact() {

        driver.findElement(By.cssSelector(".forceActionLink"));
    }

    public void enterFirstName(String contactName) {

        new Input(driver, "First Name").write(contactName);
    }

    public void enterLastName(String contactLastName) {

        new Input(driver, "Last Name").write(contactLastName);
    }

    public void enterMobile(String contactMobile) {

        new Input(driver, "Mobile").write(contactMobile);
    }

    public void enterPhone(String contactPhone) {

        new Input(driver, "Phone").write(contactPhone);
    }

    public void enterHomePhone(String contactHomePhone) {

        new Input(driver, "Home Phone").write(contactHomePhone);
    }

    public void selectLevel(String contactLevel) {

        new PickList(driver, "Level").select(contactLevel);
    }

    public void multiselect (String multiselectOption){

        new MultiSelect(driver,"Yes").select(multiselectOption);
    }

    public void enterDescription(String contactDescription){
        new TextArea(driver, "Description").write(contactDescription);
    }
    public void clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }

    public void createAccount(String contactFirstName,
                              String contactLastName,
                              String contactMobile,
                              String contactPhone,
                              String contactHomePhone,
                              String contactLevel,
                              String multiselectOption,
                              String contactDescription
                              ) {
        enterFirstName(contactFirstName);
        enterLastName(contactLastName);
        enterMobile(contactMobile);
        enterPhone(contactPhone);
        enterHomePhone(contactHomePhone);

        selectLevel(contactLevel);

        enterDescription(contactDescription);

        multiselect(multiselectOption);

        clickSaveButton();
    }
}

