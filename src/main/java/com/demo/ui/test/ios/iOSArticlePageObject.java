package com.demo.ui.test.ios;

import com.demo.ui.test.pageobjects.ArticlePageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class iOSArticlePageObject extends ArticlePageObject {

    static {
        SEARCH_INPUT = "{SUBSTRING}";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = By.xpath("//XCUIElementTypeButton[@name='Save for later']");
        CLOSE_ARTICLE_BUTTON = By.id("Back");
        ENABLE_SYNCING_BUTTON = By.id("Enable syncing");

    }

    public iOSArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
