package com.xy.unittestsample.sample6.factorymethodinjection;

import com.xy.unittestsample.sample6.base.FileExtensionManagerImp;
import com.xy.unittestsample.sample6.base.FileHelper;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithFactoryMethodInjection {

    protected IExtensionManager getExtensionManager() {
        return new FileExtensionManagerImp();
    }

    public boolean isValidLogFileName(String fileName) {
        return getExtensionManager().isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
