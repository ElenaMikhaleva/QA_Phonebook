package api_tests;

import dto.ErrorMessageDto;
import dto.TokenDto;
import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;
import utils.TestNGListener;

import java.time.LocalDate;

import static utils.RandomUtils.*;

@Listeners(TestNGListener.class)

public class RegistrationTestsRest extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test(groups="str")
    public void API_REG_EML_P_001_200() {
        logger.info("TC: Register with valid credentials");

        User user = User.builder()
                .username(generateEmail(14))
                .password("Password$123")
                .build();
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        TokenDto tokenDto = response.body().as(TokenDto.class);
        softAssert.assertEquals(response.getStatusCode(), 200, "API_REG_EML_P_001_200(), code");
        softAssert.assertTrue(tokenDto.toString().contains("token"), "API_REG_EML_P_001_200(), token");
        softAssert.assertFalse(response.getBody().asString().contains("password"), "API_REG_EML_P_001_200(), contains password");
        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
        }
        softAssert.assertAll();
    }

    @Test(groups="str")
    public void API_REG_EML_P_004_200() {
        // Bug found: returns 400
        logger.info("TC: Register with Email of max length");

        User user = User.builder()
                .username( generateLettersDigits(64) + "@" + generateLettersDigits(185) + ".com")
                .password("Password$123")
                .build();
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        if (user.getUsername().length() != 254) {
            Assert.fail("Email with wrong length " + user.getUsername().length());
        } else {
            logResponse(response);
            TokenDto tokenDto = response.body().as(TokenDto.class);
            softAssert.assertEquals(response.getStatusCode(), 200, "API_REG_EML_P_004_200(), code");
            softAssert.assertTrue(tokenDto.toString().contains("token"), "API_REG_EML_P_004_200(), token");
            if (tokenDto.toString().contains("token")) {
                softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
            }
            softAssert.assertAll();
        }
    }

    @Test(groups="str")
    public void API_REG_EML_N_021_400() {
        logger.info("TC: Register with Email exceeding max length");

        User user = User.builder()
                .username( generateLettersDigits(65) + "@" + generateLettersDigits(185) + ".com")
                .password("Password$123")
                .build();
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        if (user.getUsername().length() != 255) {
            Assert.fail("Wrong email with length " + user.getUsername().length());
        } else {
            logResponse(response);
            ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
            softAssert.assertEquals(response.getStatusCode(), 400, "API_REG_EML_N_021_400(), code");
            softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_EML_N_021_400(), timestamp");
            softAssert.assertEquals(errorMessageDto.getStatus(), 400, "API_REG_EML_N_021_400(), code body");
            softAssert.assertTrue(errorMessageDto.getError().equals("Bad Request"), "API_REG_EML_N_021_400(), status line body");
            softAssert.assertEquals(errorMessageDto.getMessage().get("username"),("must be a well-formed email address"), "API_REG_EML_N_021_400(), message");
            softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_EML_N_021_400(), path");
            softAssert.assertAll();
        }
    }

    @Test(groups="str")
    public void API_REG_PWD_N_012_400() {
        logger.info("TC: Register with too short Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(7))
                .build();
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 400, "API_REG_PWD_N_012_400(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_PWD_N_012_400(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 400, "API_REG_PWD_N_012_400(), status code body");
        softAssert.assertTrue(errorMessageDto.getError().equals("Bad Request"), "API_REG_PWD_N_012_400(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("password"), " At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]", "API_REG_PWD_N_012_400(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_PWD_N_012_400(), path");
        softAssert.assertAll();
    }

    @Test(groups="str")
    public void API_REG_PWD_N_013_400() {
        // Bug found: returns 200
        logger.info("TC: Register with too long Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(16))
                .build();
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 400, "API_REG_PWD_N_013_400(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_PWD_N_013_400(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 400, "API_REG_PWD_N_013_400(), status code body");
        softAssert.assertTrue(errorMessageDto.getError().equals("Bad Request"), "API_REG_PWD_N_013_400(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("password"), " At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]", "API_REG_PWD_N_013_400(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_PWD_N_013_400(), path");
        softAssert.assertAll();
    }

    @Test(groups="str")
    public void API_REG_EXS_N_001_409() {
        // Bug found: invalid Schema
        logger.info("TC: Register with existing Email and existing Password");

        User user = User.builder()
                .username(generateEmail(14))
                .password(generatePassword(12))
                .build();
        requestRegLogin(user, REGISTRATION_URL);
        logger.info("Request data: {}", user);
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response);
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 409, "API_REG_EXS_N_001_409(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_EXS_N_001_409(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 409, "API_REG_EXS_N_001_409(), status line body");
        softAssert.assertTrue(errorMessageDto.getError().equals("Conflict"), "API_REG_EXS_N_001_409(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "User already exists", "API_REG_EXS_N_001_409(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_EXS_N_001_409(), path");
        softAssert.assertAll();
    }

}
