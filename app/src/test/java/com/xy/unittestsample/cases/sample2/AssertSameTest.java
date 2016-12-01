package com.xy.unittestsample.cases.sample2;

import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertSameTest {

    @Test
    public void testAssertSame1() throws Exception {
        // 兩個物件各分配了一個記憶體空間，所以不一樣。
        String s1 = new String("test1");
        String s2 = new String("test1");

        assertNotSame(s1, s2);
    }

    @Test
    public void testAssertSame2() throws Exception {
        // s2參照s1同一個記憶體空間，所以一樣。
        String s1 = new String("test1");
        String s2 = s1;

        assertSame(s1, s2);
    }

    @Test
    public void testAssertSame3() throws Exception {
        // s1分配了一個記憶體空間，而s2使用字串池(String pool)，所以不一樣。
        String s1 = new String("test1");
        String s2 = "test1";

        assertNotSame(s1, s2);
    }

    @Test
    public void testAssertSame4() throws Exception {
        // s1與s2都使用字串池，為了節省記憶體空間，只要字串池內的值相同，都是指向同一個記憶體空間，所以一樣。
        String s1 = "test1";
        String s2 = "test1";

        assertSame(s1, s2);
    }
}
