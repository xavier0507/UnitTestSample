package com.xy.unittestsample.sample5.fake;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public interface UserRepository {
    void save(User user);

    User findById(int id);

    User findByUserName(String userName);
}
