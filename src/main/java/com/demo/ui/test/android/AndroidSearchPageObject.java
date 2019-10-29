package com.demo.ui.test.android;

import com.demo.ui.test.pageobjects.SearchPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidSearchPageObject extends SearchPageObject {


    static {
        SEARCH_INIT_ELEMENT = By.xpath("//*[contains(@text,'Search Wikipedia')]");
        SEARCH_INPUT = By.id("org.wikipedia:id/search_src_text");
        SEARCH_RESULT_BY_SUBSTRING_TPL = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[contains(@text,'{SUBSTRING}')]";
    }

    public AndroidSearchPageObject(AppiumDriver driver) {
        super(driver);
    }
}
