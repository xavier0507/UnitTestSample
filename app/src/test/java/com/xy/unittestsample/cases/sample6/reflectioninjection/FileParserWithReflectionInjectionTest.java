package com.xy.unittestsample.cases.sample6.reflectioninjection;

import com.xy.unittestsample.cases.sample6.fake.StubExtensionManager;
import com.xy.unittestsample.sample6.reflectioninjection.FileParserWithReflectionInjection;

import junit.framework.Assert;

import org.junit.Test;

import java.lang.reflect.Field;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithReflectionInjectionTest {

    @Test
    public void testOverridePrivateModifierOfField() throws Exception {
        // Arrange
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;
        FileParserWithReflectionInjection log = new FileParserWithReflectionInjection();
        this.injectToField(log, "extensionManager", fake);

        // Act
        boolean actualResult = log.isValidLogFileName("validLogFile.ext");

        // Assert
        assertTrue(actualResult);
    }

    private void injectToField(Object target, String fieldName, Object dependency) {
        try {
            Field field = target.getClass().getDeclaredField(fieldName);

            if (!field.isAccessible()) {
                field.setAccessible(true);
            }

            field.set(target, dependency);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
