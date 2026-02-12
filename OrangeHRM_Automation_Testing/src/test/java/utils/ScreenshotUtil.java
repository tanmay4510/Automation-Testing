package utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static String capture(WebDriver driver, String name) {

        String path = System.getProperty("user.dir") +
                "/screenshots/" + name + "_" + System.currentTimeMillis() + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}
