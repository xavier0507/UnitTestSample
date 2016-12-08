package com.xy.unittestsample.cases.sample7.bookstore;

import com.xy.unittestsample.sample7.bookstore.BookStore;
import com.xy.unittestsample.sample7.bookstore.Customer;
import com.xy.unittestsample.sample7.bookstore.ICheckInFee;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class BookStoreWithMockitoAnnotationTest {
    @Mock
    private ICheckInFee mockCheckInFee;

    private BookStore bookStore;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCheckInFeeNotVIP() throws Exception {
        // Arrange
        this.bookStore = new BookStore(this.mockCheckInFee);

        // Act
        this.bookStore.checkInFee(this.getCustomers());

        // Assert
        Mockito.verify(mockCheckInFee, Mockito.times(2)).getFee(Mockito.any(Customer.class));
    }

    @Test
    public void testCheckInFeeIsVIP() throws Exception {
        // Arrange
        this.bookStore = new BookStore(this.mockCheckInFee);

        // Act
        this.bookStore.checkInFee(this.getCustomers());

        // Assert
        Mockito.verify(mockCheckInFee, Mockito.times(4)).getDiscountedFee(Mockito.any(Customer.class));
    }

    @Test
    public void testGetIncome() throws Exception {
        // Arrange
        Mockito.when(this.mockCheckInFee.getFee(Mockito.any(Customer.class))).thenReturn(1000);
        Mockito.when(this.mockCheckInFee.getDiscountedFee(Mockito.any(Customer.class))).thenReturn(1000 * 0.8);
        BookStore bookStore = new BookStore(this.mockCheckInFee);

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
