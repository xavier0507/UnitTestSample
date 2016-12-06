package com.xy.unittestsample.cases.sample5.fake;

import com.xy.unittestsample.sample5.fake.User;
import com.xy.unittestsample.sample5.fake.UserRepository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class FakeUserRepository implements UserRepository {
    private Collection<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        if (this.findById(user.getId()) == null) {
            this.users.add(user);
        }
    }

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User findByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }

        return null;
    }
}
