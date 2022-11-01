package io.github.qe.pages;

import io.github.qe.util.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private By txtUserName = By.name("username");
    private By txtPassword = By.name("password");
    private By btnLogin = By.xpath("//button[@type='submit']");

    public void setUsername(String username) {
        WebElement element = new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtUserName));
        element.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement element = new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtPassword));
        element.sendKeys(password);
    }

    public void clickLoginBtn() {
        DriverSetup.driver.findElement(btnLogin).click();
    }
}
