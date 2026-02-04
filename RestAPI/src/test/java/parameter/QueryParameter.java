package parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class QueryParameter {
	
	@Test
	void test() {
 baseURI = "https://reqres.in/api";
		 
		 given().header("x-api-key","reqres_b56256404b7943f59d32465da00ecb42")
		 .queryParam("/users?page=2")
		 .then().statusCode(200)
		 .body("data[4].first_name", equalTo("George"))
		 .body("data.first_name",hasItems("George","Rachel"));
	}
 

}
