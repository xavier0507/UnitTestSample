package com.xy.unittestsample.cases.sample5.mock;

import com.xy.unittestsample.sample5.mock.Customer;
import com.xy.unittestsample.sample5.mock.ICheckInFee;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class MockCheckInFee implements ICheckInFee {
    public int getFee_called_counter = 0;
    public int getDiscountedFee_called_counter = 0;

    @Override
    public int getFee(Customer customer) {
        this.getFee_called_counter++;
        return 1000;
    }

    @Override
    public double getDiscountedFee(Customer customer) {
        this.getDiscountedFee_called_counter++;
        return 1000 * 0.8;
    }
}
