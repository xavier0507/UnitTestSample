package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static junit.framework.Assert.fail;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertFailTest {

    @Test
    public void testFailWithMessage() throws Exception {
        fail("測試失敗");
    }

    @Test
    public void testFail() throws Exception {
        fail();
    }
}
