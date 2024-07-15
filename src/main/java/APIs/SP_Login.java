package APIs;

import Requests.Payloads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.*;


public class SP_Login {

    public String token;

    public void setToken(String tokenValue) {
        // Store the token securely, for example, in an instance variable
        this.token = tokenValue;

    }

    public String getToken() {
        return "Bearer " + this.token;
    }


    @Test
    public static String Login(String username, String password) {
        RestAssured.baseURI = "https://qcapi.anma.edu.sa/Api";
        String response = given().header("Content-Type", "Application/json").body(Payloads.Login_request(username, password))
                .when().post("/WebUserAuth/AuthenticateWeb")
                .then().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(response);
        SP_Login obj = new SP_Login();
        obj.setToken(js.get("Data.Token"));
        return obj.getToken();
    }


    @Test
    public static String ForgetPassword(String Email) {
        RestAssured.baseURI = "https://qcapi.anma.edu.sa/Api";
        String response = given().header("Content-Type", "Application/json").body(Payloads.ForgetMail_request(Email))
                .when().post("WebUserAuth/ForgetPassword")
                .then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(response);
        boolean IsSucces = js.getBoolean("IsSuccess");
        return Email + " sent: " + IsSucces;

    }


    @Test
    public void UserProfile(String SP_Token) {

        GetProfile gp = given().header("Authorization", SP_Token)
                .when().log().all()
                .get("https://qcapi.anma.edu.sa/Api/BeneficiaryUser/GetUser").as(GetProfile.class);
        System.out.println(gp.getData().getFirstName());


    }

}






