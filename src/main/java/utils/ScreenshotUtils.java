package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    // 📸 Save screenshot to file and return file path
    public static String takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") + "/target/screenshots/" + screenshotName + dateName + ".png";
            File finalDestination = new File(destination);
            finalDestination.getParentFile().mkdirs(); // Create folder if not exists
            Files.copy(source.toPath(), finalDestination.toPath());
            return destination;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 📸 Return screenshot as byte array for attaching in reports
    public static byte[] getScreenshotAsBytes(WebDriver driver) {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}