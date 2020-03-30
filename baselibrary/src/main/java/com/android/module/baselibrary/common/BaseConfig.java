package com.android.module.baselibrary.common;

/**
 * 配置类
 * Created by fa on 2020/3/30.
 */
public class BaseConfig {

    // 是否debug模式=======》打包上线改为 false
    boolean isDebug = true;
    // 是否显示日志=======》打包上线改为 false
    boolean isShowLog = true;
    // 是否保存日志到本地
    boolean isSaveLog = false;
    // Activity是否支持矢量图
    boolean isCompatVectorSupport = false;
    // 崩溃后要启动的Activity的全类名
    String RESTART_ACTIVITY_NAME = "";
    // 存放加密密钥的Header的Key
    String ENCRYPT_REQUEST_HEADER_KEY = "encrypt-key";
}
