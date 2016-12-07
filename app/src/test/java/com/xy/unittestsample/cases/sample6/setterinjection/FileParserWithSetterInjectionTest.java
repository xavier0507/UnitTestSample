package com.xy.unittestsample.cases.sample6.setterinjection;

import com.xy.unittestsample.cases.sample6.fake.StubExtensionManager;
import com.xy.unittestsample.sample6.setterinjection.FileParserWithSetterInjection;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithSetterInjectionTest {

    @Test
    public void testNameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() throws Exception {
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        FileParserWithSetterInjection log = new FileParserWithSetterInjection();
        log.setExtensionManager(fake);

        Assert.assertFalse(log.isValidLogFileName("short.ext"));
    }
}
