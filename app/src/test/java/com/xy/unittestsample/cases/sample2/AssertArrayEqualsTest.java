package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertArrayEqualsTest {

    @Test
    public void testAssertArrayEqualsTest() throws Exception {
        String[] array1 = new String[]{"John", "Xavier", "Same", "Justin"};
        String[] array2 = new String[]{"John", "Xavier", "Same", "Justin"};

        assertArrayEquals(array1, array2);
    }
}
