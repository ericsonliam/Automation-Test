package helpers.click;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ClickHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ClickHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(WebElement element) {
        try {
            // ✅ Wait until clickable
            wait.until(ExpectedConditions.elementToBeClickable(element));

            // ✅ Scroll into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            // ✅ Try normal Selenium click
            element.click();

            System.out.println("Clicked element successfully: " + element.toString());

        } catch (Exception e) {
            // ✅ If normal click fails, use JS click as fallback
            System.out.println("Normal click failed, trying JS click for element: " + element.toString());
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}