package com.demo.ui.test.pageobjects;

import com.demo.ui.test.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject {

    public NavigationUI(AppiumDriver driver) {
        super(driver);
    }

    public static By MY_LISTS_LINK;

    public void ClickMyList() {
        waitForElementAndClick(MY_LISTS_LINK, 5);
    }
}
