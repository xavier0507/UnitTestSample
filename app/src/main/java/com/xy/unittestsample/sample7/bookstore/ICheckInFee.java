package com.xy.unittestsample.sample7.bookstore;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public interface ICheckInFee {
    int getFee(Customer customer);

    double getDiscountedFee(Customer customer);
}
