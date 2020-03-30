package com.android.module.baselibrary.common;

/**
 * 配置类
 * Created by fa on 2020/3/30.
 */
public abstract class BaseConfig {
    /**
     * 是否debug模式
     */
    public abstract boolean isDebug();

    /**
     * 是否显示日志
     */
    public abstract boolean isShowLog();

    /**
     * 是否保存日志到本地
     */
    public abstract boolean isSaveLog();

    /**
     * 崩溃后重新启动的Activity全类名
     */
    public abstract String restartActivityName();

    /**
     * 存放加密密钥的Header的Key
     */
    public abstract String encryptRequestHeaderKey();
}
