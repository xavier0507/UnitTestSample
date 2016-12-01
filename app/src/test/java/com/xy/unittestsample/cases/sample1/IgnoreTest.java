package com.xy.unittestsample.cases.sample1;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Xavier Yin on 12/1/16.
 */

public class IgnoreTest {

    @Test
    public void testcase1() throws Exception {
        System.out.println("testcase1_called");
        System.out.println();
    }

    @Test
    public void testcase2() throws Exception {
        System.out.println("testcase2_called");
        System.out.println();
    }

    @Test
    @Ignore
    public void testcase3() throws Exception {
        System.out.println("testcase3_called");
        System.out.println();
    }

    @Test
    public void testcase4() throws Exception {
        System.out.println("testcase4_called");
        System.out.println();
    }

    @Test
    @Ignore
    public void testcase5() throws Exception {
        System.out.println("testcase5_called");
        System.out.println();
    }
}
