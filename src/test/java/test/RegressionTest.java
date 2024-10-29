package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

public class RegressionTest {

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://api.trello.com/1/members/{id}/notificationsChannelSettings?key=APIKey&token=APIToken");
        Assertions.assertEquals(200, response.statusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
