package org.restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.files.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class QATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		//update API
		String updateResponce = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(Payload.updateplace()).when().log().all().put("maps/api/place/update/json")
				.then().assertThat().statusCode(404).body("msg", equalTo("Update address operation failed, looks like the data doesn't exists"))
				.extract().response().asString();
		System.out.println(updateResponce);
		JsonPath js1 = new JsonPath(updateResponce);
		String msg = js1.getString("msg");
		System.out.println(msg);
	}

}
