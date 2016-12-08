package com.xy.unittestsample.sample8;

/**
 * Created by Xavier Yin on 12/8/16.
 */

public class RegistrationFormat {

    public static boolean checkFormat(String content) {
        boolean isEmail = false;

        if (content.contains("@")) {
            return isEmail;
        }

        return !isEmail;
    }
}
