package RestAPiPcg;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class jsonfinder {
	
	@Test
	void test() {
 baseURI = "https://reqres.in/api";
		 
		 given().header("x-api-key","reqres_b56256404b7943f59d32465da00ecb42")
		 .get("/users?page=2")
		 .then().statusCode(200)
		 .body("data[4].first_name", equalTo("George"))
		 .body("data.first_name",hasItems("George","Rachel"));
	}
 
}
