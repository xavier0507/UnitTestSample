package com.xy.unittestsample.sample5.fake;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class DatabaseUserRepository implements UserRepository {

    @Override
    public void save(User user) {
        // 連接資料庫，並且將User存入資料庫中。
    }

    @Override
    public User findById(int id) {
        // 如果連接資料庫成功，則從資料庫透過Id尋找該User，找不到則回傳空物件。

        return null;
    }

    @Override
    public User findByUserName(String userName) {
        // 如果連接資料庫成功，則從資料庫透過userName尋找該User，找不到則回傳空物件。

        return null;
    }
}
