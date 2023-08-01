package org.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.files.Payload;
import org.files.ReuseableMethods;
import org.testng.Assert;

public class BasicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// validate if Add place API is working
		// given - all input details
		// ,when, -submit the api resource ,httpmethod
		// Then - validate the responce.
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responce = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.addplace()).when().log().all().post("maps/api/place/add/json").then().assertThat()
				.statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract()
				.response().asString();

		System.out.println("******");
		// System.out.println(responce);
		JsonPath js=ReuseableMethods.rawtoJSON(responce); // for parsing JSON
		String Place_ID = js.getString("place_id");
		System.out.println(Place_ID);

		// Update place
		String expectedAddress = "70 winter walk, INDI";
		String updateResponce = given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + Place_ID + "\",\r\n" + "\"address\":\"70 winter walk, INDI\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().log().all().put("maps/api/place/update/json").then().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated")).extract().response().asString();
		System.out.println(updateResponce);
		JsonPath js1 = new JsonPath(updateResponce);
		String msg = js1.getString("msg");
		System.out.println(msg);

		String getresponce =given().log().all().queryParam("key", "qaclick123")
				.queryParam("place_id", Place_ID)
				
				.when().log().all().get("maps/api/place/get/json").then().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println(getresponce);
		JsonPath js2 = new JsonPath(getresponce);	
		String actualAddress = js2.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, expectedAddress);
		
		

	}

}
