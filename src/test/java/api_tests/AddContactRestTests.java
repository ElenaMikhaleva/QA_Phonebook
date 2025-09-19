package api_tests;

import data_providers.UserDP;
import dto.Contact;
import dto.ContactsListDto;
import dto.ErrorMessageDto;
import dto.ResponseMessageDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import manager.ContactController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import java.time.LocalDate;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static utils.PropertiesReader.getProperty;
import static utils.RandomUtils.*;

public class AddContactRestTests extends ContactController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test(groups = "str")
    public void API_ADD_P_01_test() {
        logger.info("Add contact with valid data, 200 OK");

        Contact contact = Contact.builder()
                .id("1")
                .name(genUpperCase(1) + genLowerCase(5))
                .lastName(genUpperCase(1) + genLowerCase(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genUpperCase(1) + genLowerCase(5))
                .description(genUpperCase(1) + genLowerCase(5))
                .build();
        Response response = requestCreateContact(contact);
        logResponseContact(response, contact, "valid data");
        response
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("ResponseMessageDtoSchema.json"))
                ;
        ResponseMessageDto responseMessageDto = response.body().as(ResponseMessageDto.class);
        softAssert.assertTrue(responseMessageDto.getMessage().contains("Contact was added! ID: "));
        String id = responseMessageDto.getMessage().substring(23, 59);
        if (response.getStatusCode()==200) {
            softAssert.assertTrue(validateContactInContacts(id, contact), "Contact is in the list");
        }
        softAssert.assertAll();
    }

    @Test(groups = "str")
    public void API_ADD_P_02_test() {
        logger.info("Add contact with existing name, 200 OK");

        Response response = requestGetContacts();
        ContactsListDto contactsListDto = response.body().as(ContactsListDto.class);
        String name = contactsListDto.getContacts()[0].getName();
        Contact contact = Contact.builder()
                .id("1")
                .name(name)
                .lastName(genUpperCase(1) + genLowerCase(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genUpperCase(1) + genLowerCase(5))
                .description(genUpperCase(1) + genLowerCase(5))
                .build();
        Response response2 = requestCreateContact(contact);
        logResponseContact(response2, contact, "existing name");
        response2
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("ResponseMessageDtoSchema.json"))
        ;
        ResponseMessageDto responseMessageDto = response2.body().as(ResponseMessageDto.class);
        softAssert.assertTrue(responseMessageDto.getMessage().contains("Contact was added! ID: "));
        String id = responseMessageDto.getMessage().substring(23, 59);
        if (response2.getStatusCode()==200) {
            softAssert.assertTrue(validateContactInContacts(id, contact), "Contact is in the list");
        }
        softAssert.assertAll();
    }

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "validNames")
    public void API_ADD_P_03_test(String name, String descr) {
        logger.info("Add contact with valid name, 200 OK");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(name)
                .lastName(genUpperCase(1) + genLowerCase(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genUpperCase(1) + genLowerCase(5))
                .description(genUpperCase(1) + genLowerCase(5))
                .build();
        Response response = requestCreateContact(contact);
        logResponseContact(response, contact, descr);
        response
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("ResponseMessageDtoSchema.json"))
        ;
        ResponseMessageDto responseMessageDto = response.body().as(ResponseMessageDto.class);
        softAssert.assertTrue(responseMessageDto.getMessage().contains("Contact was added! ID: "));
        String id = responseMessageDto.getMessage().substring(23, 59);
        if (response.getStatusCode()==200) {
            softAssert.assertTrue(validateContactInContacts(id, contact), "Contact is in the list");
        }
        softAssert.assertAll();
    }

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "validAddresses")
    public void API_ADD_P_08_test(String address, String descr) {
        logger.info("Add contact with valid addresses, 200 OK");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(genLetters(5))
                .lastName(genLetters(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(address)
                .description(genUpperCase(1) + genLowerCase(5))
                .build();
        Response response = requestCreateContact(contact);
        logResponseContact(response, contact, descr);
        response
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("ResponseMessageDtoSchema.json"))
                ;
        ResponseMessageDto responseMessageDto = response.body().as(ResponseMessageDto.class);
        softAssert.assertTrue(responseMessageDto.getMessage().contains("Contact was added! ID: "));
        String id = responseMessageDto.getMessage().substring(23, 59);
        if (response.getStatusCode()==200) {
            softAssert.assertTrue(validateContactInContacts(id, contact), "Contact is in the list");
        }
        softAssert.assertAll();
    }

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "emptyDescription")
    public void API_ADD_P_11_test(String description, String descr) {
        logger.info("Add contact without description, 200 OK");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(genLetters(5))
                .lastName(genLetters(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genLetters(5))
                .description(description)
                .build();
        Response response = requestCreateContact(contact);
        logResponseContact(response, contact, descr);
        response
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("ResponseMessageDtoSchema.json"))
        ;
        ResponseMessageDto responseMessageDto = response.body().as(ResponseMessageDto.class);
        softAssert.assertTrue(responseMessageDto.getMessage().contains("Contact was added! ID: "));
        String id = responseMessageDto.getMessage().substring(23, 59);
        if (response.getStatusCode()==200) {
            softAssert.assertTrue(validateContactInContacts(id, contact), "Contact is in the list");
        }
        softAssert.assertAll();
    }

    @Test(groups = "str")
    public void API_ADD_N_01_test() {
//        Bug found: status code 403 instead of 401, BUG_ADD_API_01
        logger.info("Add contact without authentication, 401 Unauthorized");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(genLetters(5))
                .lastName(genLetters(5))
                .email(genEmail(14))
                .phone(genDigits(12))
                .address(genLetters(5))
                .description(genLetters(5))
                .build();
        Response response = given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(contact)
                .when()
                .post(ADD_CONTACT_URL)
                .thenReturn()
                ;
        logResponseContact(response, contact, "without authentication");
        response
                .then()
                .statusCode(401)
                .body(matchesJsonSchemaInClasspath("ErrorMessageDtoSchema.json"))
        ;
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 401, "status code");
        softAssert.assertEquals(errorMessageDto.getError(), "Unauthorized", "status line");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "User is unauthorized", "message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/contacts"), "path");
        softAssert.assertAll();
    }

    @Test(groups = "str", dataProviderClass = UserDP.class, dataProvider = "invalidPhone")
    public void API_ADD_N_13_test(String phone, String descr) {
        logger.info("Add contact with invalid phone, 400");

        Contact contact = Contact.builder()
                .id(genDigits(3))
                .name(genLetters(5))
                .lastName(genLetters(5))
                .email(genEmail(14))
                .phone(phone)
                .address(genLetters(5))
                .description(genLetters(5))
                .build();
        Response response = requestCreateContact(contact);
        logResponseContact(response, contact, descr);
        response
                .then()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath("ErrorMessageDtoSchema.json"))
        ;
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 400, "status code");
        softAssert.assertEquals(errorMessageDto.getError(), "Bad Request", "status line");
        softAssert.assertEquals(errorMessageDto.getMessage().toString(), "{phone=Phone number must contain only digits! And length min 10, max 15!}", "message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/contacts"), "path");
        softAssert.assertAll();
    }
}
