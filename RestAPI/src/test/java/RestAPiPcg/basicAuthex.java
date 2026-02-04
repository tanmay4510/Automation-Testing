package RestAPiPcg;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class basicAuthex {
	
	@Test
	public void basicAuth1() {
		RestAssured.baseURI= "https://www.postman-echo.com/";
		String response = given().log().all().auth()
				 .preemptive().basic("postman","password")
				 .when().get("basic-auth")
				 .then().log().all().assertThat().statusCode(200)
				 .extract().response().asString();

				 System.out.println(response);
	}
	@Test
	public void baiscauth2() {

		given()
		.auth()
		.preemptive()
		.basic("username", "password") .when() .get("https://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}
	
	@Test(enabled=true) 
	public void baiscauth3() {

		RestAssured.baseURI = "http://postman-echo.com"; 
		String response = given().log().all().auth().
				basic("postman", "password").when().get("basic-auth") 
				.then().log().all().assertThat().statusCode(200). 
				extract().response().asString(); 
		System.out.println(response);
	}
		

}
