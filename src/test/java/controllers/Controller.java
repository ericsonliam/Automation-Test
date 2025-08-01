package controllers;

import org.openqa.selenium.WebDriver;

public class Controller {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }
}