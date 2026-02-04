package RestAPiPcg;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
	
	@Test
	void get_test() {
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("x-api-key","reqres_b56256404b7943f59d32465da00ecb42");
		httpRequest.baseUri("https://reqres.in/api");
		Response response = httpRequest.get("/users?page=2");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
		
	}

}
