package com.xy.unittestsample.sample6.base;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileExtensionManagerImp implements IExtensionManager {

    @Override
    public boolean isValid(String fileName) {
        if (fileName == null || fileName.length() == 0) {
            throw new IllegalArgumentException("請提供檔名!");
        }

        return false;
    }
}
