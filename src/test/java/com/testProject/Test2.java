package com.testProject;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Test2 {
	@Test
	public void getResourceTest() {
		given()
		.auth().preemptive().basic("rupeek", "password")
		.contentType(ContentType.JSON)
		.when()
		.get("http://13.126.80.194:8080/api/v1/users/{phone}")
		.then()
		.log().all();
		
	}
}
