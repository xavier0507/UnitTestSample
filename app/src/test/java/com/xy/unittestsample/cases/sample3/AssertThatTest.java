package com.xy.unittestsample.cases.sample3;

import com.xy.unittestsample.sample3.AppendWordAndContent;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class AssertThatTest {
    private AppendWordAndContent appendWordAndContent;

    @Before
    public void setUp() throws Exception {
        this.appendWordAndContent = new AppendWordAndContent();
    }

    @Test
    public void testOutputHasLineNumbersCase1WithAssertTrue() throws Exception {
        // Arrange
        String content = "這是assertThat的測試案例。";

        // Act
        String output = this.appendWordAndContent.appendWordAndContent("1st", content);

        // Assert
        assertTrue(output.indexOf("1st") != -1);
    }

    @Test
    public void testOutputHasLineNumbersCase1WithAssertThat() throws Exception {
        // Arrange
        String content = "這是assertThat的測試案例。";
        int NO_RESULT = -1;

        // Act
        String output = this.appendWordAndContent.appendWordAndContent("1st", content);

        // Assert
        assertThat(output.indexOf("1st"), is(not(NO_RESULT)));
    }
}
