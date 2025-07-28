package manager;

import dto.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BaseAPI;

import static io.restassured.RestAssured.given;
import static utils.PropertiesReader.getProperty;

public class AuthenticationController implements BaseAPI {

    public Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    public void logResponse(Response response) {
        logger.info("Response status: {}", response.getStatusLine());
        logger.info("Response headers:\n{}", response.getHeaders());
        logger.info("Response body:\n{}", response.getBody().asString());
    }

    public boolean isLoginWGivenCredentialsSuccessful(User user) {
        Response response = requestRegLogin(user, LOGIN_URL);
        logger.info("\n------> LOG IN with given credentials");
        logResponse(response);
        return (response.getStatusCode()==200 && response.getBody().asString().contains("token"));
    }

    public Response requestRegLogin(User user, String url) {
        return given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .contentType(ContentType.JSON) // Content-Type: application/json
                .accept(ContentType.JSON)
                .body(user)
                .when()
                .post(url)
                .thenReturn()
                ;
    }
}
