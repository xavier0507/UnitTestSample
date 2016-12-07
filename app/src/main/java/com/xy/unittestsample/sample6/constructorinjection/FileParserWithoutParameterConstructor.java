package com.xy.unittestsample.sample6.constructorinjection;

import com.xy.unittestsample.sample6.base.FileExtensionManagerImp;
import com.xy.unittestsample.sample6.base.FileHelper;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileParserWithoutParameterConstructor {
    private IExtensionManager fileExtensionManager;

    public FileParserWithoutParameterConstructor() {
        this(new FileExtensionManagerImp());
    }

    protected FileParserWithoutParameterConstructor(IExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }

    public boolean isValidLogFileName(String fileName) {
        return this.fileExtensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
