package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertEqualsTest {

    @Test
    public void testAssertEquals() throws Exception {
        String s1 = new String("Test");
        String s2 = new String("Test");

        assertEquals(s1, s2);
    }

    @Test
    public void testAssertEqualsWithMessage() throws Exception {
        String s1 = new String("Test1");
        String s2 = new String("Test2");

        assertEquals("測試結果", s1, s2);
    }
}
