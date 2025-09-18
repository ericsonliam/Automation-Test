package TestSteps;

import TestXpath.SwagLabs;
import helpers.check.CheckHelper;
import helpers.click.ClickHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;





public class SwagLabsStep {


    private static final Logger LOGGER = LoggerFactory.getLogger(SwagLabsStep.class);

    private ClickHelper clickHelper;
    private CheckHelper checkHelper;
    private SwagLabs swagLabs;
    private WebDriver driver;

    public SwagLabsStep(WebDriver driver, ClickHelper clickHelper, CheckHelper checkHelper, SwagLabs swagLabs) {
        this.clickHelper = clickHelper;
        this.checkHelper = checkHelper;
        this.swagLabs = swagLabs;
        this.driver = driver;
    }


    public void enterUsernameAndPassword(String username, String password) {
        LOGGER.info("Entering SwagLabs username and password");
        swagLabs.getUsernameInput().clear();
        swagLabs.getUsernameInput().sendKeys(username);
        swagLabs.getPasswordInput().clear();
        swagLabs.getPasswordInput().sendKeys(password);
    }


    public void checkswagLabsLoginHeader() {
        LOGGER.info("Check SwagLabs Login Header");
        checkHelper.isElementDisplayed(swagLabs.swagLabsLoginHeader);
    }

    public void checkswagLabsusernameInput() {
        LOGGER.info("Check SwagLabs Username");
        checkHelper.isElementDisplayed(swagLabs.swagLabsusernameInput);
    }

    public void clickswagLabsusernameInput() {
        LOGGER.info("Click SwagLabs Username Input");
        clickHelper.click(swagLabs.swagLabsusernameInput);
    }

