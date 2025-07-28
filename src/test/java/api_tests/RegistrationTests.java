package api_tests;

import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;
import utils.TestNGListener;

import static utils.RandomUtils.*;

@Listeners(TestNGListener.class)

public class RegistrationTests extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void registration_PositiveTest_200() {

        User user = User.builder()
                .username(generateEmail(14))
                .password("Password$123")
                .build();
        logger.info("Request payload: {}", user);

        Response response = requestRegLogin(user, REGISTRATION_URL);

        logger.info("Response status: {}", response.getStatusLine());
        logger.info("Response headers:\n{}", response.getHeaders());
        logger.info("Response body:\n{}", response.getBody().asPrettyString());

        softAssert.assertEquals(response.getStatusCode(), 200, "registration_PositiveTest_200, expected 200(OK)");
        softAssert.assertTrue(response.getBody().asString().contains("token"), "Response should contain token");
        softAssert.assertFalse(response.getBody().asString().contains("password"), "Body should not contain password");
        softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));

        softAssert.assertAll();
    }
}
