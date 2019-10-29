package com.demo.ui.test.android;

import com.demo.ui.test.pageobjects.ArticlePageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidArticlePageObject extends ArticlePageObject {

    static {
        OPTIONS_BUTTON = By.xpath("//android.widget.ImageView[@content-desc='More options']");
        OPTIONS_ADD_TO_MY_LIST_BUTTON = By.xpath("//*[@text='Add to reading list']");
        ADD_TO_MY_LIST_OVERLAY = By.id("org.wikipedia:id/onboarding_button");
        CREATE_NEW_READING_LIST = By.id("org.wikipedia:id/create_button");
        MY_LIST_NAME_INPUT = By.id("org.wikipedia:id/text_input");
        MY_LIST_OK_BUTTON = By.xpath("//*[@resource-id='android:id/button1'][@text='OK']");
        CLOSE_ARTICLE_BUTTON = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    }

    public AndroidArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
