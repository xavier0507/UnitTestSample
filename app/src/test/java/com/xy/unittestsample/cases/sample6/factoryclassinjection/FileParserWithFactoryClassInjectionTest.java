package com.xy.unittestsample.cases.sample6.factoryclassinjection;

import com.xy.unittestsample.cases.sample6.fake.StubExtensionManager;
import com.xy.unittestsample.sample6.factoryclassinjection.ExtensionManagerFactory;
import com.xy.unittestsample.sample6.factoryclassinjection.FileParserWithFactoryClassInjection;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithFactoryClassInjectionTest {

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        ExtensionManagerFactory.setInstance(fake);

        // Act
        FileParserWithFactoryClassInjection log = new FileParserWithFactoryClassInjection();

        // Assert
        assertFalse(log.isValidLogFileName("short.exe"));
    }
}
