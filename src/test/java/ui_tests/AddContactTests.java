package ui_tests;

import dto.Contact;
import dto.User;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddPage;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderItems;

import static pages.BasePage.clickHeaderItem;
import static utils.RandomUtils.*;
import static utils.RandomUtils.genLetters;

public class AddContactTests extends ApplicationManager {

    HomePage homePage;
    AddPage addPage;
    ContactsPage contactsPage;

    @BeforeMethod
    public void goToLoginPage() {
        homePage = new HomePage(getDriver());
        addPage = clickHeaderItem(HeaderItems.ADD);
        contactsPage = new ContactsPage(getDriver());
    }

    @Test(groups = "str")
    public void UI_ADD_P_01_test() {
        logger.info("Add contact with valid data");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(genLetters(5))
                .lastName(genLetters(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genLetters(5))
                .description(genLetters(5))
                .build();
        addPage.fillContactForm(contact);
        clickHeaderItem(HeaderItems.SIGN_OUT);
        // assert
    }
}
