package RestAPiPcg;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;


public class BearerToken2 {
	
	@Test
	public void test() {
		
		RestAssured.baseURI="https://api.github.com";
		String ep = "/users/tanmay4510/repos";
    	String token = "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";
		ResponseOptions res2=(ResponseOptions) RestAssured
		.given()
		.auth().oauth2(token)
		.get(ep).getBody();
		System.out.println(res2.toString());

	}

}
