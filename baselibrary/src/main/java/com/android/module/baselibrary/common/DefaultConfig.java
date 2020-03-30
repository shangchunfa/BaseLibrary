package com.android.module.baselibrary.common;

/**
 * Created by fa on 2020/3/30.
 */
public class DefaultConfig extends BaseConfig {
    @Override
    boolean isDebug() {
        return true;
    }

    @Override
    boolean isShowLog() {
        return true;
    }

    @Override
    boolean isSaveLog() {
        return false;
    }

    @Override
    String restartActivityName() {
        return "";
    }

    @Override
    String encryptRequestHeaderKey() {
        return "encrypt-key";
    }
}
