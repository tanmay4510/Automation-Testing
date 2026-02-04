package RestAPiPcg;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PostRequesttest {

    @Test
    public void createUser() {

        baseURI = "https://reqres.in/api";

        String requestBody = "{\n" +
                "  \"name\": \"Tanmay\",\n" +
                "  \"job\": \"QA Engineer\"\n" +
                "}";

        given()
        .header("Content-Type", "application/json")
            .header("x-api-key","reqres_b56256404b7943f59d32465da00ecb42")
            .body(requestBody)

        .when()
            .post("https://reqres.in/api/users/2")

        .then()
            .statusCode(201)
            .log().all()
            .body("name", equalTo("Tanmay"))
            .body("job", equalTo("QA Engineer"));
    }
}