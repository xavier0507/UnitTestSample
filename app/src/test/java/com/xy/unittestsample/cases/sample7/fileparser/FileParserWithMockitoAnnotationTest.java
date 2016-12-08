package com.xy.unittestsample.cases.sample7.fileparser;

import com.xy.unittestsample.sample7.fileparser.FileParser;
import com.xy.unittestsample.sample7.fileparser.IExtensionManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/8/16.
 */

public class FileParserWithMockitoAnnotationTest {
    @Mock
    private IExtensionManager stubExtensionManager;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNameShorterCharactersIsValidEvenWithSupportedExtension() throws Exception {
        Mockito.when(this.stubExtensionManager.isValid(Mockito.anyString())).thenReturn(true);
        FileParser fileParser = new FileParser(this.stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        Mockito.when(this.stubExtensionManager.isValid(Mockito.anyString())).thenReturn(true);
        FileParser fileParser = new FileParser(this.stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(true));
    }

    @Test
    public void testNameShorterCharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        Mockito.when(this.stubExtensionManager.isValid(Mockito.anyString())).thenReturn(false);
        FileParser fileParser = new FileParser(this.stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        Mockito.when(this.stubExtensionManager.isValid(Mockito.anyString())).thenReturn(false);
        FileParser fileParser = new FileParser(this.stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(false));
    }
}
