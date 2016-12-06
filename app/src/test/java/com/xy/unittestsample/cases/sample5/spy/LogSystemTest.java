package com.xy.unittestsample.cases.sample5.spy;

import com.xy.unittestsample.sample5.spy.LogSystem;

import org.junit.Test;

import java.util.logging.Level;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/6/16.
 */

public class LogSystemTest {

    @Test
    public void testWriteEachMessageToAllTargets() throws Exception {
        // Arrange
        SpyLogger spy1 = new SpyLogger();
        SpyLogger spy2 = new SpyLogger();
        SpyLogger spy3 = new SpyLogger();
        SpyLogger spy4 = new SpyLogger();
        SpyLogger spy5 = new SpyLogger();
        LogSystem logTarget = new LogSystem(spy1, spy2, spy3, spy4, spy5);

        // Act
        logTarget.recordMessages(Level.INFO, "這些是訊息！");

        // Assert
        assertThat(spy1.received(Level.INFO, "這些是訊息！"), is(true));
        assertThat(spy2.received(Level.INFO, "這些是訊息！"), is(true));
        assertThat(spy3.received(Level.INFO, "這些是訊息！"), is(true));
        assertThat(spy4.received(Level.INFO, "這些是訊息！"), is(true));
        assertThat(spy5.received(Level.INFO, "這些是訊息！"), is(true));
    }
}
