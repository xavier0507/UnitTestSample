package com.xy.unittestsample.cases.sample5.fake;

import com.xy.unittestsample.sample5.fake.Client;
import com.xy.unittestsample.sample5.fake.User;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class UserRepositoryTest {
    private Client client;
    private FakeUserRepository fake;

    @Before
    public void setUp() throws Exception {
        this.fake = new FakeUserRepository();
        this.client = new Client(this.fake);
    }

    @Test
    public void testFindByIdIsActuallyFound() throws Exception {
        // Arrange
        this.addFakeUsers();

        // Act
        User actualResult = this.client.findById(1);

        // Assert
        assertThat(actualResult.getId(), equalTo(1));
    }

    @Test
    public void testFindByIdIsNotFound() throws Exception {
        // Arrange
        this.addFakeUsers();

        // Act
        User actualResult = this.client.findById(0);

        // Assert
        assertThat(actualResult, nullValue());
    }

    @Test
    public void testFindByUserNameIsActuallyFound() throws Exception {
        // Arrange
        this.addFakeUsers();

        // Act
        User actualResult = this.client.findByUserName("Xavier3");

        // Assert
        assertThat(actualResult.getUserName(), equalTo("Xavier3"));
    }

    @Test
    public void testFindByUserNameIsNotFound() throws Exception {
        // Arrange
        this.addFakeUsers();

        // Act
        User actualResult = this.client.findByUserName("Xavier0");

        // Assert
        assertThat(actualResult, nullValue());
    }

    private void addFakeUsers() {
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setUserName("Xavier" + (i + 1));

            this.fake.save(user);
        }
    }
}
