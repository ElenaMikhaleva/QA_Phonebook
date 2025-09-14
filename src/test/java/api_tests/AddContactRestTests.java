package api_tests;

import data_providers.UserDP;
import dto.Contact;
import dto.ContactsListDto;
import dto.ResponseMessageDto;
import io.restassured.response.Response;
import manager.ContactController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import java.util.Objects;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
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

}
