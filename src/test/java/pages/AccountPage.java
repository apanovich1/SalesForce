package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wrappers.Input;
import wrappers.MultiSelect;
import wrappers.PickList;
import wrappers.TextArea;

import java.lang.String;

public class AccountPage extends BasePage {
    WebDriver driver = new ChromeDriver();

    public AccountPage(WebDriver driver) {

        super(driver);
    }

    public void open() {

        driver.get(BASE_URL+"lightning/o/Account/new");
    }

    public void enterAccountName(String accountName) {
        new Input(driver, "Account Name").write(accountName);
    }

    public void enterAccountNumber(String accountNumber) {

        new Input(driver, "Account Number").write(accountNumber);
    }

    public void selectType(String type) {

        new PickList(driver, "Type").select(type);
    }

    public void selectIndustry(String industry) {

        new PickList(driver, "Industry").select(industry);
    }
    public void selectRating(String rating) {

        new PickList(driver, "Rating").select(rating);
    }

    public void selectOwnership(String ownership) {

        new PickList(driver, "Ownership").select(ownership);
    }

    public void selectCustomerPriority(String customerPriority) {

        new PickList(driver, "Customer Priority").select(customerPriority);
    }

    public void selectSLA(String sla) {

        new PickList(driver, "SLA").select(sla);
    }

    public void selectUpsellOpportunity(String upsellOpportunity) {

        new PickList(driver, "Upsell Opportunity").select(upsellOpportunity);
    }

    public void selectActive(String active) {

        new PickList(driver, "Active").select(active);
    }

    public void enterAccountSite(String accountSite){
        new Input (driver,"Account Site").write(accountSite);
    }

    public void enterAnnualRevenue(String accountAnnualRevenue){
        new Input(driver, "Annual Revenue").write(accountAnnualRevenue);
    }

    public void enterPhone(String accountPhone){
        new Input(driver, "Phone").write(accountPhone);
    }

    public void enterFax(String accountFax){
        new Input(driver, "Fax").write(accountFax);
    }

    public void enterWebsite(String accountWebsite){
        new Input(driver, "Website").write(accountWebsite);
    }

    public void enterTickerSymbol(String accountTickerSymbol){
        new Input(driver, "Ticker Symbol").write(accountTickerSymbol);
    }

    public void enterEmployees(String accountEmployees){
        new Input(driver, "Employees").write(accountEmployees);
    }

    public void enterSIC(String accountSIC){
        new Input(driver, "SIC Code").write(accountSIC);
    }
    public void enterSLADate(String accountSLADate){
        new Input(driver, "SLA Expiration Date").write(accountSLADate);
    }

    public void enterSLANumber(String accountSLASerialNumber){
        new Input(driver, "SLA Expiration Date").write(accountSLASerialNumber);
    }

    public void enterNumberOfLocations(String accountNumberOfLocations){
        new Input(driver, "SLA Expiration Date").write(accountNumberOfLocations);
    }

    public void enterBillingStreet(String accountBillingStreet){
        new TextArea(driver, "Billing Street").write(accountBillingStreet);
    }

    public void enterBillingCity(String accountBillingCity){
        new TextArea(driver, "Billing City").write(accountBillingCity);
    }

    public void enterBillingState(String accountBillingState){
        new TextArea(driver, "Billing State/Province").write(accountBillingState);
    }

    public void enterBillingZip(String accountBillingZip){
        new TextArea(driver, "Billing Zip/Postal Code").write(accountBillingZip);
    }

    public void enterBillingCountry(String accountBillingCountry){
        new TextArea(driver, "Billing Country").write(accountBillingCountry);
    }

    public void enterShippingStreet(String accountShippingStreet){
        new TextArea(driver, "Shipping Street").write(accountShippingStreet);
    }

    public void enterShippingCity(String accountShippingCity){
        new TextArea(driver, "Shipping City").write(accountShippingCity);
    }

    public void enterShippingState(String accountShippingState){
        new TextArea(driver, "Shipping State/Province").write(accountShippingState);
    }

    public void enterShippingZip(String accountShippingZip){
        new TextArea(driver, "Shipping Zip/Postal Code").write(accountShippingZip);
    }

    public void enterShippingCountry(String accountShippingCountry){
        new TextArea(driver, "Shipping Country").write(accountShippingCountry);
    }

    public void enterDescription(String accountDescription){
        new TextArea(driver, "Description").write(accountDescription);
    }

    public void multiselect (String multiselectOption){
        new MultiSelect(driver,"Yes").select(multiselectOption);
    }
    public void clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }

    public void createAccount(String accountName,
                              String accountNumber,
                              String rating,
                              String ownership,
                              String customerPriority,
                              String sla,
                              String upsellOpportunity,
                              String active,
                              String accountSite,
                              String accountFax,
                              String accountPhone,
                              String accountAnnualRevenue,
                              String accountWebsite,
                              String accountTickerSymbol,
                              String accountEmployees,
                              String accountSIC,
                              String accountSLADate,
                              String accountSLASerialNumber,
                              String accountNumberOfLocations,
                              String accountBillingStreet,
                              String accountBillingCity,
                              String accountBillingState,
                              String accountBillingZip,
                              String accountBillingCountry,
                              String accountShippingStreet,
                              String accountShippingCity,
                              String accountShippingState,
                              String accountShippingZip,
                              String accountShippingCountry,
                              String accountDesciption,
                              String multiselectOption

                              ) {
        enterAccountName(accountName);
        enterAccountNumber(accountNumber);
        selectRating(rating);
        selectOwnership(ownership);
        selectCustomerPriority(customerPriority);
        selectSLA(sla);
        selectUpsellOpportunity(upsellOpportunity);
        selectActive(active);
        enterAccountSite(accountSite);
        enterFax(accountFax);
        enterPhone(accountPhone);
        enterAnnualRevenue(accountAnnualRevenue);
        enterWebsite(accountWebsite);
        enterTickerSymbol(accountTickerSymbol);
        enterEmployees(accountEmployees);
        enterSIC(accountSIC);
        enterSLADate(accountSLADate);
        enterSLANumber(accountSLASerialNumber);
        enterNumberOfLocations(accountNumberOfLocations);
        enterBillingStreet(accountBillingStreet);
        enterBillingCity(accountBillingCity);
        enterBillingState(accountBillingState);
        enterBillingZip(accountBillingZip);
        enterBillingCountry(accountBillingCountry);
        enterShippingStreet(accountShippingStreet);
        enterShippingCity(accountShippingCity);
        enterShippingState(accountShippingState);
        enterShippingZip(accountShippingZip);
        enterShippingCountry(accountShippingCountry);
        enterDescription(accountDesciption);
        multiselect(multiselectOption);

        clickSaveButton();
    }
}

