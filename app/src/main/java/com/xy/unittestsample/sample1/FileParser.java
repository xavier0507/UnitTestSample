package com.xy.unittestsample.sample1;

/**
 * Created by Xavier Yin on 12/1/16.
 */

public class FileParser {

    public boolean isValidLogFileName(String fileName) {
        if (fileName == null || fileName.length() == 0) {
            throw new IllegalArgumentException("請提供檔名!");
        }

        return fileName.toLowerCase().endsWith(".exe");
    }
}
