package api_tests;

import dto.ErrorMessageDto;
import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseAPI;

import java.time.LocalDate;

import static utils.RandomUtils.generateEmail;
import static utils.RandomUtils.generatePassword;

public class LoginTestsRest extends AuthenticationController implements BaseAPI {

    SoftAssert softAssert = new SoftAssert();

    @Test(groups="str")
    public void API_LOG_PWD_N_001_401() {
        logger.info("TC: Log in with existing Email but incorrect Password");

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
        ErrorMessageDto errorMessageDto = response.body().as(ErrorMessageDto.class);
        softAssert.assertEquals(response.getStatusCode(), 401, "API_LOG_PWD_N_001_401(), status code");
        softAssert.assertEquals(LocalDate.now().toString(), errorMessageDto.getTimestamp().substring(0, 10), "API_LOG_PWD_N_001_401(), timestamp");
        softAssert.assertEquals(errorMessageDto.getStatus(), 401, "API_LOG_PWD_N_001_401(), status line body");
        softAssert.assertTrue(errorMessageDto.getError().equals("Unauthorized"), "API_LOG_PWD_N_001_401(), status line body");
        softAssert.assertEquals(errorMessageDto.getMessage().get("message"), "Login or Password incorrect", "API_LOG_PWD_N_001_401(), message");
        softAssert.assertTrue(errorMessageDto.getPath().equals("/v1/user/registration/usernamepassword"), "API_LOG_PWD_N_001_401(), path");
        softAssert.assertAll();
    }
}
