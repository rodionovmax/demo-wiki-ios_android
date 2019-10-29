package com.demo.ui.test.pageobjects;

import com.demo.ui.test.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPageObject extends MainPageObject {

    public LoginPageObject(AppiumDriver driver) {
        super(driver);
    }

    public static final By USERNAME_FIELD = By.xpath("//XCUIElementTypeTextField[@value='enter username']");
    public static final By PASSWORD_FIELD = By.xpath("//XCUIElementTypeSecureTextField[@value='enter password']");
    public static final By LOGIN_BUTTON = By.id("Log in");

    public void loginIntoAccount(String username, String password) {
        waitForElementAndSendKeys(USERNAME_FIELD, username, 5);
        waitForElementAndSendKeys(PASSWORD_FIELD, password, 5);
        waitForElementAndClick(LOGIN_BUTTON, 5);
    }
}
