package ui_tests;

import manager.ApplicationManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AboutPage;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderItems;

import static pages.BasePage.clickHeaderItem;

public class NavigationTests extends ApplicationManager {

    SoftAssert softAssert = new SoftAssert();

    HomePage homePage;
    AboutPage aboutPage;
    LoginPage loginPage;

    @BeforeMethod
    public void goToLoginPage() {
        homePage = new HomePage(getDriver());
        aboutPage = new AboutPage(getDriver());
        loginPage = new LoginPage(getDriver());
    }

    @Test(groups = "str")
    public void EXP_NAV_01_test() {
        logger.info("Navigate with Keyboard");

        clickHeaderItem(HeaderItems.ABOUT);
        softAssert.assertTrue(homePage.validateHeaderHome());
        softAssert.assertTrue(aboutPage.validateHeaderAbout());
        softAssert.assertTrue(loginPage.validateHeaderLogin());
        softAssert.assertAll();
    }
}
