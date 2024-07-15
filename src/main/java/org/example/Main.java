package org.example;


import APIs.SP_Login;

public class Main {
    public static void main(String[] args) {
        SP_Login Func1 = new SP_Login();

        String result= Func1.Login("Ahmed50","Ahmed50#");
        System.out.println(result);
        Func1.UserProfile(result);


       //String result= Func1.ForgetPassword("Test50@grr.la");


    }
}