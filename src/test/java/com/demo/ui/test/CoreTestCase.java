package com.demo.ui.test;

import com.demo.ui.test.pageobjects.*;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

public class CoreTestCase {

    protected AppiumDriver driver;

    protected MainPageObject main;
    protected WelcomePageObject welcomePage;
    protected SearchPageObject searchPage;
    protected ArticlePageObject articlePage;
    protected NavigationUI navigation;
    protected MyListsPageObject myLists;

    public DeviceCapabilities capabilities = new DeviceCapabilities();



    @BeforeMethod
    @Parameters({"platform", "device", "os_version"})
    public void setupAppium(@Optional("android") String platform,
                            @Optional("pixel 3a") String device,
                            @Optional("android 10.0") String os_version,
                            Method method, ITestContext context) throws Exception {

        Reports.start(method.getName());

        // Initialize driver with capabilities
        driver = capabilities.getDriver(platform, device, os_version);

        main = new MainPageObject(driver);
        welcomePage = new WelcomePageObject(driver);
        searchPage = new SearchPageObject(driver);
        articlePage = new ArticlePageObject(driver);
        navigation = new NavigationUI(driver);
        myLists = new MyListsPageObject(driver);


        rotateScreenPortrait();
        skipWelcomePageForIOSApp();
    }

    @AfterMethod
    public void tearDown(ITestResult testResult, Method method) {

        if(testResult.getStatus()==ITestResult.FAILURE){
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
    }

    protected void rotateScreenPortrait() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    protected void rotateScreenLandscape() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    private void skipWelcomePageForIOSApp() {
        if (capabilities.devicePlatform.equals(DeviceCapabilities.DevicePlatform.IOS)) {
            welcomePage.clickSkip();
        }
    }
}
