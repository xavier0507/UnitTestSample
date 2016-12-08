package com.xy.unittestsample.sample7.fileparser;

import java.io.File;

/**
 * Created by Xavier Yin on 11/22/16.
 */

public class FileHelper {

    public static String basenameWithoutExtension(String fileName) {
        String basename = new File(fileName).getName();

        if (basename.contains(".")) {
            basename = basename.substring(0, basename.indexOf("."));
        }

        return basename;
    }
}
