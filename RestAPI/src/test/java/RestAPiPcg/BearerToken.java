package RestAPiPcg;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerToken {
	@Test
	public void two() {

		RestAssured.baseURI = "https://api.github.com";
		RestAssured.basePath="/users/tanmay4510/repos";
		RequestSpecification requestspec = RestAssured.given();

		requestspec.header("Authorization", "Bearer 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");

		Response response=requestspec.get();

		JsonPath jsonpath = response.jsonPath(); 
		String reposname = jsonpath.getString("name");

		System.out.println(reposname);

		Assert.assertEquals(response.statusCode(),200);
		
	}
	

}
