package com.xy.unittestsample.cases.sample5.mock;

import com.xy.unittestsample.sample5.mock.BookStore;
import com.xy.unittestsample.sample5.mock.Customer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class BookStoreTest {

    @Test
    public void testCheckInFeeNotVIP() throws Exception {
        // Arrange
        MockCheckInFee mockCheckInFee = new MockCheckInFee();
        BookStore bookStore = new BookStore(mockCheckInFee);

        // Act
        bookStore.checkInFee(this.getCustomers());

        // Assert
        assertThat(mockCheckInFee.getFee_called_counter, equalTo(2));
        assertThat(mockCheckInFee.getDiscountedFee_called_counter, equalTo(4));
    }

    @Test
    public void testGetIncome() throws Exception {
        // Arrange
        MockCheckInFee mockCheckInFee = new MockCheckInFee();
        BookStore bookStore = new BookStore(mockCheckInFee);

        // Act
        bookStore.checkInFee(this.getCustomers());

        // Assert
        assertThat(bookStore.getIncome(), equalTo(5200.0));
    }

    private List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();
        Customer customer6 = new Customer();
        customer1.setVIP(true);
        customer2.setVIP(false);
        customer3.setVIP(false);
        customer4.setVIP(true);
        customer5.setVIP(true);
        customer6.setVIP(true);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        return customers;
    }
}
