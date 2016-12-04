package com.xy.unittestsample.cases.sample3;

import com.xy.unittestsample.sample3.Role;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class RoleOf extends BaseMatcher<Role> {

    @Override
    public boolean matches(Object item) {
        if (!(item instanceof Role)) {
            return false;
        }

        Role role = (Role) item;
        if (role.getId() == null || role.getId().length() == 0) {
            return false;
        }

        return role.getId().toLowerCase().startsWith("a") ? true : false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("管理人員的編號應以a為首！");
    }

    @Override
    public void describeMismatch(Object item, Description description) {
        super.describeMismatch(item, description);

        if (item == null) {
            description.appendText("物件是空的！");
        }

        Role role = (Role) item;
        description.appendText("該角色為一般人員！").appendText("員工編號為: ").appendText(role.getId());
    }
}
