package com.xy.unittestsample.sample7.bookstore;

import java.util.List;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class BookStore {
    private ICheckInFee checkInFee;
    private double income = 0;

    public BookStore(ICheckInFee checkInFee) {
        this.checkInFee = checkInFee;
    }

    public void checkInFee(List<Customer> customers) {
        for (Customer customer : customers) {
            boolean isVIP = customer.isVIP();

            if (isVIP) {
                this.income += this.checkInFee.getDiscountedFee(customer);
            } else {
                this.income += this.checkInFee.getFee(customer);
            }
        }
    }

    public double getIncome() {
        return income;
    }
}
