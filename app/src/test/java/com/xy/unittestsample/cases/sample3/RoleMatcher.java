package com.xy.unittestsample.cases.sample3;

import com.xy.unittestsample.sample3.Role;

import org.hamcrest.Matcher;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class RoleMatcher {

    public static Matcher<Role> isAdmin() {
        return new RoleOf();
    }
}
