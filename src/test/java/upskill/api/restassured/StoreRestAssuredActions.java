package upskill.api.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class StoreRestAssuredActions {
	
	public void createStore(){
		
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiRequestPayloads/CreateStoreRequest.json")).
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			post("https://petstore.swagger.io/v2/store/order").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/CreateStoreResponse.json")));
	}
	
	
	
	public void getStore(){
		
		given().														//Request Payload
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			header("bearer_token", "dfvhk42687rfehdvfj2368749ruvrv44f4kyj").		//Auth
			header("username", "upskill").
			header("password", "12345").
			header("AccessKey", "upskill").											//AWS
			header("SecretKey", "mhgcht47ituykuh6457gyiutf356g").
			header("AWS Region", "us-east").
			header("Service Name", "S3").
			header("Session Token", "kulgyyrdty8745hkjhfc876756").
			get("https://petstore.swagger.io/v2/store/order/11").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/GetStoreResponse.json")));
	}
	
	public void deleteStore(){
		given().														//Request Payload
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			delete("https://petstore.swagger.io/v2/store/order/11").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/DeleteStoreResponse.json")));
	}

}
