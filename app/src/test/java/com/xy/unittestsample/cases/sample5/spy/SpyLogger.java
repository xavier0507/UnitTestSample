package com.xy.unittestsample.cases.sample5.spy;

import com.xy.unittestsample.sample5.spy.ILogger;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class SpyLogger implements ILogger {
    private List<String> logMessages = new ArrayList<>();

    @Override
    public void write(Level level, String message) {
        this.logMessages.add(this.concatenated(level, message));
    }

    public boolean received(Level level, String message) {
        return this.logMessages.contains(concatenated(level, message));
    }

    private String concatenated(Level level, String message) {
        return level.getName() + ": " + message;
    }
}
