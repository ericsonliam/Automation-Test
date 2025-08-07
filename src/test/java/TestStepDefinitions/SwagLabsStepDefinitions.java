package TestStepDefinitions;

import controllers.Hooks;
import TestSteps.SwagLabsStep;
import TestXpath.SwagLabs;
import helpers.check.CheckHelper;
import helpers.click.ClickHelper;
import io.cucumber.java.en.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.And;

public class SwagLabsStepDefinitions {

    SwagLabsStep swagLabsStep;

    public SwagLabsStepDefinitions() {
        this.swagLabsStep = new SwagLabsStep(
                new ClickHelper(Hooks.driver),
                new CheckHelper(Hooks.driver),
                new SwagLabs(Hooks.driver)
        );
    }

    @After
    public void afterScenario(Scenario scenario) {
        WebDriver driver = Hooks.driver;
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
    }

    public class CommonSteps {

        @And("I wait for {int} seconds")
        public void i_wait_for_seconds(int seconds) throws InterruptedException {
            Thread.sleep(seconds * 1000);
        }
    }

    @And("^I wait for (\\d+) seconds$")
    public void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Given("User is on SwagLabs login page")
    public void user_is_on_swag_labs_login_page() {
        System.out.println("Opening SwagLabs login page...");
        Hooks.driver.get("https://www.saucedemo.com/");
    }

    @Then("Check SwagLabs Login Header")
    public void check_login_header() {
        System.out.println("✅ Step reached: Check SwagLabs Login Header");
        // your test logic
    }

    @And("Check SwagLabs Username Input")
    public void checkSwagLabsUsernameInput() {
        swagLabsStep.checkswagLabsusernameInput();
    }

    @And("Click SwagLabs Username Input")
    public void clickSwagLabsUsernameInput() {
        swagLabsStep.clickswagLabsusernameInput();
    }

    @And("Check SwagLabs Password Input")
    public void checkSwagLabsPasswordInput() {
        swagLabsStep.checkswagLabspasswordInput();
    }

    @And("Click SwagLabs Password Input")
    public void clickSwagLabsPasswordInput() {
        swagLabsStep.clickswagLabspasswordInput();
    }

    @And("Check SwagLabs Login Button is displayed")
    public void checkSwagLabsLoginButton() {
        swagLabsStep.checkswagLabsLoginButton();
    }

    @And("Click SwagLabs Login Button")
    public void clickSwagLabsLoginButton() {
        swagLabsStep.clickswagLabsLoginButton();
    }

    @And("Input SwagLabs Username and Password")
    public void inputUsernameAndPassword() {
        swagLabsStep.enterUsernameAndPassword("standard_user", "secret_sauce");
    }

    @And("SwagLabs Products Page is displayed")
    public void checkSwagLabsProductsPage() {
        swagLabsStep.checkswagLabsProductsPage();
    }

    @And("SwagLabs Filter Dropdown is displayed")
    public void checkSwagLabsFilterDropdown() { swagLabsStep.checkSwagLabsFilterDropdown(); }

    @And("Click SwagLabs Filter Dropdown")
    public void clickSwagLabsFilterDropdown() { swagLabsStep.clickSwagLabsFilterDropdown(); }

    @And("SwagLabs Filter Name A to Z is displayed")
    public void checkSwagLabsFilterNameAToZ() { swagLabsStep.checkSwagLabsFilterNameAToZ(); }

    @And("Click SwagLabs Filter Name A to Z")
    public void clickSwagLabsFilterNameAToZ() { swagLabsStep.clickSwagLabsFilterNameAToZ(); }

    @And("SwagLabs Filter Name Z to A is displayed")
    public void checkSwagLabsFilterNameZToA() { swagLabsStep.checkSwagLabsFilterNameZToA(); }

    @And("Click SwagLabs Filter Name Z to A")
    public void clickSwagLabsFilterNameZToA() { swagLabsStep.clickSwagLabsFilterNameZToA(); }

    @And("SwagLabs Filter Price Low to High is displayed")
    public void checkSwagLabsFilterPriceLowToHigh() { swagLabsStep.checkSwagLabsFilterPriceLowToHigh(); }

    @And("Click SwagLabs Filter Price Low to High")
    public void clickSwagLabsFilterPriceLowToHigh() { swagLabsStep.clickSwagLabsFilterPriceLowToHigh(); }

    @And("SwagLabs Filter Price High to Low is displayed")
    public void checkSwagLabsFilterPriceHighToLow() { swagLabsStep.checkSwagLabsFilterPriceHighToLow(); }

    @And("Click SwagLabs Filter Price High to Low")
    public void clickSwagLabsFilterPriceHighToLow() { swagLabsStep.clickSwagLabsFilterPriceHighToLow(); }

    @And("I click a random Add to Cart button")
    public void clickRandomAddToCart() {
        SwagLabsStep.clickRandomAddToCart(Hooks.driver);
    }

    @And("SwagLabs Shopping Cart Icon is displayed")
    public void clickCartIcon() {
        swagLabsStep.checkSwagLabsShoppingCartIcon();
    }

    @And("Click SwagLabs Shopping Cart Icon")
    public void clickCartIconButton() {
        swagLabsStep.clickSwagLabsShoppingCartIcon();
    }

    @And("SwagLabs Checkout Button is displayed")
    public void checkSwagLabsCheckoutButton() {
        swagLabsStep.checkSwagLabsCheckoutButton();
    }

    @And("Click SwagLabs Checkout Button")
    public void clickSwagLabsCheckoutButton() {
        swagLabsStep.clickSwagLabsCheckoutButton();
    }


    @And("I input {string} in the First Name field")
    public void iInputTextInFirstNameField(String text) {
        swagLabsStep.inputSwagLabsFirstName(text);
    }

    @And("I input {string} in the Last Name field")
    public void iInputTextInLastNameField(String text) {
        swagLabsStep.inputSwagLabsLastName(text);
    }

    @And("I input {string} in the Zip Code field")
    public void iInputTextInZipCodeField(String text) {
        swagLabsStep.inputSwagLabsZipCode(text);
    }

    @And("SwagLabs Cancel Button is displayed")
    public void checkSwagLabsCancelButton() {
        swagLabsStep.checkSwagLabsCancelButton();
    }

    @And("Click SwagLabs Cancel Button")
    public void clickSwagLabsCancelButton() {
        swagLabsStep.clickSwagLabsCancelButton();
    }

    @And("SwagLabs Continue Button is displayed")
    public void checkSwagLabsContinueButton() {
        swagLabsStep.checkSwagLabsContinueButton();
    }

    @And("Click SwagLabs Continue Button")
    public void clickSwagLabsContinueButton() {
        swagLabsStep.clickSwagLabsContinueButton();

    }

    @And("SwagLabs Finish Button is displayed")
    public void checkSwagLabsFinishButton() {
        swagLabsStep.checkSwagLabsFinishButton();
    }

    @And("Click SwagLabs Finish Button")
    public void clickSwagLabsFinishButton() {
        swagLabsStep.clickSwagLabsFinishButton();
    }



}