package com.demo.ui.test.android;

import com.demo.ui.test.pageobjects.MyListsPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidMyListsPageObject extends MyListsPageObject {

    static {
        ARTICLE_BY_TITLE_TPL = "//*[@text='{TITLE}']";
        FOLDER_OPTIONS = By.id("org.wikipedia:id/item_overflow_menu");
        DELETE_FOLDER = By.xpath("//*[@resource-id='org.wikipedia:id/title'][@text='Delete list']");
    }

    public AndroidMyListsPageObject(AppiumDriver driver) {
        super(driver);
    }
}
