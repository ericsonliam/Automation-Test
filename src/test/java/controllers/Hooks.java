package controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("✅ Browser setup starting...");

        // Setup Chrome driver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        System.out.println("✅ Browser launched successfully");
    }

    @After
    public void tearDown() {
        System.out.println("⏹️ Closing browser...");
        if (driver != null) {
            driver.quit();
            System.out.println("✅ Browser closed");
        }
    }
}