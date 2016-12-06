package com.xy.unittestsample.sample5.spy;

import java.util.logging.Level;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class LogSystem {
    private final ILogger[] loggers;

    public LogSystem(ILogger... loggers) {
        this.loggers = loggers;
    }

    public void recordMessages(Level level, String message) {
        for (ILogger each : loggers) {
            each.write(level, message);
        }
    }
}
