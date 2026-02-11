package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static String getProperty(String key) {

        try {
            FileInputStream file =
                    new FileInputStream("src/test/resources/config/config.properties");

            prop = new Properties();
            prop.load(file);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }
}
