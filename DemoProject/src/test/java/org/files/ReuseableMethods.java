package org.files;

import io.restassured.path.json.JsonPath;

public class ReuseableMethods {

	public static JsonPath rawtoJSON(String responce)
	{
		JsonPath js = new JsonPath(responce);
		return js;
		

	}

}
