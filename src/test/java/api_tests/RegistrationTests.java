package api_tests;

import dto.User;
import io.restassured.response.Response;
import manager.AuthenticationController;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseAPI;

import static utils.RandomUtils.*;

public class RegistrationTests extends AuthenticationController implements BaseAPI {

    @Test
    public void registration_PositiveTest_200() {
        System.out.println("REQUEST");
        User user = User.builder()
                .username(generateEmail(14))
                .password("Password$123")
                .build();
        System.out.println(user);

        System.out.println("RESPONSE");
        Response response = requestRegLogin(user, REGISTRATION_URL);
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        Assert.assertEquals(response.getStatusCode(), 200, "registration_PositiveTest_200");
//        assert
//        "1. API returns 200. +
//        2. API returns token.
//        3. API doesn't return password in body or headers.
//        4. Cookies do not contain password
//        5. User is successfully registered.
//        6. User can log in with the same credentials"
    }
}
