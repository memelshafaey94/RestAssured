package APIs;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class UserLogin {
    private String username;
    private String Password;
    public String token;

    public String getUsername() {
        return username;
    }

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

    public String Login() {
        RestAssured.baseURI = "https://qcapi.anma.edu.sa/Api";
        UserLogin lgn = new UserLogin();
        lgn.setUsername("Ahmed50");
        lgn.setPassword("Ahmed50#");
        String response = given().header("Content-Type", "Application/json").body(lgn)
                .when().post("/WebUserAuth/AuthenticateWeb")
                .then().assertThat().statusCode(200).extract().response().asPrettyString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        System.out.println(js.get().toString());
        lgn.setToken(js.get("Data.Token"));
        return lgn.getToken();

    }


}






