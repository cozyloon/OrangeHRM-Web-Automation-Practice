package dataProvider;

import org.testng.annotations.DataProvider;

import static io.github.qe.common.Constants.*;

public class TestData {
    @DataProvider
    public Object[][] dataProviderForLogin() {
        Object[][] data = {
                {WEB_USERNAME, WEB_PASSWORD}
        };
        return data;
    }
}
