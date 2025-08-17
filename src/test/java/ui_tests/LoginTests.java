package ui_tests;

import dto.User;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderItems;

import static pages.BasePage.clickHeaderItem;
import static utils.RandomUtils.genEmail;
import static utils.RandomUtils.genPassword;

public class LoginTests extends ApplicationManager {

    HomePage homePage;
    LoginPage loginPage;
    ContactsPage contactsPage;

    @BeforeMethod
    public void goToLoginPage() {
        homePage = new HomePage(getDriver());
        loginPage = clickHeaderItem(HeaderItems.LOGIN);
        contactsPage = new ContactsPage(getDriver());
    }

    @Test(groups = "str")
    public void UI_LOG_P_01_test() {
        logger.info("Log in with Valid Credentials");

        User user = User.builder()
                .username(genEmail(16))
                .password(genPassword(12))
                .build();
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnRegistrationBtn();
        clickHeaderItem(HeaderItems.SIGN_OUT);
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnLoginBtn();
        Assert.assertTrue(contactsPage.validateNoContacts() || contactsPage.validateContactsPresent());
    }

    @Test(groups = "str")
    public void UI_LOG_N_01_test() {
        logger.info("Log in with Unregistered Email");

        User user = User.builder()
                .username(genEmail(16))
                .password(genPassword(12))
                .build();
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnLoginBtn();
        Assert.assertTrue(loginPage.closeAlertReturnText().contains("Wrong email or password"));
    }
}
