package controllers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ScreenshotUtils;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("✅ Browser setup starting...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("✅ Browser launched successfully");
    }

    // ✅ Screenshot after each step
    @AfterStep
    public void takeStepScreenshot(Scenario scenario) {
        String screenshotPath = ScreenshotUtils.takeScreenshot(driver, scenario.getName().replace(" ", "_"));
        System.out.println("📸 Step screenshot saved at: " + screenshotPath);

        // Attach screenshot to Cucumber report
        try {
            byte[] screenshotBytes = ScreenshotUtils.getScreenshotAsBytes(driver);
            scenario.attach(screenshotBytes, "image/png", "Step Screenshot");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("⏹️ Closing browser...");
        if (driver != null) {
            driver.quit();
            System.out.println("✅ Browser closed");
        }
    }
}
