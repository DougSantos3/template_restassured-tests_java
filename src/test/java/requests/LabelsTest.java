package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://api.trello.com/1/members/{id}/notificationsChannelSettings?key=APIKey&token=APIToken");
        Assertions.assertEquals(200, response.statusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
