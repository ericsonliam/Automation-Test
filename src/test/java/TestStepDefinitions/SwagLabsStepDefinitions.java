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

    @Given("User is on SwagLabs login page")
    public void user_is_on_swag_labs_login_page() {
        System.out.println("Opening SwagLabs login page...");
        driver.get("https://www.saucedemo.com/");
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





}