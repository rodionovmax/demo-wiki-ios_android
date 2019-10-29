package com.demo.ui.test.factories;

import com.demo.ui.test.DeviceCapabilities;
import com.demo.ui.test.android.AndroidSearchPageObject;
import com.demo.ui.test.ios.iOSSearchPageObject;
import com.demo.ui.test.pageobjects.SearchPageObject;
import io.appium.java_client.AppiumDriver;

import static com.demo.ui.test.DeviceCapabilities.devicePlatform;

public class SearchPageObjectFactory {

    public static SearchPageObject get(AppiumDriver driver) {
        if (devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)) {
            return new AndroidSearchPageObject(driver);
        } else {
            return new iOSSearchPageObject(driver);
        }
    }
}
