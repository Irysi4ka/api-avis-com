package com.avis.tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiAvisOAuth2Test {

    String clientID = "d5f6b9af";
    String clientSecret = "e0f9c236d6347c386983df0a56008ad2";
    String tokenURL = "https://stage.abgapiservices.com/oauth/token/v1";
    String carsLocationURL = "https://stage.abgapiservices.com/cars/locations/v1";
    String accessToken;
    String fullAccessToken;
    public static final Logger logger = LogManager.getLogger();

    @Test(priority = 5)
    public void getAccessToken() {
        Response responseToken = given()
                .auth().preemptive()
                .basic(clientID, clientSecret)
                .post(tokenURL);

        responseToken.prettyPrint();
        logger.info(responseToken.prettyPrint());
        System.out.println("Status is: " + responseToken.statusCode());
        accessToken = responseToken.getBody().path("access_token");
        fullAccessToken = "Bearer " + accessToken;
        System.out.println("Access token is: " + accessToken);
        Assert.assertEquals(responseToken.statusCode(), 200);
    }

    @Test(priority = 6, dependsOnMethods = "getAccessToken")
    public void getCarsAvis() {

        Response responseCar = given()
                .param("brand", "Avis")
                .param("lat", "40.690022")
                .param("long", "-74.187506")
                .auth().none()
                .header("Authorization", fullAccessToken)
                .header("client_id", clientID)
                .contentType(ContentType.JSON)
                .when()
                .get(carsLocationURL);

        System.out.println("Status code is " + responseCar.statusCode());
        Assert.assertEquals(responseCar.statusCode(), 200);
        logger.info(responseCar.prettyPrint());
        responseCar.prettyPrint();
    }

    @Test(priority = 7, dependsOnMethods = "getAccessToken")
    public void getCarsBudget() {

        Response responseCar = given()
                .param("brand", "Budget")
                .param("lat", "42.208164")
                .param("long", "-75.982273")
                .auth().none()
                .header("Authorization", fullAccessToken)
                .header("client_id", clientID)
                .contentType(ContentType.JSON)
                .when()
                .get(carsLocationURL);

        System.out.println("Status code is " + responseCar.statusCode());
        Assert.assertEquals(responseCar.statusCode(), 200);
        logger.info(responseCar.prettyPrint());
        responseCar.prettyPrint();
    }


}
