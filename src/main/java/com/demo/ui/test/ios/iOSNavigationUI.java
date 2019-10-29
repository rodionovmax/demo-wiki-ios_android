package com.demo.ui.test.ios;

import com.demo.ui.test.pageobjects.NavigationUI;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class iOSNavigationUI extends NavigationUI {

    static {
        MY_LISTS_LINK = By.id("Saved");
    }

    public iOSNavigationUI(AppiumDriver driver) {
        super(driver);
    }
}
