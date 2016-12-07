package com.xy.unittestsample.sample6.reflectioninjection;


import com.xy.unittestsample.sample6.base.FileExtensionManagerImp;
import com.xy.unittestsample.sample6.base.FileHelper;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithReflectionInjection {
    private IExtensionManager extensionManager;

    public FileParserWithReflectionInjection() {
        this(new FileExtensionManagerImp());
    }

    protected FileParserWithReflectionInjection(IExtensionManager extensionManager) {
        this.extensionManager = extensionManager;
    }

    public boolean isValidLogFileName(String fileName) {
        return this.extensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
