package org.example;
import APIs.userForgetPassword;
import APIs.UserLogin;
import APIs.BeneficiaryRegs;
import APIs.GetProfile;

public class Main {
    public static void main(String[] args) {
        BeneficiaryRegs Reg = new BeneficiaryRegs();
        UserLogin Lgn = new UserLogin();
        GetProfile Gp = new GetProfile();
        //userForgetPassword f = new userForgetPassword();
       // Lgn.Login();
     //   Gp.UserProfile();
       // f.ForgetPassword();
        Reg.BenfuserReg();
        
    }
}