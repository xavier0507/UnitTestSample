package com.xy.unittestsample.cases.sample6.factorymethodinjection;

import com.xy.unittestsample.cases.sample6.fake.StubExtensionManager;
import com.xy.unittestsample.sample6.base.IExtensionManager;
import com.xy.unittestsample.sample6.factorymethodinjection.FileParserWithFactoryMethodInjection;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithFactoryMethodInjectionTest {

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        // Arrange
        final StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParserWithFactoryMethodInjection log = new FileParserWithFactoryMethodInjection() {

            @Override
            protected IExtensionManager getExtensionManager() {
                return fake;
            }
        };

        // Act
        boolean actualResult = log.isValidLogFileName("shortName.ext");

        // Assert
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtensions() throws Exception {
        // Arrange
        final StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParserWithFactoryMethodInjectionProxy log = new FileParserWithFactoryMethodInjectionProxy();
        log.extensionManager = fake;

        // Act
        boolean actualResult = log.isValidLogFileName("shortName.ext");

        // Assert
        Assert.assertTrue(actualResult);
    }

    class FileParserWithFactoryMethodInjectionProxy extends FileParserWithFactoryMethodInjection {
        public IExtensionManager extensionManager;

        @Override
        protected IExtensionManager getExtensionManager() {
            return this.extensionManager;
        }
    }
}
