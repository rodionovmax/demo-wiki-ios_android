package com.demo.ui.test.factories;

import com.demo.ui.test.DeviceCapabilities;
import com.demo.ui.test.android.AndroidNavigationUI;
import com.demo.ui.test.ios.iOSNavigationUI;
import com.demo.ui.test.pageobjects.NavigationUI;
import io.appium.java_client.AppiumDriver;

import static com.demo.ui.test.DeviceCapabilities.devicePlatform;

public class NavigationUIFactory {

    public static NavigationUI get(AppiumDriver driver) {
        if(devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)){
            return new AndroidNavigationUI(driver);
        } else {
            return new iOSNavigationUI(driver);
        }
    }
}
