package com.xy.unittestsample.sample4.base;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileParser {

    public FileParser() {}

    public boolean isValidLogFileName(String fileName) {
        FileExtensionManager fileExtensionManager = new FileExtensionManager();

        return fileExtensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
