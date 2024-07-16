package org.example;
import APIs.UserForgetPassword;
import APIs.UserLogin;
import APIs.GetProfile;

public class Main {
    public static void main(String[] args) {
        UserLogin Lgn = new UserLogin();
        GetProfile Gp = new GetProfile();
        UserForgetPassword f = new UserForgetPassword();
        f.ForgetPassword();
        //String tkn = Lgn.Login();
        //System.out.println(tkn);
        //Gp.UserProfile(tkn);
        //Reg.BenfuserReg();



    }
}