    public void checkswagLabspasswordInput() {
        LOGGER.info("Check SwagLabs Password Input is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabspasswordInput);
    }

    public void clickswagLabspasswordInput() {
        LOGGER.info("Click SwagLabs Password Input");
        clickHelper.click(swagLabs.swagLabspasswordInput);
    }

    public void checkswagLabsLoginButton() {
        LOGGER.info("Check SwagLabs Login Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsLoginButton);
    }

    public void clickswagLabsLoginButton() {
        LOGGER.info("Click SwagLabs Login Button");
        clickHelper.click(swagLabs.swagLabsLoginButton);
    }

    public void checkswagLabsProductsPage() {
        LOGGER.info("Check SwagLabs Products Page is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsProductsPage);
    }

    public void checkSwagLabsFilterDropdown() {
        LOGGER.info("Check SwagLabs Filter Dropdown is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFiltderDropdown);
    }

    public void clickSwagLabsFilterDropdown() {
        LOGGER.info("Click SwagLabs Filter Dropdown");
        clickHelper.click(swagLabs.swagLabsFiltderDropdown);
    }

    public void checkSwagLabsFilterNameAToZ() {
        LOGGER.info("Check SwagLabs Filter Name A to Z is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterNameAToZ);
    }

    public void clickSwagLabsFilterNameAToZ() {
        LOGGER.info("Click SwagLabs Filter Name A to Z");
        clickHelper.click(swagLabs.swagLabsFilterNameAToZ);
    }

    public void checkSwagLabsFilterNameZToA() {
        LOGGER.info("Check SwagLabs Filter Name Z to A is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterNameZToA);
    }

    public void clickSwagLabsFilterNameZToA() {
        LOGGER.info("Click SwagLabs Filter Name Z to A");
        clickHelper.click(swagLabs.swagLabsFilterNameZToA);
    }

    public void checkSwagLabsFilterPriceLowToHigh() {
        LOGGER.info("Check SwagLabs Filter Price Low to High is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterPriceLowToHigh);
    }

    public void clickSwagLabsFilterPriceLowToHigh() {
        LOGGER.info("Click SwagLabs Filter Price Low to High");
        clickHelper.click(swagLabs.swagLabsFilterPriceLowToHigh);
    }

    public void checkSwagLabsFilterPriceHighToLow() {
        LOGGER.info("Check SwagLabs Filter Price High to Low is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterPriceHighToLow);
    }

    public void clickSwagLabsFilterPriceHighToLow() {
        LOGGER.info("Click SwagLabs Filter Price High to Low");
        clickHelper.click(swagLabs.swagLabsFilterPriceHighToLow);
    }

    public static void clickRandomAddToCart(WebDriver driver) {
        List<WebElement> addToCartButtons = driver.findElements(
                By.xpath("//div[@class='inventory_list']//button[contains(@class, 'btn_inventory')]")
        );

        if (addToCartButtons.isEmpty()) {
            System.out.println("❌ No 'Add to Cart' buttons found.");
            return;
        }

        int randomIndex = new Random().nextInt(addToCartButtons.size());
        WebElement randomButton = addToCartButtons.get(randomIndex);

        randomButton.click();
        System.out.println("✅ Clicked random Add to Cart button at index: " + randomIndex);
    }

    public void checkSwagLabsShoppingCartIcon() {
        LOGGER.info("Check SwagLabs Shopping Cart Icon is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsShoppingCartIcon);
    }


    public void clickSwagLabsShoppingCartIcon() {
        LOGGER.info("Click SwagLabs Shopping Cart Icon");
        clickHelper.click(swagLabs.swagLabsShoppingCartIcon);
    }

    public void checkSwagLabsCheckoutButton() {
        LOGGER.info("Check SwagLabs Checkout Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsCheckoutButton);
    }

    public void clickSwagLabsCheckoutButton() {
        LOGGER.info("Click SwagLabs Checkout Button");
        clickHelper.click(swagLabs.swagLabsCheckoutButton);
    }


    public void inputSwagLabsFirstName(String text) {
        LOGGER.info("Input '{}' into SwagLabs First Name field", text);
        swagLabs.swagLabsFirstNameInput.clear();
        swagLabs.swagLabsFirstNameInput.sendKeys(text);
    }

    public void inputSwagLabsLastName(String text) {
        LOGGER.info("Input '{}' into SwagLabs Last Name field", text);
        swagLabs.swagLabsLastNameInput.clear();
        swagLabs.swagLabsLastNameInput.sendKeys(text);
    }

    public void inputSwagLabsZipCode(String text) {
        LOGGER.info("Input '{}' into SwagLabs Zip Code field", text);
        swagLabs.swagLabsZipCodeInput.clear();
        swagLabs.swagLabsZipCodeInput.sendKeys(text);
    }

    public void checkSwagLabsCancelButton() {
        LOGGER.info("Check SwagLabs Cancel Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsCancelButton);
    }

    public void clickSwagLabsCancelButton() {
        LOGGER.info("Click SwagLabs Cancel Button");
        clickHelper.click(swagLabs.swagLabsCancelButton);
    }

    public void checkSwagLabsContinueButton() {
        LOGGER.info("Check SwagLabs Continue Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsContinueButton);
    }

    public void clickSwagLabsContinueButton() {
        LOGGER.info("Click SwagLabs Continue Button");
        clickHelper.click(swagLabs.swagLabsContinueButton);
    }

    public void checkSwagLabsFinishButton() {
        LOGGER.info("Check SwagLabs Finish Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFinishButton);
    }

    public void clickSwagLabsFinishButton() {
        LOGGER.info("Click SwagLabs Finish Button");
        clickHelper.click(swagLabs.swagLabsFinishButton);
    }

    public void checkswagLabsTwitterIcon() {
        LOGGER.info("Check SwagLabs Twitter Icon is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsTwitterIcon);
    }

    public void clickswagLabsTwitterIcon() {
        LOGGER.info("Click SwagLabs Twitter Icon(raw click)");
        clickHelper.click(swagLabs.swagLabsTwitterIcon);
    }

    public void checkswagLabsFacebookIcon() {
        LOGGER.info("Check SwagLabs Facebook Icon is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFacebookIcon);
    }

    public void clickswagLabsFacebookIcon() {
        LOGGER.info("Click SwagLabs Facebook Icon");
        clickHelper.click(swagLabs.swagLabsFacebookIcon);
    }

    public void checkswagLabsLinkedInIcon() {
        LOGGER.info("Check SwagLabs LinkedIn Icon is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsLinkedInIcon);
    }

    public void clickswagLabsLinkedInIcon() {
        LOGGER.info("Click SwagLabs LinkedIn Icon");
        clickHelper.click(swagLabs.swagLabsLinkedInIcon);
    }

    public void handleTwitterWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);

                LOGGER.info("Switched to Twitter window: " + driver.getTitle());
                LOGGER.info("Twitter URL: " + driver.getCurrentUrl());

                try {
                    Thread.sleep(1000); // wait 1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                driver.close();
                LOGGER.info("Closed Twitter window");

                driver.switchTo().window(parentWindow);
                LOGGER.info("Returned to main window: " + driver.getTitle());
            }
        }
    }

}