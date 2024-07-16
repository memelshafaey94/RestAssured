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
        System.out.println(gp.getData().getFirstNameAr());



    }

    @Test
    public void BenfuserReg() {                                   // This function for beneficary user regestration only
        BeneficiaryRegs userProfile = new BeneficiaryRegs();
        userProfile.setMobileNumber("056610561");                 // change the mobile No.
        userProfile.setPhoneKeyId(1);
        userProfile.setUserClassificationId(1);
        userProfile.setEmail("klm02@grr.la");                      // change the Email
        userProfile.setUserName("veklm54");                        // change the username
        userProfile.setPassword("Ahmed50#");
        userProfile.setFirstNameAr("تست");
        userProfile.setMiddleNameAr("تست");
        userProfile.setLastNameAr("تست");
        userProfile.setFirstNameEn("Gwendolyn");
        userProfile.setMiddleNameEn("Madonna");
        userProfile.setLastNameEn("Castaneda");
        userProfile.setNationalID("75005560577");                  // change the National ID
        userProfile.setGender("Male");
        userProfile.setResidenceCountryId(1);
        userProfile.setCityId(2);
        userProfile.setDistrict("Nozha");
        userProfile.setEducationLevelId(7);
        userProfile.setStreet("6");
        userProfile.setBuildingNo("4");
        userProfile.setOccupation("test test 05");
        RestAssured.baseURI = "https://qcapi.anma.edu.sa/Api";
        String response = given().header("Content-Type", "Application/json").body(userProfile)
                .when().log().all().post("/WebUserAuth/BeneficiarySignup")
                .then().assertThat().statusCode(200).extract().response().asString();
System.out.println(response);


    }

}






