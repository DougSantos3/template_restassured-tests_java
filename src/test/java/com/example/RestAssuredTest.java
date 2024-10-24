package com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

public class RestAssuredTest {

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        Assertions.assertEquals(200, response.statusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
