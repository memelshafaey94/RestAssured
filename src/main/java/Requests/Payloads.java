package Requests;

public class Payloads {

    public static String Login_request(String Username, String Password){
        return "{\n" +
                "    \"UserName\": \""+Username+"\",\n" +
                "    \"Password\": \""+Password+"\"\n" +
                "}";
    }

    public static String ForgetMail_request(String Mail){

     return   "{\n" +
             "    \"Email\": \""+Mail+"\",\n" +
             "}";


    }

}
