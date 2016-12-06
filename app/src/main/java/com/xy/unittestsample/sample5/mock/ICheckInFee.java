package com.xy.unittestsample.sample5.mock;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public interface ICheckInFee {
    int getFee(Customer customer);

    double getDiscountedFee(Customer customer);
}
