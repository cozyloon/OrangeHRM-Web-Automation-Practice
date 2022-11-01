package io.github.qe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.github.qe.util.DriverSetup.driver;

public class HomePage {
    private By imgLogo = By.xpath("//img[@alt='client brand banner']");

    public boolean logoIsDisplayed() {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(imgLogo));
        return element.isDisplayed();
    }
}
