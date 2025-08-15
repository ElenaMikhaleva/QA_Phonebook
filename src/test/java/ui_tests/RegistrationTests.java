package ui_tests;

import dto.User;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderItems;

import static pages.BasePage.clickHeaderItem;
import static utils.RandomUtils.genEmail;
import static utils.RandomUtils.genPassword;

public class RegistrationTests extends ApplicationManager {

    SoftAssert softAssert = new SoftAssert();
    HomePage homePage;
    LoginPage loginPage;
    ContactsPage contactsPage;

    @BeforeMethod
    public void goToRegistrationPage() {
        homePage = new HomePage(getDriver());
        loginPage = clickHeaderItem(HeaderItems.LOGIN);
        contactsPage = new ContactsPage(getDriver());
    }

    @Test(groups = "str")
    public void UI_REG_P_01_test() {
        logger.info("Register with Valid Credentials");

        User user = User.builder()
                .username(genEmail(16))
                .password(genPassword(12))
                .build();
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnRegistrationBtn();
        Assert.assertTrue(contactsPage.validateNoContacts());
    }
}
