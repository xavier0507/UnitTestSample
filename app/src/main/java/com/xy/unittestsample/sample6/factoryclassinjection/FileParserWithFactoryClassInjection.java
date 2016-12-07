package com.xy.unittestsample.sample6.factoryclassinjection;

import com.xy.unittestsample.sample6.base.FileHelper;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithFactoryClassInjection {
    private IExtensionManager fileExtensionManager;

    public FileParserWithFactoryClassInjection() {
        this.fileExtensionManager = ExtensionManagerFactory.create();
    }

    public boolean isValidLogFileName(String fileName) {
        return this.fileExtensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
