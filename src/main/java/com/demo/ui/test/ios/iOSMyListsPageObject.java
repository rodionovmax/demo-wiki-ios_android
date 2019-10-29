package com.demo.ui.test.ios;

import com.demo.ui.test.pageobjects.MyListsPageObject;
import io.appium.java_client.AppiumDriver;

public class iOSMyListsPageObject extends MyListsPageObject {

    static {
        ARTICLE_BY_TITLE_TPL = "//XCUIElementTypeLink[contains(@name,'{TITLE}')]/..";
    }

    public iOSMyListsPageObject(AppiumDriver driver) {
        super(driver);
    }
}
