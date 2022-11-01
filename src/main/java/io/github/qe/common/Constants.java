package io.github.qe.common;


import io.github.cozyloon.EzConfig;

public class Constants {
    public static final String WEB_USERNAME = EzConfig.getProperty("web_username");
    public static final String WEB_PASSWORD = EzConfig.getProperty("web_password");
    public static final String URL = EzConfig.getProperty("url");
    public static final String BROWSER = EzConfig.getProperty("browser");
}
