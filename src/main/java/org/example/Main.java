package org.example;
import APIs.userForgetPassword;
import APIs.UserLogin;
import APIs.GetProfile;

public class Main {
    public static void main(String[] args) {

        UserLogin Lgn = new UserLogin();
        GetProfile Gp = new GetProfile();
        userForgetPassword f = new userForgetPassword();
        f.ForgetPassword();
        //String tkn = Lgn.Login();
        //System.out.println(tkn);
        //Gp.UserProfile(tkn);
        //Reg.BenfuserReg();



    }
}