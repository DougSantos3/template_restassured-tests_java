package requests.Application;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApplicationTest {

    private static final String BASE_URL = "https://api.trello.com/1";
    private final String apiKey;
    private final String apiToken;

    public ApplicationTest(String apiKey, String apiToken) {
        this.apiKey = apiKey;
        this.apiToken = apiToken;
    }

    public Response getCompliance(String applicationKey) {
        return RestAssured
                .given()
                .queryParam("key", apiKey)
                .queryParam("token", apiToken)
                .when()
                .get(BASE_URL + "/applications/" + applicationKey + "/compliance");
    }
}
