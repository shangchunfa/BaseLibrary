package com.android.module.baselibrary.common;

/**
 * Created by fa on 2020/3/30.
 */
public class DefaultConfig extends BaseConfig {
    @Override
    public boolean isDebug() {
        return true;
    }

    @Override
    public boolean isShowLog() {
        return true;
    }

    @Override
    public boolean isSaveLog() {
        return false;
    }

    @Override
    public String restartActivityName() {
        return "";
    }

    @Override
    public String encryptRequestHeaderKey() {
        return "encrypt-key";
    }
}
