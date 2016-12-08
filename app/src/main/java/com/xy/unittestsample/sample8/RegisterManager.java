package com.xy.unittestsample.sample8;

/**
 * Created by Xavier Yin on 12/8/16.
 */

public class RegisterManager {
    private IEmailRegister emailRegister;
    private IMobileRegister mobileRegister;

    public RegisterManager(IEmailRegister emailRegister, IMobileRegister mobileRegister) {
        this.emailRegister = emailRegister;
        this.mobileRegister = mobileRegister;
    }

    public void register(String content) {
        if (RegistrationFormat.checkFormat(content)) {
            this.emailRegister.emailRegister();
        } else {
            this.mobileRegister.mobileRegister();
        }
    }
}
