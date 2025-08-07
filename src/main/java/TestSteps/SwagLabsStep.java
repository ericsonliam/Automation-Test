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



public class SwagLabsStep {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwagLabsStep.class);

    private ClickHelper clickHelper;
    private CheckHelper checkHelper;
    private SwagLabs swagLabs;

    public SwagLabsStep(ClickHelper clickHelper, CheckHelper checkHelper, SwagLabs swagLabs) {
        this.clickHelper = clickHelper;
        this.checkHelper = checkHelper;
        this.swagLabs = swagLabs;
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
        checkHelper.clickElement(swagLabs.swagLabsusernameInput);
    }

    public void checkswagLabspasswordInput() {
        LOGGER.info("Check SwagLabs Password Input is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabspasswordInput);
    }

    public void clickswagLabspasswordInput() {
        LOGGER.info("Click SwagLabs Password Input");
        checkHelper.clickElement(swagLabs.swagLabspasswordInput);
    }

    public void checkswagLabsLoginButton() {
        LOGGER.info("Check SwagLabs Login Button is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsLoginButton);
    }

    public void clickswagLabsLoginButton() {
        LOGGER.info("Click SwagLabs Login Button");
        checkHelper.clickElement(swagLabs.swagLabsLoginButton);
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
        checkHelper.clickElement(swagLabs.swagLabsFiltderDropdown);
    }

    public void checkSwagLabsFilterNameAToZ() {
        LOGGER.info("Check SwagLabs Filter Name A to Z is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterNameAToZ);
    }

    public void clickSwagLabsFilterNameAToZ() {
        LOGGER.info("Click SwagLabs Filter Name A to Z");
        checkHelper.clickElement(swagLabs.swagLabsFilterNameAToZ);
    }

    public void checkSwagLabsFilterNameZToA() {
        LOGGER.info("Check SwagLabs Filter Name Z to A is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterNameZToA);
    }

    public void clickSwagLabsFilterNameZToA() {
        LOGGER.info("Click SwagLabs Filter Name Z to A");
        checkHelper.clickElement(swagLabs.swagLabsFilterNameZToA);
    }

    public void checkSwagLabsFilterPriceLowToHigh() {
        LOGGER.info("Check SwagLabs Filter Price Low to High is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterPriceLowToHigh);
    }

    public void clickSwagLabsFilterPriceLowToHigh() {
        LOGGER.info("Click SwagLabs Filter Price Low to High");
        checkHelper.clickElement(swagLabs.swagLabsFilterPriceLowToHigh);
    }

    public void checkSwagLabsFilterPriceHighToLow() {
        LOGGER.info("Check SwagLabs Filter Price High to Low is displayed");
        checkHelper.isElementDisplayed(swagLabs.swagLabsFilterPriceHighToLow);
    }

    public void clickSwagLabsFilterPriceHighToLow() {
        LOGGER.info("Click SwagLabs Filter Price High to Low");
        checkHelper.clickElement(swagLabs.swagLabsFilterPriceHighToLow);
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



}