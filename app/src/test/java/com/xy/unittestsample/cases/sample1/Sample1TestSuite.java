package com.xy.unittestsample.cases.sample1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Xavier Yin on 12/1/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FileParserTest1.class,
        FileParserTest2.class,
        IgnoreTest.class
})
public class Sample1TestSuite {
}
