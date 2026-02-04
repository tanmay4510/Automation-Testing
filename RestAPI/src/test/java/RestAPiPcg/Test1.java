package RestAPiPcg;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test1 {
    
	 @Test
	 void test_get() {
		 baseURI = "https://reqres.in/api";
		 
		 given().header("x-api-key","reqres_b56256404b7943f59d32465da00ecb42")
		 .get("/users?page=2")
		 .then().statusCode(200).log().all();
	 }
}
