package RestAPiPcg;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PutRequest{
	@Test 
	public void test_put() {
		JSONObject request = new JSONObject(); 
		request.put("name", "Tanmay"); 
		request.put("Job", "SE");

    given().
      header("Content-Type", "application/json"). 
      header("x-api-key", "reqres_b56256404b7943f59d32465da00ecb42").
      body(request.toJSONString()).
      when().
      put("https://reqres.in/api/users/2"). then().
      statusCode(200).log().all();
    
	}
}