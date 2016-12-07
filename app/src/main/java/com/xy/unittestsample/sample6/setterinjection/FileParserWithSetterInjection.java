package com.xy.unittestsample.sample6.setterinjection;

import com.xy.unittestsample.sample6.base.FileExtensionManagerImp;
import com.xy.unittestsample.sample6.base.FileHelper;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParserWithSetterInjection {
    private IExtensionManager extensions;

    public FileParserWithSetterInjection() {
        this.extensions = new FileExtensionManagerImp();
    }

    public void setExtensionManager(IExtensionManager extensions) {
        this.extensions = extensions;
    }

    public boolean isValidLogFileName(String fileName) {
        return extensions.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
