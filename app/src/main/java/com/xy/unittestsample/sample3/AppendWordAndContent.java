package com.xy.unittestsample.sample3;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AppendWordAndContent {

    public String appendWordAndContent(String appendingWord, String content) {
        StringBuilder sb = new StringBuilder();
        sb.append(appendingWord).append(" ").append(content);

        return sb.toString();
    }
}
