package com.xy.unittestsample.sample6.factoryclassinjection;

import com.xy.unittestsample.sample6.base.FileExtensionManagerImp;
import com.xy.unittestsample.sample6.base.IExtensionManager;

/**
 * Created by Xavier Yin on 12/7/16.
 */

public class ExtensionManagerFactory {
    private static IExtensionManager customImplementation = null;

    public static IExtensionManager create() {
        if (customImplementation != null) {
            return customImplementation;
        }

        return new FileExtensionManagerImp();
    }

    public static void setInstance(IExtensionManager implementation) {
        customImplementation = implementation;
    }
}
