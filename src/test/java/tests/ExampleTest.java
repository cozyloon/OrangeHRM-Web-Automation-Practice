package tests;

import io.github.qe.functions.Home;
import io.github.qe.functions.Login;
import dataProvider.TestData;
import org.testng.annotations.Test;
import util.TestBase;

import static io.github.qe.data.AssertionErrorMessages.*;

public class ExampleTest extends TestBase {
    @Test(description = "TC_1", priority = 1, alwaysRun = true, dataProvider = "dataProviderForLogin", dataProviderClass = TestData.class)
    public void testSuccessfulUserLogin(String username, String password) {
        Login.userLogin(username, password);
        softAssert.assertEquals(Home.homePageLogoIsDisplayed(), true, HOMEPAGE_LOGO_NOT_DISPLAYED);
        softAssert.assertAll();
    }
}
