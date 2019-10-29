package com.demo.ui.test.pageobjects;

import com.demo.ui.test.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WelcomePageObject extends MainPageObject {

    public WelcomePageObject(AppiumDriver driver) {
        super(driver);
    }

    public static final By SKIP = By.id("Skip");


    public void clickSkip(){
        waitForElementAndClick(SKIP, 5);
    }
}
