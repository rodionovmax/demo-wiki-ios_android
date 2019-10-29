package com.demo.ui.test.factories;

import com.demo.ui.test.DeviceCapabilities;
import com.demo.ui.test.android.AndroidArticlePageObject;
import com.demo.ui.test.ios.iOSArticlePageObject;
import com.demo.ui.test.pageobjects.ArticlePageObject;
import io.appium.java_client.AppiumDriver;

import static com.demo.ui.test.DeviceCapabilities.devicePlatform;

public class ArticlePageObjectFactory {

    public static ArticlePageObject get(AppiumDriver driver) {
        if (devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)) {
            return new AndroidArticlePageObject(driver);
        } else {
            return new iOSArticlePageObject(driver);
        }
    }
}
