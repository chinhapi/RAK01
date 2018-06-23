package features.testng.fifa;

import ObjectData.Ob_worlcup;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class worlccup {
    Response response;
    @BeforeMethod
    public void setUp(){
        RestAssured.baseURI="https://raw.githubusercontent.com";
    }

    @Test
    public void groupA(){
        Response response = given().log().all()
                .when()
                .get("/openfootball/world-cup.json/master/2018/worldcup.json");
        Gson gson = new Gson();
        Ob_worlcup responseGson = gson.fromJson(response.body().asString(), Ob_worlcup.class);
        for(Ob_worlcup.Round listRound: responseGson.getRounds()){
            for (Ob_worlcup.Match listMact: listRound.getMatches()){
                if(listMact.getGroup().equals("Group A")){
                    System.out.println(new Gson().toJson(listMact));
                }
            }
        }
    }
//    @Test
//    public void getfootball(){
//        Response response = given().log().all()
//                .when()
//                .get("/openfootball/world-cup.json/master/2018/worldcup.json");
////        System.out.println(response.getBody().asString());
//        System.out.println("--------------------------");
//        List<Object> t = response.then().assertThat().extract().jsonPath().getList("rounds.matches[-6].num");
//        System.out.println("--------------------------");
//        System.out.println(t.get(t.size()-1));
//        List<Object> myList = t;
//
//        System.out.println("--------------");
//        int size = response.then().assertThat().extract().jsonPath().getList("rounds.matches.num").size();
//        List<Object> responseBody = response.then().assertThat().extract().jsonPath().getList("rounds.matches.stadium.name");
//        System.out.println(responseBody);
////        System.out.println(myList.size());
//        System.out.println(t);
////        System.out.println(size);
//    }
//
//    @Test
//    public void getStadium(){
//        Response response = given().log().all()
//                .when()
//                .get("/openfootball/world-cup.json/master/2018/worldcup.json");
//        List<List<String>> Stadiums = response.jsonPath().getList("rounds.matches.stadium.name");
//        List<String> test = new ArrayList<String>();
//        for (List<String> matches : Stadiums){
//            for(String stadium : matches ) {
//                test.add("123");
//                System.out.println(Stadiums);
//
//            }
//        }
//
//    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

}
