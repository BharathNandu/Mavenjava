package org.restassured;

import org.files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJasonparseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(Payload.api());
		//Print no. of cources return by API
		int coursescount = js.getInt("courses.size()");
		
		System.out.println(coursescount);
		//Print purchas amount
		
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamount);
		
		for(int i=0;i<coursescount;i++)
		{
		String tittle =js.get("courses["+i+"].title");
		if(tittle.equalsIgnoreCase("RPA"))
		{
			int copies =js.getInt("courses["+i+"].copies");
			System.out.println("RPA" + copies);
		}
		int price =js.getInt("courses["+i+"].price");
		int copies =js.getInt("courses["+i+"].copies");
		System.out.println(tittle + price + copies);
		}
		
		// we can use getString to get the tittle also.
		
		
	}

}
