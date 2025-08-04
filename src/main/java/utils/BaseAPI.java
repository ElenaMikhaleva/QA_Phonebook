package utils;

public interface BaseAPI {
    String LOGIN_URL = "/v1/user/login/usernamepassword";
    String REGISTRATION_URL = "/v1/user/registration/usernamepassword";
    String ALL_CONTACTS_URL = "/v1/contacts";
    String ADD_CONTACT_URL = "/v1/contacts";
    String DELETE_ALL_CONTACTS_URL = "/v1/contacts/clear";
}