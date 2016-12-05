package com.xy.unittestsample.cases.sample4.fake;

import com.xy.unittestsample.sample4.refactoring.IExtensionManager;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class StubExtensionManager implements IExtensionManager {
    public boolean shouldExtensionsBeValid;

    @Override
    public boolean isValid(String fileName) {
        return this.shouldExtensionsBeValid;
    }
}
