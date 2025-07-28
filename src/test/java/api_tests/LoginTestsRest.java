package api_tests;

import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import static utils.RandomUtils.generateEmail;
import static utils.RandomUtils.generatePassword;

public class LoginTestsRest extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void logIn_NegativeTest_wrongPassword_401() {
        logger.info("TC: API-LOG-PWD-N-001 Log in with existing Email but incorrect Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(12))
                .build();
        requestRegLogin(user, REGISTRATION_URL);
        logger.info("Registration request payload: {}", user);
        user.setPassword(generatePassword(12));
        Response response = requestRegLogin(user, LOGIN_URL);
        logger.info("Log in request payload: {}", user);
        logResponse(response);
        softAssert.assertEquals(response.getStatusCode(), 401, "logIn_NegativeTest_wrongPassword_401");
        softAssert.assertTrue(response.getBody().asString().contains("Login or Password incorrect"), "Response should contain error message");
        softAssert.assertAll();
    }
}
