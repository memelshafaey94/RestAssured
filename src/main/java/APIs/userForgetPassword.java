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

public class userForgetPassword {

    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    RequestSpecification bldr = new RequestSpecBuilder().setBaseUri("https://qcapi.anma.edu.sa/Api").setContentType("Application/json").build();

    ResponseSpecification respspec = new ResponseSpecBuilder().expectStatusCode(200).build();


    @Test
    public void ForgetPassword() {

        userForgetPassword frgt = new userForgetPassword();
        frgt.setEmail("Nadia50@grr.la");
        RequestSpecification res = given().spec(bldr).body(frgt);
        Response r =  res.when().post("/WebUserAuth/ForgetPassword")
                .then().spec(respspec).extract().response();

        String response =r.asPrettyString();
        JsonPath js = new JsonPath(response);
        boolean IsSucces = js.getBoolean("IsSuccess");
        System.out.println(response);
        System.out.println(frgt.getEmail() + " sent: " + IsSucces);

    }
}
