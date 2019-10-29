package com.demo.ui.test.pageobjects;

import com.demo.ui.test.MainPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchPageObject extends MainPageObject {

    public SearchPageObject(AppiumDriver driver) {
        super(driver);
    }

    protected static By SEARCH_INIT_ELEMENT;
    protected static By SEARCH_INPUT;
    protected static String SEARCH_RESULT_BY_SUBSTRING_TPL;


    public static String getResultSearchElement(String substring) {
        return SEARCH_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", substring);
    }

    public void initSearchInput() {
        waitForElementAndClick(SEARCH_INIT_ELEMENT, 10);
    }

    public void typeSearchLine(String search_line) {
        waitForElementAndSendKeys(SEARCH_INPUT, search_line, 10);
    }

    public void clickOnTheArticleWithSubstring(String substring) {
        String search_result_xpath = getResultSearchElement(substring);
        waitForElementAndClick(By.xpath(search_result_xpath), 10);
    }


}
