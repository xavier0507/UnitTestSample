package com.xy.unittestsample.sample4.refactoring;

/**
 * Created by Xavier Yin on 12/5/16.
 */

public class FileExtensionManagerImp implements IExtensionManager {

    @Override
    public boolean isValid(String fileName) {
        if (fileName == null || fileName.length() == 0) {
            throw new IllegalArgumentException("請提供檔名!");
        }

        // 假設需要連接資料庫、檔案系統或是網路來判斷回傳值，但為求簡單，直接回傳false，表示連接失敗。
        return false;
    }
}
