package com.xy.unittestsample.sample4.refactoring;

import com.xy.unittestsample.sample4.base.FileHelper;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileParser {
    private IExtensionManager fileExtensionManager;

    public FileParser(IExtensionManager fileExtensionManager) {
        // 使用建構子注入方便傳入測試物件
        this.fileExtensionManager = fileExtensionManager;
    }

    public boolean isValidLogFileName(String fileName) {
        // 原本產生依賴的程式碼，為求方便，我直接註解來觀察差異。
        // IExtensionManager fileExtensionManager = new FileExtensionManagerImp();

        return this.fileExtensionManager.isValid(fileName) && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}
