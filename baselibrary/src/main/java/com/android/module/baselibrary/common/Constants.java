package com.android.module.baselibrary.common;

/**
 * 全局常量
 * Created by 发 on 2017/4/30.
 */

public class Constants {
    private static ConstantsConfig mConfig = new ConstantsConfig();

    private Constants() {
    }

    public static void setConstantsConfig(ConstantsConfig constantsConfig) {
        if (constantsConfig != null) {
            mConfig = constantsConfig;
        }
    }

    // 是否debug模式=======》打包上线改为 false
    public static final boolean isDebug = mConfig.isDebug;
    // 是否显示日志=======》打包上线改为 false
    public static final boolean isShowLog = mConfig.isShowLog;
    // 是否保存日志到本地
    public static final boolean isSaveLog = mConfig.isSaveLog;
    // Activity是否支持矢量图
    public static final boolean isCompatVectorSupport = mConfig.isCompatVectorSupport;

    // 网络连接的超时时间（秒）
    public static final int CONNECT_TIMEOUT = mConfig.CONNECT_TIMEOUT;
    // 网络数据读取的超时时间（秒）
    public static final int READ_TIMEOUT = mConfig.READ_TIMEOUT;
    // 网络数据写入的超时时间（秒）
    public static final int WRITE_TIMEOUT = mConfig.WRITE_TIMEOUT;
    // 请求超时的提示错误码
    public static final String CODE_ERROR_REQUEST = mConfig.CODE_ERROR_REQUEST;
    // 网络无连接的错误码
    public static final String CODE_NETWORK_CONNECTIONLESS = mConfig.CODE_NETWORK_CONNECTIONLESS;
    // 崩溃后要启动的Activity的全类名
    public static final String RESTART_ACTIVITY_NAME = mConfig.RESTART_ACTIVITY_NAME;
    // 存放加密密钥的Header的Key
    public static final String ENCRYPT_REQUEST_HEADER_KEY = mConfig.ENCRYPT_REQUEST_HEADER_KEY;

}
