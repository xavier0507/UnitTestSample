package com.xy.unittestsample.cases.sample1;

import com.xy.unittestsample.sample1.FileParser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created by Xavier Yin on 12/1/16.
 */

public class BeforeClassAndAfterClassTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("beforeClass_called");
        System.out.println();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp_called");
        System.out.println();
    }

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

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown_called");
        System.out.println();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("afterClass_called");
        System.out.println();
    }
}
