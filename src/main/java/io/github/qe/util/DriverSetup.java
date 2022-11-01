package io.github.qe.util;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.qe.common.Constants;
import org.openqa.selenium.WebDriver;


public class DriverSetup {
    public static WebDriver driver;

    public static void launchDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver=WebDriverManager.edgedriver().create();
        }
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    public static void closeDriver() {
        driver.quit();
    }
}
