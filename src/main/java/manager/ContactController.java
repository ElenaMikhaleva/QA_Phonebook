package manager;

import dto.Contact;
import dto.ContactsListDto;
import dto.TokenDto;
import dto.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import utils.BaseAPI;

import static io.restassured.RestAssured.given;
import static utils.PropertiesReader.getProperty;

public class ContactController implements BaseAPI {

    public Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    protected TokenDto tokenDto;

    public boolean validateContactInContacts(String id, Contact contact) {
        Response response = requestGetContacts();
        ContactsListDto contactsListDto = response.body().as(ContactsListDto.class);
        boolean result = false;
        for (Contact c : contactsListDto.getContacts()) {
            System.out.println(c);
            if (c.getId().equals(id)) {
                if (c.getName().equals(contact.getName()) && c.getLastName().equals(contact.getLastName()) &&
                        c.getEmail().equals(contact.getEmail()) && c.getPhone().equals(contact.getPhone()) &&
                        c.getAddress().equals(contact.getAddress()) && c.getDescription().equals(contact.getDescription())) {
                    result = true;
                }
            }
        }
        return result;
    }
    public void logResponseContact(Response response, Contact contact, String descr) {
        logger.info(descr + ", Request data: {}", contact);
        logger.info("Response status: {}", response.getStatusLine());
        logger.info("Response body:\n{}", response.getBody().asString());
    }

    @BeforeClass(alwaysRun = true)
    public void login() {
        User user = new User(getProperty("login.properties", "email"), getProperty("login.properties", "password"));
        Response response = new AuthenticationController().requestRegLogin(user, LOGIN_URL);
        if (response.getStatusCode() == 200) {
            tokenDto = response.body().as(TokenDto.class);
        } else {
            System.out.println("Smth is wrong -> " + response.getStatusLine());
        }
    }

    public Response requestGetContacts() {
        return given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .accept(ContentType.JSON)
                .header("Authorization", tokenDto.getToken())
            .when()
                .get(ALL_CONTACTS_URL)
            .thenReturn()
            ;
    }
    public Response requestCreateContact(Contact contact) {
        return given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", tokenDto.getToken())
                .body(contact)
            .when()
                .post(ADD_CONTACT_URL)
            .thenReturn()
            ;
    }
}
