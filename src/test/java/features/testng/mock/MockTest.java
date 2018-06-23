package features.testng.mock;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class MockTest {
    @BeforeMethod
    public void setUp(){
        RestAssured.baseURI="http://jsonplaceholder.typicode.com";
    }

    @Test
    public void getSample(){

        Response resp = given().log().all()
                .when()
                .get("/posts");
        resp.then().assertThat().statusCode(200);
//        int size =resp.then().assertThat().extract().jsonPath().getList("$").size();
//        List<String>title =resp.then().assertThat().extract().jsonPath().getList("title");
//        List<Integer>ids =resp.then().assertThat().extract().jsonPath().getList("id");
//        System.out.println(title);
//        System.out.println(ids);
        resp.then().body(".",hasSize(2));
    }

    @Test
    private void postSample(){
        given()
                .param("title","foo")
                .param("body","bodar")
                .param("userId","1")
                .when()
                .post(("/posts"))
                .then().log().all()
                .statusCode(200);
    }
    @Test
    private void putSample(){
        given()
                .param("title","sample 1")
                .when()
                .put(("/posts/1"))
                .then().log().all()
                .statusCode(200);
    }
    @Test
    private void delSample(){
        given()
                .param("title","sample 1")
                .when()
                .delete(("/posts/2"))
                .then().log().all()
                .statusCode(200);
    }
}
