package api_tests;

import data_providers.UserDP;
import dto.*;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;
import utils.TestNGListener;
import static utils.RandomUtils.*;

import java.time.LocalDate;

@Listeners(TestNGListener.class)

public class RegistrationTestsRest extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test(groups="str", dataProviderClass = UserDP.class, dataProvider = "validCredentials")
    public void API_REG_P_01(String email, String password, String descr) {
        logger.info("Register with valid credentials, 200 OK");

        User user = User.builder()
                .username(email)
                .password(password)
                .build();
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response, user, descr);
        TokenDto tokenDto = response.body().as(TokenDto.class);
        softAssert.assertEquals(response.getStatusCode(), 200, "API_REG_P_01(), status");
        softAssert.assertTrue(tokenDto.toString().contains("token"), "API_REG_P_01(), token");
        softAssert.assertFalse(response.getBody().asString().contains("password"), "API_REG_P_01(), no password");
        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
        }
        softAssert.assertAll();
    }

    @Test(groups="str", dataProviderClass = UserDP.class, dataProvider = "invalidPassword")
    public void API_REG_N_04(String email, String password, String descr) {
        logger.info("Register with Invalid Password, 400 Bad Request");

        User user = User.builder()
                .username(email)
                .password(password)
                .build();
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response, user, descr);
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 400, "API_REG_N_04(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_N_04(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 400, "API_REG_N_04(), status code body");
        softAssert.assertEquals(errorMessageDto.getError(), "Bad Request", "API_REG_N_04(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("password"), " At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]", "API_REG_N_04(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_N_04(), path");
        softAssert.assertAll();
    }

    @Test(groups="str", dataProviderClass = UserDP.class, dataProvider = "duplicateEmail")
    public void API_REG_N_05(String passwordVar) {
        logger.info("Register with Duplicate Email, 409 Conflict");

        User user = User.builder()
                .username(genEmail(12))
                .password(genPassword(12))
                .build();
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response, user, passwordVar);
        if (passwordVar.equals("newPassword")) {
            user.setPassword(genPassword(12)); // set a new password
        }
        Response response2 = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response2, user, passwordVar);
        ErrorMessageDto errorMessageDto = response2.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response2.getStatusCode(), 409, "API_REG_N_05(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_N_05(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 409, "API_REG_N_05(), status line body");
        softAssert.assertEquals(errorMessageDto.getError(), "Conflict", "API_REG_N_05(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "User already exists", "API_REG_N_05(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_N_05(), path");
        softAssert.assertAll();
    }
//
//    @Test(groups="str")
//    public void API_REG_EML_P_004_200() {
//        // Bug found: returns 400, BUG-API-REG-01
//        logger.info("TC: Register with Email of max length");
//
//        User user = User.builder()
//                .username( generateLettersDigits(64) + "@" + generateLettersDigits(185) + ".com")
//                .password("Password$123")
//                .build();
//        logger.info("Request data: {}", user);
//        Response response = requestRegLogin(user, REGISTRATION_URL);
//        if (user.getUsername().length() != 254) {
//            Assert.fail("Email with wrong length " + user.getUsername().length());
//        } else {
//            logResponse(response);
//            TokenDto tokenDto = response.body().as(TokenDto.class);
//            softAssert.assertEquals(response.getStatusCode(), 200, "API_REG_EML_P_004_200(), code");
//            softAssert.assertTrue(tokenDto.toString().contains("token"), "API_REG_EML_P_004_200(), token");
//            if (tokenDto.toString().contains("token")) {
//                softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user));
//            }
//            softAssert.assertAll();
//        }
//    }
//
//    @Test(groups="str")
//    public void API_REG_EML_N_021_400() {
//        logger.info("TC: Register with Email exceeding max length");
//
//        User user = User.builder()
//                .username( generateLettersDigits(65) + "@" + generateLettersDigits(185) + ".com")
//                .password("Password$123")
//                .build();
//        logger.info("Request data: {}", user);
//        Response response = requestRegLogin(user, REGISTRATION_URL);
//        if (user.getUsername().length() != 255) {
//            Assert.fail("Wrong email with length " + user.getUsername().length());
//        } else {
//            logResponse(response);
//            ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
//            softAssert.assertEquals(response.getStatusCode(), 400, "API_REG_EML_N_021_400(), code");
//            softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_REG_EML_N_021_400(), timestamp");
//            softAssert.assertEquals(errorMessageDto.getStatus(), 400, "API_REG_EML_N_021_400(), code body");
//            softAssert.assertTrue(errorMessageDto.getError().equals("Bad Request"), "API_REG_EML_N_021_400(), status line body");
//            softAssert.assertEquals(errorMessageDto.getMessage().get("username"),("must be a well-formed email address"), "API_REG_EML_N_021_400(), message");
//            softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_REG_EML_N_021_400(), path");
//            softAssert.assertAll();
//        }
//    }
//
//
//


}
