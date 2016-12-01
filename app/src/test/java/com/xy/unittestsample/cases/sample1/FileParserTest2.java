package com.xy.unittestsample.cases.sample1;

import com.xy.unittestsample.sample1.FileParser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created by Xavier Yin on 12/1/16.
 */

public class FileParserTest2 {
    private FileParser fileParser;

    @Before
    public void setUp() throws Exception {
        this.fileParser = new FileParser();
    }

    @Test
    public void testFileNameWithCorrectSuffixInUppercaseIsConsideredValid() throws Exception {
        // Arrange
        String fileName = "Whatever.EXE";
        boolean expectedResult = true;

        // Act
        boolean actualResult = this.fileParser.isValidLogFileName(fileName);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileNameWithCorrectSuffixInLowercaseIsConsideredValid() throws Exception {
        // Arrange
        String fileName = "whatever.exe";

        // Act
        boolean actualResult = this.fileParser.isValidLogFileName(fileName);

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void testEmptyFileNameResultsInExceptionBeingThrown() throws Exception {
        // Arrange
        String fileName = "";
        String expectedErrorMessage = "請提供檔名!";

        try {
            // Act
            this.fileParser.isValidLogFileName(fileName);
            fail("這個測試預期拋出IllegalArgumentException例外!");
        } catch (IllegalArgumentException expected) {
            // Assert
            assertEquals(expectedErrorMessage, expected.getMessage());
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testExceptionForEmptyFileNameMakesSense() throws Exception {
        String fileName = "";
        this.fileParser.isValidLogFileName(fileName);
    }

    @After
    public void tearDown() throws Exception {
        // 不建議這樣做，僅為示範。
        this.fileParser = null;
    }
}
