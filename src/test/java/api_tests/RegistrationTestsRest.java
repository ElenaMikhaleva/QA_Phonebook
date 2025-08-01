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
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user, "LOG IN with valid credentials"));
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

    @Test(groups="str")
    public void EXP_API_REG_01() {
        logger.info("Register with Capitalized Email");

        User user = User.builder()
                .username(genUpperCase(4) + genLowerCase(4) + "@gmail.com")
                .password(genPassword(12))
                .build();
        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response, user, "[1] email with original casing");

        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user, "[3.1] LOG IN with original casing"));
        }

        user.setUsername(user.getUsername().substring(0,5).toLowerCase() + user.getUsername().substring(5,8) + "@gmail.com");
        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user, "[3.2] LOG IN with different casing"));
        }

        user.setUsername(user.getUsername().substring(0,8).toLowerCase() + "@gmail.com");
        Response response2 = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response2, user, "[2.1] email with all lowercase letters");

        user.setUsername(user.getUsername().substring(0,8).toUpperCase() + "@gmail.com");
        Response response3 = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response3, user, "[2.2] email with all uppercase letters");
    }

    @Test(groups="str", dataProviderClass = UserDP.class, dataProvider = "longEmail")
    public void EXP_API_REG_02(String email, String password, String descr) {
        logger.info("Register with Long Email");

        User user = User.builder()
                .username(email)
                .password(password)
                .build();
        if (user.getUsername().length()==254 || user.getUsername().length()==255) {
            System.out.println("length" + user.getUsername().length());
            Response response = requestRegLogin(user, REGISTRATION_URL);
            logResponse(response, user, descr);
            if (response.getBody().asString().contains("token")) {
                softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user, "[3.2] LOG IN with the same credentials"));
            }
        } else System.out.println("Wrong email length: " + user.getUsername().length());
    }

    @Test(groups="str", dataProviderClass = UserDP.class, dataProvider = "differentEmails")
    public void EXP_API_REG_03(User user, String descr) {
        logger.info("Register with Various Emails");

        Response response = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response, user, descr);
        if (response.getBody().asString().contains("token")) {
            softAssert.assertTrue(isLoginWGivenCredentialsSuccessful(user, "LOG IN with the same credentials"));
        }
    }

}
