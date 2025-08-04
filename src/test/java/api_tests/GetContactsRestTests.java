package api_tests;

import dto.Contact;
import dto.ContactsDto;
import io.restassured.response.Response;
import manager.ContactController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import static utils.RandomUtils.*;

public class GetContactsRestTests extends ContactController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

//    @Test(groups="str")
//    public void API_ALL_P_02() {
//        logger.info("Get all contacts when user has exactly 1 contact, 200 OK");
//
//        Contact contact = Contact.builder()
//                .id("1")
//                .name(genLowerCase(8))
//                .lastName(genLowerCase(8))
//                .email(genEmail(15))
//                .phone(genDigits(8))
//                .address(genLettersDigits(5))
//                .description(genLowerCase(10))
//                .build();
//        Response response0 = requestCreateContact(contact);
//        logResponseChangedContact(response0, contact, "[precondition] Add contact");
//        Response response = requestGetContacts();
//        logResponse(response, "[precondition] Get contacts");
//        ContactsDto contactsDto = response.body().as(ContactsDto.class);
//        softAssert.assertEquals(response.getStatusCode(), 200, "API_ALL_P_02(), status");
//        softAssert.assertTrue(contactsDto.toString().contains("contacts"), "API_ALL_P_02(), token");
//        softAssert.assertAll();
//    }
}
