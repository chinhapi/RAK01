package features.testng.jira;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class testJira {
    @BeforeClass
    public void beforeClass() {
        RestAssured.baseURI = "https://testingvn.atlassian.net";
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-Type", "application/java").build();
        RestAssured.requestSpecification = requestSpecification;

    }

    @Test
    public void getPost() {
//        Response createResp = postBug();
        given().log().all()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn", "rjIMfEAPNX0dVSsLrSsADAF6")
                .get("/rest/api/2/issue/API1-42")
                .then()
                .statusCode(200)
                .assertThat()
                .body("fields.status.name", is("To Do"));
    }

    @Test
    public void postBug() {
        given().log().all()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn", "rjIMfEAPNX0dVSsLrSsADAF6")
                .body("{ \n" +
                        "  \"fields\": \n" +
                        "  {\n" +
                        "    \"project\": \n" +
                        "      {\n" +
                        "        \"key\":\"API1\"\n" +
                        "      },\n" +
                        "    \"summary\": \"REST-API for adding new issue sample 01\",\n" +
                        "    \"description\": \"Creating my first bug 01\",\n" +
                        "    \"issuetype\": \n" +
                        "      {\n" +
                        "      \"name\": \"Bug\"\n" +
                        "      }\n" +
                        "  }\n" +
                        "}")
                .when()
                .post("/rest/api/2/issue")
                .then().log().all()
                .statusCode(201);
    }
//    @Test
//    public Response ffff(String summary){
//        given().log().all()
//                .contentType("application/json")
//                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
//                .body(" Strn{ \n" +
//                        "  \"fields\": \n" +
//                        "  {\n" +
//                        "    \"project\": \n" +
//                        "      {\n" +
//                        "        \"key\":\"API1\"\n" +
//                        "      },\n" +
//                        "    \"summary\": \%s\",\n" +
//                        "    \"description\": \"Creating my first bug 01\",\n" +
//                        "    \"issuetype\": \n" +
//                        "      {\n" +
//                        "      \"name\": \"Bug\"\n" +
//                        "      }\n" +
//                        "  }\n" +
//                        "}", summary)
//                .when()
//                .post("/rest/api/2/issue")
//                .then().log().all()
//                .statusCode(201);
//    }

    @Test
    public void assignPost(){
        given().log().all()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
                .body("{\"name\":\"api\"}")
                .when()
                .put("rest/api/2/issue/API1-33/assignee")
                .then().log().all()
                .statusCode(204);
    }

    @Test
    public void getTransition(){
        given()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
                .when()
                .get("rest/api/2/issue/API1-33/transitions")
                .then().log().all()
                .statusCode(200);
    }

    @Test
    public void doTransition(){
        given().log().all()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
                .body("{\n" +
                        "    \"update\": {\n" +
                        "        \"comment\": [\n" +
                        "            {\n" +
                        "                \"add\": {\n" +
                        "                    \"body\": \"Comment added when resolving issue\"\n" +
                        "                }\n" +
                        "            }\n" +
                        "        ]\n" +
                        "    },\n" +
                        "    \"transition\": {\n" +
                        "        \"id\": \"5\"\n" +
                        "    }\n" +
                        "}\n")
                .when()
                .put("rest/api/2/issue/API1-33/transitions")
                .then().log().all()
                .statusCode(204);
    }
    @Test
    public void addComment(){
        given().log().all()
                .contentType("application/json")
                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
                .body("{ \n" +
                        "\t\"body\": \"Comment added\"\n" +
                        "}")
                .when()
                .post("rest/api/2/issue/API1-33/comment")
                .then().log().all()
                .statusCode(201);
    }

//    @Test
//    public void addNewPost(){
//        Response response = given().log().all()
//                .contentType("application/json")
//                .auth().preemptive().basic("api@testing.edu.vn","oZPGNRhPgk1jA6fRX29KF3BB")
//                .post("/rest/greenhopper/1.0/sprint/9  ");
//    }

    @Test(enabled = false)
    public void test1(){
//        RestAssured.baseURI="https://testingvn.atlassian.net";
//        given().
//                param("username","api@testing.edu.vn")
//                .param("password","@pitesting!2345")
//                .contentType("appplication/json")
//                .when()
//                .post("/rest/auth/1/session")
//                .then()
//                .statusCode(200)
//                .log().all();
//       System.out.println();
    }



}
