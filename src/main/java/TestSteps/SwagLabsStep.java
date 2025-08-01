package TestSteps;

import TestXpath.SwagLabs;
import helpers.check.CheckHelper;
import helpers.click.ClickHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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




}