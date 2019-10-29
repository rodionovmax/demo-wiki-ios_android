package com.demo.ui.test.ios;

import com.demo.ui.test.pageobjects.SearchPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class iOSSearchPageObject extends SearchPageObject {

    static
    {
        SEARCH_INIT_ELEMENT = By.xpath("//XCUIElementTypeSearchField[@name='Search Wikipedia']");
        SEARCH_INPUT = By.xpath("//XCUIElementTypeNavigationBar[@name='Wikipedia, scroll to top of Explore']");
        SEARCH_RESULT_BY_SUBSTRING_TPL = "//XCUIElementTypeLink[contains(@name, '{SUBSTRING}')]";
    }

    public iOSSearchPageObject(AppiumDriver driver) {
        super(driver);
    }
}
