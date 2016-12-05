package com.xy.unittestsample.cases.sample4.constructorinjection;

import com.xy.unittestsample.cases.sample4.fake.StubExtensionManager;
import com.xy.unittestsample.sample4.refactoring.FileParser;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileParserTest {

    @Test
    public void testNameShorterCharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParser fileParser = new FileParser(fake);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParser fileParser = new FileParser(fake);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(true));
    }

    @Test
    public void testNameShorterCharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = false;
        FileParser fileParser = new FileParser(fake);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = false;
        FileParser fileParser = new FileParser(fake);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(false));
    }
}
