package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertTrueTest {

    @Test
    public void testAssertTrue() throws Exception {
        boolean actualTrue = true;

        assertTrue(actualTrue);
    }

    @Test
    public void testAssertFalse() throws Exception {
        boolean actualFalse = false;

        assertFalse(actualFalse);
    }

    @Test
    public void testAssertFalseWithMessage() throws Exception {
        boolean actualTrue = true;

        assertFalse("測試失敗", actualTrue);
    }
}
