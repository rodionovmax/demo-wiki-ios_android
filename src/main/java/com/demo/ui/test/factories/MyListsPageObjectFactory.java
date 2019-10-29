package com.demo.ui.test.factories;

import com.demo.ui.test.DeviceCapabilities;
import com.demo.ui.test.android.AndroidMyListsPageObject;
import com.demo.ui.test.ios.iOSMyListsPageObject;
import com.demo.ui.test.pageobjects.MyListsPageObject;
import io.appium.java_client.AppiumDriver;

import static com.demo.ui.test.DeviceCapabilities.devicePlatform;

public class MyListsPageObjectFactory {

    public static MyListsPageObject get(AppiumDriver driver) {
        if(devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)){
            return new AndroidMyListsPageObject(driver);
        } else {
            return new iOSMyListsPageObject(driver);
        }
    }
}
