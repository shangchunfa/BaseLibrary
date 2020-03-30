package com.android.module.baselibrary.common;

/**
 * 全局常量
 * Created by 发 on 2017/4/30.
 */

public class Constants {
    private static BaseConfig mConfig = new BaseConfig();

    public static void setConfig(BaseConfig config) {
        mConfig = config;
    }

    private Constants() {
    }

    // 是否debug模式=======》打包上线改为 false
    public static boolean isDebug() {
        return mConfig.isDebug;
    }

    // 是否显示日志=======》打包上线改为 false
    public static boolean isShowLog() {
        return mConfig.isShowLog;
    }

    // 是否保存日志到本地
    public static boolean isSaveLog() {
        return mConfig.isSaveLog;
    }

    // 崩溃后要启动的Activity的全类名
    public static String restartActivityName() {
        return mConfig.RESTART_ACTIVITY_NAME;
    }

    // 存放加密密钥的Header的Key
    public static String encryptRequestHeaderKey() {
        return mConfig.ENCRYPT_REQUEST_HEADER_KEY;
    }

    // Activity是否支持矢量图
    public static final boolean isCompatVectorSupport = mConfig.isCompatVectorSupport;
    // 网络连接的超时时间（秒）
    public static final int CONNECT_TIMEOUT = 15;
    // 网络数据读取的超时时间（秒）
    public static final int READ_TIMEOUT = 100;
    // 网络数据写入的超时时间（秒）
    public static final int WRITE_TIMEOUT = 100;
    // 请求超时的提示错误码
    public static final String CODE_ERROR_REQUEST = "timeOut";
    // 网络无连接的错误码
    public static final String CODE_NETWORK_CONNECTIONLESS = "unConnect";

}
