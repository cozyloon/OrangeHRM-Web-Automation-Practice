package io.github.qe.functions;

import io.github.qe.pages.HomePage;

public class Home {
    private static HomePage homePage = new HomePage();

    public static boolean homePageLogoIsDisplayed() {
        return homePage.logoIsDisplayed();
    }
}
