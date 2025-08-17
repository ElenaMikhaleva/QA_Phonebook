package ui_tests;

import data_providers.UserDP;
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

public class RegistrationTests extends ApplicationManager {

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

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "invalidEmail")
    public void UI_REG_N_04_test(String email, String password, String descr) {
        logger.info("Register with Invalid Email: {}", descr);

        User user = User.builder()
                .username(email)
                .password(password)
                .build();
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnRegistrationBtn();
        String alert = loginPage.closeAlertReturnText();
        logger.info("Alert: " + alert);
        Assert.assertTrue(alert.contains("Wrong email or password format"));
    }

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "duplicateEmail")
    public void UI_REG_N_06_test(String passwordVar) {
        // Bug found: Grammar Mistake, BUG_UI_07
        logger.info("Register with Duplicate Email: {}", passwordVar);

        User user = User.builder()
                .username(genEmail(16))
                .password(genPassword(12))
                .build();
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnRegistrationBtn();
        clickHeaderItem(HeaderItems.SIGN_OUT);
        user.setPassword(genPassword(12));
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnRegistrationBtn();
        Assert.assertTrue(loginPage.closeAlertReturnText().contains("User already exists"));
    }
}
