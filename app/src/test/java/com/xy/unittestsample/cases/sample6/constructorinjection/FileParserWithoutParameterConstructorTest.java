package com.xy.unittestsample.cases.sample6.constructorinjection;

import com.xy.unittestsample.cases.sample6.fake.StubExtensionManager;
import com.xy.unittestsample.sample6.base.IExtensionManager;
import com.xy.unittestsample.sample6.constructorinjection.FileParserWithoutParameterConstructor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithoutParameterConstructorTest {

    @Test
    public void testNameShorterCharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParserProxy fileParser = new FileParserProxy(fake);

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
        FileParserProxy fileParser = new FileParserProxy(fake);

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
        FileParserProxy fileParser = new FileParserProxy(fake);

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
        FileParserProxy fileParser = new FileParserProxy(fake);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    private class FileParserProxy extends FileParserWithoutParameterConstructor {

        public FileParserProxy(IExtensionManager fileExtensionManager) {
            super(fileExtensionManager);
        }
    }
}
