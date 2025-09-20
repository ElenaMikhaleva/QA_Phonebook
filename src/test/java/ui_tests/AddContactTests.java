package ui_tests;

import dto.Contact;
import dto.TokenDto;
import dto.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import manager.ApplicationManager;
import manager.AuthenticationController;
import manager.ContactController;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddPage;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderItems;

import static io.restassured.RestAssured.given;
import static pages.BasePage.clickHeaderItem;
import static utils.BaseAPI.ALL_CONTACTS_URL;
import static utils.BaseAPI.LOGIN_URL;
import static utils.PropertiesReader.getProperty;
import static utils.RandomUtils.*;
import static utils.RandomUtils.genLetters;

public class AddContactTests extends ApplicationManager {

    HomePage homePage;
    LoginPage loginPage;
    AddPage addPage;
    ContactsPage contactsPage;
    ContactController contactController = new ContactController();
    User user = new User(getProperty("login.properties", "email"), getProperty("login.properties", "password"));

    @BeforeMethod
    public void goToAddPage() {
        homePage = new HomePage(getDriver());
        loginPage = clickHeaderItem(HeaderItems.LOGIN);
        loginPage.fillAuthenticationForm(user);
        loginPage.clickOnLoginBtn();
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
        Response response = new AuthenticationController().requestRegLogin(user, LOGIN_URL);
        TokenDto tokenDto = response.body().as(TokenDto.class);
        Response response1 = given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .accept(ContentType.JSON)
                .header("Authorization", tokenDto.getToken())
                .when()
                .get(ALL_CONTACTS_URL)
                .thenReturn()
        ;
        contactController.logResponseContact(response1, contact, "valid data");
        System.out.println(response);
    }
}
