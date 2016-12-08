package com.xy.unittestsample.cases.sample7.fileparser;


import com.xy.unittestsample.sample7.fileparser.FileParser;
import com.xy.unittestsample.sample7.fileparser.IExtensionManager;

import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithMockitoTest {

    @Test
    public void testNameShorterCharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        IExtensionManager stubExtensionManager = Mockito.mock(IExtensionManager.class);
        Mockito.when(stubExtensionManager.isValid(Mockito.anyString())).thenReturn(true);
        FileParser fileParser = new FileParser(stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        IExtensionManager stubExtensionManager = Mockito.mock(IExtensionManager.class);
        Mockito.when(stubExtensionManager.isValid(Mockito.anyString())).thenReturn(true);
        FileParser fileParser = new FileParser(stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(true));
    }

    @Test
    public void testNameShorterCharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        IExtensionManager stubExtensionManager = Mockito.mock(IExtensionManager.class);
        Mockito.when(stubExtensionManager.isValid(Mockito.anyString())).thenReturn(false);
        FileParser fileParser = new FileParser(stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        IExtensionManager stubExtensionManager = Mockito.mock(IExtensionManager.class);
        Mockito.when(stubExtensionManager.isValid(Mockito.anyString())).thenReturn(false);
        FileParser fileParser = new FileParser(stubExtensionManager);

        // Act
        boolean actualResult = fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        assertThat(actualResult, is(false));
    }

    @Test
    public void testVerifyIExtensionManagerCalledOneTimes() throws Exception {
        // Arrange
        IExtensionManager stubExtensionManager = Mockito.mock(IExtensionManager.class);
        Mockito.when(stubExtensionManager.isValid(Mockito.anyString())).thenReturn(false);
        FileParser fileParser = new FileParser(stubExtensionManager);

        // Act
        fileParser.isValidLogFileName("short_file_name.txt");

        // Assert
        // 當沒有指定times時，預設就是1次
        Mockito.verify(stubExtensionManager).isValid(Mockito.anyString());
        Mockito.verify(stubExtensionManager, Mockito.times(1)).isValid(Mockito.anyString());
    }
}
