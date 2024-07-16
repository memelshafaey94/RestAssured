package APIs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class userForgetPassword {

    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    @Test
    public void ForgetPassword() {

        userForgetPassword frgt = new userForgetPassword();
        frgt.setEmail("Nadia50@grr.la");
        RestAssured.baseURI = "https://qcapi.anma.edu.sa/Api";
        String response = given().header("Content-Type", "Application/json").body(frgt)
                .when().post("WebUserAuth/ForgetPassword")
                .then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(response);
        boolean IsSucces = js.getBoolean("IsSuccess");
        System.out.println(frgt.getEmail() + " sent: " + IsSucces);

    }
}
