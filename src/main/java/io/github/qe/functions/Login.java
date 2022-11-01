package io.github.qe.functions;

import io.github.qe.pages.LoginPage;

public class Login {
    private static LoginPage loginPage = new LoginPage();

    public static void userLogin(String username, String password) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginBtn();
    }
}
