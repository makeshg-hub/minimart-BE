package com.example.EShopping.Service;


import com.example.EShopping.Model.*;

public interface UserService {
    void newUser(User user);

    User userLogin(Login login, OTP otp);

    User forgotUserName(ForgotRequest forgotRequest);

    ForgotPasswordRequest forgotPassword(ForgotPasswordRequest forgotRequest);

    String resetPassword(ResetPassword resetPassword);

    void verifyOtp(OTP otp);

    void changeUserName(ChangeUserName changeUserName);
}
