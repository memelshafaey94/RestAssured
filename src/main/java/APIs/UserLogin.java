package APIs;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class UserLogin {

    private String username;

    private String Password;

    public static String token;

    public String getUsername() {
        return username;
    }

    RequestSpecification bldr = new RequestSpecBuilder().setBaseUri("https://qcapi.anma.edu.sa/Api").setContentType("Application/json").build();

    ResponseSpecification respspec = new ResponseSpecBuilder().expectStatusCode(200).build();

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getToken() {
        return "Bearer " + this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    @Test
    public String Login() {
        UserLogin lgn = new UserLogin();
        lgn.setUsername("Ahmed50");
        lgn.setPassword("Ahmed50#");
        RequestSpecification res = given().spec(bldr).body(lgn);
        Response  r =  res.when().post("/WebUserAuth/AuthenticateWeb")
                .then().spec(respspec).extract().response();

        String response =r.asPrettyString();
        JsonPath js = new JsonPath(response);
        this.setToken(js.get("Data.Token"));
        System.out.println(this.getToken());
        System.out.println(response);
        return this.getToken();
    }
}






