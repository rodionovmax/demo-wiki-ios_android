package com.demo.ui.test.tests;

import com.demo.ui.test.CoreTestCase;
import com.demo.ui.test.DeviceCapabilities;
import com.demo.ui.test.factories.ArticlePageObjectFactory;
import com.demo.ui.test.factories.MyListsPageObjectFactory;
import com.demo.ui.test.factories.NavigationUIFactory;
import com.demo.ui.test.factories.SearchPageObjectFactory;
import com.demo.ui.test.pageobjects.ArticlePageObject;
import com.demo.ui.test.pageobjects.MyListsPageObject;
import com.demo.ui.test.pageobjects.NavigationUI;
import com.demo.ui.test.pageobjects.SearchPageObject;
import org.testng.annotations.Test;

import static com.demo.ui.test.DeviceCapabilities.devicePlatform;

public class MyListTests extends CoreTestCase {

//    private static final String search_input = "Java";
    private static final String search_input = "Asics";
//    private static final String article_results_substring = "Java (programming language)";
    private static final String article_results_substring = "Japanese athletic equipment company";
    private static final String name_of_folder = "Read later";


    @Test
    public void saveArticleToMyListAndDelete() {

        // If Platform is iOS and Enable Syncing popup appears - enable it
        if (devicePlatform.equals(DeviceCapabilities.DevicePlatform.IOS)) {
            if (articlePage.isEnableSyncingPopupAppears()) {
                articlePage.clickEnableSyncing();
            }
        }

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(search_input);
        SearchPageObject.clickOnTheArticleWithSubstring(article_results_substring);

        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);

        if (devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)) {
            System.out.println("Platform was identified as: " + devicePlatform);
            ArticlePageObject.addArticleToMyList(name_of_folder);
        } else {
            System.out.println("Platform was identified as: " + devicePlatform);
            ArticlePageObject.addArticlesToMySaved();
        }

        if (devicePlatform.equals(DeviceCapabilities.DevicePlatform.IOS)) {
            if (ArticlePageObject.isLoginToSyncPopupAppears()) {
                ArticlePageObject.loginToSyncSavedArticles("Rodionovmax90", "gmiv0ak4");
            }
            if (ArticlePageObject.isEnableSyncingPopupAppears()) {
                ArticlePageObject.clickEnableSyncing();
            }
            if (ArticlePageObject.isSavedArticlesFoundPopupAppears()) {
                ArticlePageObject.clickAddArticlesToReadingList();
            }
        }


        ArticlePageObject.closeArticle();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.ClickMyList();

        MyListsPageObject MyListsPageObject = MyListsPageObjectFactory.get(driver);

        if(devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)){
            MyListsPageObject.openFolderByName(name_of_folder);
        }
        MyListsPageObject.swipeByArticleToDelete(article_results_substring);

        if(devicePlatform.equals(DeviceCapabilities.DevicePlatform.ANDROID)){
            MyListsPageObject.deleteArticlesFolder();
        }
    }

}
