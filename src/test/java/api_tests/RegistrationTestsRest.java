package api_tests;

import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;
import utils.TestNGListener;

import static utils.RandomUtils.*;

@Listeners(TestNGListener.class)

public class RegistrationTestsRest extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void reg_PositiveTest_200() {
        logger.info("TC: API-REG-EML-P-001 Register with valid credentials");

        User user = User.builder()
                .username(generateEmail(14))
                .password("Password$123")
                .build();
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        softAssert.assertEquals(response.getStatusCode(), 200, "registration_PositiveTest_200");
        softAssert.assertTrue(response.getBody().asString().contains("token"), "Response should contain token");
        softAssert.assertFalse(response.getBody().asString().contains("password"), "Body should not contain password");
        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
        }
        softAssert.assertAll();
    }

    @Test
    public void reg_PositiveTest_maxEmail_200() {
        logger.info("TC: API-REG-EML-P-004 Register with Email of max length");

        User user = User.builder()
                .username( generateLettersDigits(64) + "@" + generateLettersDigits(185) + ".com")
                .password("Password$123")
                .build();
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        if (user.getUsername().length() != 254) {
            Assert.fail("Wrong email with length " + user.getUsername().length());
        } else {
            logResponse(response);
            softAssert.assertEquals(response.getStatusCode(), 200, "reg_PositiveTest_maxEmail_200");
            softAssert.assertTrue(response.getBody().asString().contains("token"), "Response should contain token");
            if (response.getBody().asString().contains("token")) {
                softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
            }
            softAssert.assertAll();
        }
    }

    @Test
    public void reg_NegativeTest_longEmail_400() {
        logger.info("TC: API-REG-EML-N-021 Register with Email exceeding max length");

        User user = User.builder()
                .username( generateLettersDigits(65) + "@" + generateLettersDigits(185) + ".com")
                .password("Password$123")
                .build();
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        if (user.getUsername().length() != 255) {
            Assert.fail("Wrong email with length " + user.getUsername().length());
        } else {
            logResponse(response);
            softAssert.assertEquals(response.getStatusCode(), 400, "reg_PositiveTest_maxEmail_200");
            softAssert.assertTrue(response.getBody().asString().contains("must be a well-formed email address"), "Response should contain error message");
            softAssert.assertAll();
        }
    }

    @Test
    public void reg_NegativeTest_shortPas_400() {
        logger.info("TC: API-REG-PWD-N-012 Register with too short Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(7))
                .build();
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        softAssert.assertEquals(response.getStatusCode(), 400, "reg_NegativeTest_shortPas_400");
        softAssert.assertTrue(response.getBody().asString().contains(" At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]"), "Response should contain error message");
        softAssert.assertAll();
    }

    @Test
    public void reg_NegativeTest_longPas_400() {
        logger.info("TC: API-REG-PWD-N-013 Register with too long Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(16))
                .build();
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        softAssert.assertEquals(response.getStatusCode(), 400, "reg_NegativeTest_longPas_400");
        softAssert.assertTrue(response.getBody().asString().contains(" At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]"), "Response should contain error message");
        softAssert.assertAll();
    }

    @Test
    public void reg_NegativeTest_existingUser_409() {
        logger.info("TC: API-REG-EXS-N-001 Register with existing Email and existing Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(12))
                .build();
        requestRegLogin(user, REGISTRATION_URL);
        logger.info("Request payload: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        softAssert.assertEquals(response.getStatusCode(), 409, "reg_NegativeTest_existingUser_409");
        softAssert.assertTrue(response.getBody().asString().contains("User already exists"), "Response should contain error message");
        softAssert.assertAll();
    }

}
