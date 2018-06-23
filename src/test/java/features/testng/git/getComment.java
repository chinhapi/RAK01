package features.testng.git;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getComment {
    @BeforeMethod
    public void setUp(){
            RestAssured.baseURI="https://raw.githubusercontent.com";
    }
    @Test
    public void getListComment(){
        String body =given().log().all()
                .when()
                    .get("/gists/675504e6d8eba38766561520155d90d1/comments")
                .then()
                .log().all()
//                .body("body",equals("check!!!"));
//                .extract().jsonPath().getString("body[0]");
                .extract().jsonPath().getString("user.id");
        System.out.println(body);
    }
}
