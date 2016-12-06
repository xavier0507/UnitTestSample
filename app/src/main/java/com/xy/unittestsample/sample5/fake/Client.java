package com.xy.unittestsample.sample5.fake;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class Client {
    private UserRepository userRepository;

    public Client(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        // 其他商業邏輯

        this.userRepository.save(user);
    }

    public User findById(int id) {
        // 其他商業邏輯

        return this.userRepository.findById(id);
    }

    public User findByUserName(String userName) {
        // 其他商業邏輯

        return this.userRepository.findByUserName(userName);
    }
}
