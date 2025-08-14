package api_tests;

import dto.ErrorMessageDto;
import dto.TokenDto;
import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import java.time.LocalDate;

import static utils.RandomUtils.genEmail;
import static utils.RandomUtils.genPassword;

public class LoginRestTests extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test(groups="str")
    public void API_LOG_P_01_test() {
        logger.info("Log in with Registered Email, 200 OK");

        User user = User.builder()
                .username(genEmail(15))
                .password(genPassword(12))
                .build();
        Response response0 = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response0, user, "Precondition: register");
        Response response = requestRegLogin(user, LOGIN_URL);
        logResponse(response, user, "Log in with credentials");
        TokenDto tokenDto = response.body().as(TokenDto.class);
        softAssert.assertEquals(response.getStatusCode(), 200, "API_LOG_P_01(), status");
        softAssert.assertTrue(tokenDto.toString().contains("token"), "API_LOG_P_01(), token");
        softAssert.assertFalse(response.getBody().asString().contains("password"), "API_LOG_P_01(), no password");
        softAssert.assertAll();
    }

    @Test(groups="str")
    public void API_LOG_N_01_test() {
        // Bug found: Schema Validation, BUG_API_07
        logger.info("Log in with Unregistered Email, 401 Unauthorized");

        User user = User.builder()
                .username(genEmail(15))
                .password(genPassword(12))
                .build();
        Response response = requestRegLogin(user, LOGIN_URL);
        logResponse(response, user, "Log in with credentials");
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 401, "API_LOG_N_01(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_LOG_N_01(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 401, "API_LOG_N_01(), status code body");
        softAssert.assertEquals(errorMessageDto.getError(), "Unauthorized", "API_LOG_N_01(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "Login or Password incorrect", "API_LOG_N_01(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/login/usernamepassword"), "API_LOG_N_01(), path");
        softAssert.assertAll();
    }

    @Test(groups="str")
    public void API_LOG_N_02_test() {
        // Bug found: Schema Validation, BUG_API_08
        logger.info("Log in with Registered Email but Incorrect Password, 401 Unauthorized");

        User user = User.builder()
                .username(genEmail(15))
                .password(genPassword(12))
                .build();
        Response response0 = requestRegLogin(user, REGISTRATION_URL);
        logResponse(response0, user, "Precondition: register");
        user.setPassword(genPassword(12));
        Response response = requestRegLogin(user, LOGIN_URL);
        logResponse(response, user, "Log in with credentials");
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 401, "API_LOG_N_02(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_LOG_N_02(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 401, "API_LOG_N_02(), status code body");
        softAssert.assertEquals(errorMessageDto.getError(), "Unauthorized", "API_LOG_N_02(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "Login or Password incorrect", "API_LOG_N_02(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/login/usernamepassword"), "API_LOG_N_02(), path");
        softAssert.assertAll();
    }
}
