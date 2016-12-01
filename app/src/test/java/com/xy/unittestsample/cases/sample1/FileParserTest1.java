package com.xy.unittestsample.cases.sample1;

import com.xy.unittestsample.sample1.FileParser;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created by Xavier Yin on 12/1/16.
 */

public class FileParserTest1 {

    @Test
    public void testFileNameWithCorrectSuffixInUppercaseIsConsideredValid() throws Exception {
        // Arrange
        FileParser fileParser = new FileParser();
        String fileName = "Whatever.EXE";
        boolean expectedResult = true;

        // Act
        boolean actualResult = fileParser.isValidLogFileName(fileName);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileNameWithCorrectSuffixInLowercaseIsConsideredValid() throws Exception {
        // Arrange
        FileParser fileParser = new FileParser();
        String fileName = "whatever.exe";

        // Act
        boolean actualResult = fileParser.isValidLogFileName(fileName);

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void testEmptyFileNameResultsInExceptionBeingThrown() throws Exception {
        // Arrange
        FileParser fileParser = new FileParser();
        String fileName = "";
        String expectedErrorMessage = "請提供檔名!";

        try {
            // Act
            fileParser.isValidLogFileName(fileName);
            fail("這個測試預期拋出IllegalArgumentException例外!");
        } catch (IllegalArgumentException expected) {
            // Assert
            assertEquals(expectedErrorMessage, expected.getMessage());
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testExceptionForEmptyFileNameMakesSense() throws Exception {
        FileParser fileParser = new FileParser();
        String fileName = "";
        fileParser.isValidLogFileName(fileName);
    }
}
