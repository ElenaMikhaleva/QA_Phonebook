package manager;

import dto.Contact;
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

    public void logResponseChangedContact(Response response, Contact contact, String descr) {
        logger.info(descr + ", Request data: {}", contact);
        logger.info("Response status: {}", response.getStatusLine());
        logger.info("Response body:\n{}", response.getBody().asString());
    }

    public void logResponse(Response response, String descr) {
        logger.info(descr);
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
                .accept(ContentType.JSON)
                .header("Authorization", tokenDto.getToken())
                .body(contact)
            .when()
                .get(ADD_CONTACT_URL)
            .thenReturn()
            ;
    }

    public Response requestDeleteAllContacts() {
        return given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .accept(ContentType.JSON)
                .header("Authorization", tokenDto.getToken())
                .delete(DELETE_ALL_CONTACTS_URL)
                .thenReturn()
                ;
    }
}
