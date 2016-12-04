package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertNullTest {

    @Test
    public void testNull() throws Exception {
        Object obj = null;

        assertNull(obj);
    }

    @Test
    public void testNotNullWithMessage() throws Exception {
        Object obj = null;

        assertNotNull("測試失敗", obj);
    }
}
