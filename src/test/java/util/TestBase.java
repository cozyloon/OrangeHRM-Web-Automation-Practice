package util;

import io.github.qe.util.DriverSetup;
import io.github.cozyloon.EzConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import static io.github.qe.common.Constants.BROWSER;

public class TestBase {
    public SoftAssert softAssert;

    @BeforeMethod
    public void launchDriver() {
        DriverSetup.launchDriver(BROWSER);
        EzConfig.logINFO("TestClass Running" + this.getClass().toString());
        this.softAssert = new SoftAssert();
    }

    @AfterMethod
    public void closeDriver() {
        DriverSetup.closeDriver();
    }
}
