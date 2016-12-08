package com.xy.unittestsample.sample7.fileparser;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class FileParser {
    private IExtensionManager fileExtensionManager;

    public FileParser(IExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }

    public boolean isValidLogFileName(String fileName) {
        return this.fileExtensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
